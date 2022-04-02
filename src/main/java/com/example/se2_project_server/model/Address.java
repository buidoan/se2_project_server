package com.example.se2_project_server.model;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
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



    private String  recivedNumber;
    private String recivedAddress;


}
