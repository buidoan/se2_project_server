package com.example.se2_project_server.service;

import com.example.se2_project_server.model.Product;
import com.example.se2_project_server.repository.ColorRepository;
import com.example.se2_project_server.repository.GenderRepository;
import com.example.se2_project_server.repository.ProductRepository;
import com.example.se2_project_server.repository.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ColorRepository colorRepository;
    @Autowired
   private GenderRepository genderRepository;
    @Autowired
    private SizeRepository sizeRepository;
    @Autowired
    private ProductRepository productRepository;
    public void initProduct(){


    }
    public Product creatNewProduct(Product product){
        return productRepository.save(product);
    }
    public List<Product> getListProduct(){
        return productRepository.findAll();
    }
    public List<Product> getProductByGender(String gender){
        return productRepository.findByGenders_GenderName(gender);
    }
    public Product getProductBySlugName(String slugName){
        return productRepository.findBySlugName(slugName);
    }
    public String updateProduct(Long id, Product product){
        if(productRepository.existsById(id)){
            Product oldProduct=productRepository.findById(id).get();
            product.setId(id);
            product.setCreate(oldProduct.getCreate());
            productRepository.save(product);
            return "Update successfull!";
        } else{
            return "Update unsuccessfully! the product does not exist!";
        }
    }
    public String deleteProductById(Long id){
        if(productRepository.existsById(id)){
            productRepository.deleteById(id);
            return "deleted successfully";
        }else{
            return "deleted unsuccessfully ! the product does not exist!";
        }
    }
}
