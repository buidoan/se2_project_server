package com.example.se2_project_server.model;

import javax.persistence.*;


@Entity
public class Gender {
    @Id


    private String genderName;



    public Gender() {

    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

}
