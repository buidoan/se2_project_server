package com.example.se2_project_server.model;

import javax.persistence.*;

@Entity
public class Size {
    @Id



    private String sizeName;



    public String getSize() {
        return sizeName;
    }

    public void setSize(String size) {
        this.sizeName = size;
    }

    public Size() {
    }
}
