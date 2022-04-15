package com.example.se2_project_server.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JsonBackReference
    @JoinColumn(name="user_id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private String recivedName;

    public Long getId() {
        return id;
    }

    public Address(User user, String recivedName, String recivedNumber, String recivedAddress) {
        this.user = user;
        this.recivedName = recivedName;
        this.recivedNumber = recivedNumber;
        this.recivedAddress = recivedAddress;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecivedName() {
        return recivedName;
    }

    public void setRecivedName(String recivedName) {
        this.recivedName = recivedName;
    }

    public Address() {
    }

    public String getRecivedNumber() {
        return recivedNumber;
    }

    public void setRecivedNumber(String recivedNumber) {
        this.recivedNumber = recivedNumber;
    }

    public String getRecivedAddress() {
        return recivedAddress;
    }

    public void setRecivedAddress(String recivedAddress) {
        this.recivedAddress = recivedAddress;
    }


    @NotEmpty(message = "recieved number is empty")
    private String  recivedNumber;
    @NotEmpty(message = "receivedAddress is empty")
    private String recivedAddress;


}
