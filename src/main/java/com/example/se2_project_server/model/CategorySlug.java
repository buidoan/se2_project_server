package com.example.se2_project_server.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CategorySlug {
    @Id
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategorySlug() {
    }
}
