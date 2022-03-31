package com.example.se2_project_server.controller;

import com.example.se2_project_server.model.Product;

import com.example.se2_project_server.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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
    @PreAuthorize("hasRole('Admin')")
    public Product add(@RequestBody Product product) {
        return productService.creatNewProduct(product);
    }
    //update product
    @PutMapping("/{id}")
        @PreAuthorize("hasRole('Admin')")
    public String updateProduct(@PathVariable(value = "id") Long id,@RequestBody Product product){
       return productService.updateProduct(id,product);
    }
    @DeleteMapping("/{id}")
        @PreAuthorize("hasRole('Admin')")
    public String deleteProduct(@PathVariable(value = "id") Long id){
       return productService.deleteProductById(id);
    }
}
