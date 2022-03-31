package com.example.se2_project_server.repository;

import com.example.se2_project_server.model.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends JpaRepository<Color,Long> {
    public Color findByColorName(String name);
}

