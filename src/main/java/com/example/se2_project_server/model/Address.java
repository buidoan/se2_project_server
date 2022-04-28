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

    private String receivedName;

    public Long getId() {
        return id;
    }

    public Address(User user, String receivedName, String receivedNumber, String receivedAddress) {
        this.user = user;
        this.receivedName = receivedName;
        this.receivedNumber = receivedNumber;
        this.receivedAddress = receivedAddress;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReceivedName() {
        return receivedName;
    }

    public void setReceivedName(String receivedName) {
        this.receivedName = receivedName;
    }

    public Address() {
    }

    public String getReceivedNumber() {
        return receivedNumber;
    }

    public void setReceivedNumber(String receivedNumber) {
        this.receivedNumber = receivedNumber;
    }

    public String getReceivedAddress() {
        return receivedAddress;
    }

    public void setReceivedAddress(String recivedAddress) {
        this.receivedAddress = recivedAddress;
    }


    @NotEmpty(message = "recieved number is empty")
    private String  receivedNumber;
    @NotEmpty(message = "receivedAddress is empty")
    private String receivedAddress;


}
