package com.example.se2_project_server.controller;

import com.example.se2_project_server.model.Product;

import com.example.se2_project_server.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    //get list product
    @GetMapping("/")
    public List<Product> getList() {
        return productService.getListProduct();
    }

    //get product detail by slug name
    @GetMapping("/find/")
    public Product getProductBySlug(@RequestParam(name = "slugName") String slugName) {
        return productService.getProductBySlugName(slugName);
    }

    //get product by gender
    @GetMapping("/category/{gender}")
    public List<Product> getListByGender(@PathVariable(name = "gender") String gender) {

        return productService.getProductByGender(gender);
    }

    //add product
    @PostMapping("/")
//    @PreAuthorize("hasRole('Admin')")
    public Product add(@Valid @RequestBody Product product) {
        return productService.creatNewProduct(product);
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;

    }

    //update product
    @PutMapping("/{id}")
//        @PreAuthorize("hasRole('Admin')")
    public String updateProduct(@PathVariable(value = "id") Long id,@Valid @RequestBody Product product){
       return productService.updateProduct(id,product);
    }
    @DeleteMapping("/{id}")
//        @PreAuthorize("hasRole('Admin')")
    public String deleteProduct(@PathVariable(value = "id") Long id){
       return productService.deleteProductById(id);
    }
}
