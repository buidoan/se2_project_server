package com.example.se2_project_server.repository;

import com.example.se2_project_server.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderRepository extends JpaRepository<Gender,Long> {
    public Gender findByGenderName(String name);
}
