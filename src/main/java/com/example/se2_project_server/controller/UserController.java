package com.example.se2_project_server.controller;

import com.example.se2_project_server.model.Product;
import com.example.se2_project_server.model.User;
import com.example.se2_project_server.model.WishListRequest;
import com.example.se2_project_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping({"/register"})
    public User registerNewUser(@RequestBody User user) {
        return userService.registerNewUser(user);
    }
//get wish list by user id
    @GetMapping("/wishlist/{id}")
    public Set<Product> getWishList(@PathVariable(name = "id") Long id) {
        return userService.getWishListByUserId(id);
    }
    //handle product to wish list
    @PostMapping("/wishlist/{id}")
    public String handleWishList(@PathVariable(name = "id") Long userId,@RequestBody WishListRequest wishListRequest){
        Long productId=wishListRequest.getProductId();
        return userService.handleWishList(userId,productId);
    }
}
