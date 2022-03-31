package com.example.se2_project_server.repository;


import com.example.se2_project_server.model.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepository extends JpaRepository<Size,Long> {
    public Size findBySizeName(String name);
}
