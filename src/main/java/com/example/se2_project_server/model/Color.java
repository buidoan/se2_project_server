package com.example.se2_project_server.model;

import javax.persistence.*;

@Entity
public class Color {
    @Id

    private String colorName;

    public Color() {
    }


    @Override
    public String toString() {
        return "Color{" +
                "colorName='" + colorName + '\'' +
                '}';
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }



}
