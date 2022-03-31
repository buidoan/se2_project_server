package com.example.se2_project_server.repository;

import com.example.se2_project_server.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

   public List<Product> findByGenders_GenderName(String gender);
public Product findBySlugName(String slugName);
}
