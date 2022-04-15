package com.example.se2_project_server.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

public class OrderPojo {
    private Long id;
    @NotNull(message = "user id is null")
    private Long userId;
    @NotNull(message = "total quantity is null ")
    private int quantity;
    @NotEmpty(message = "recived name is null")
    private String name;

    public OrderPojo(Long id, Long userId, int quantity, String name, String paymentMethod, String phoneNumber, String address, Set<OrderItemPoJo> products) {
        this.id = id;
        this.userId = userId;
        this.quantity = quantity;
        this.name = name;
        this.paymentMethod = paymentMethod;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<OrderItemPoJo> getProducts() {
        return products;
    }

    public void setProducts(Set<OrderItemPoJo> products) {
        this.products = products;
    }

    private String paymentMethod;
    private String phoneNumber;
    private String address;
    private Set<OrderItemPoJo> products;

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", userId=" + userId +
                ", quantity=" + quantity +
                ", name='" + name + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", products=" + products +
                '}';
    }
}
