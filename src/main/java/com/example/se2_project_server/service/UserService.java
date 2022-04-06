package com.example.se2_project_server.service;


import com.example.se2_project_server.model.Product;
import com.example.se2_project_server.model.Role;
import com.example.se2_project_server.model.User;
import com.example.se2_project_server.repository.ProductRepository;
import com.example.se2_project_server.repository.RoleRepository;
import com.example.se2_project_server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;

import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private ProductRepository productRepository;

    @Autowired

    private PasswordEncoder passwordEncoder;


    public User registerNewUser(User user) {
        Role role = roleRepository.findByRoleName("User");
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(role);
        user.setRole(userRoles);
        user.setUserPassword(getEncodedPassword(user.getUserPassword()));

        return userRepository.save(user);
    }

    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }

    public Set<Product> getWishListByUserId(Long id) {
        if (userRepository.existsById(id)) {
            User user = userRepository.findById(id).get();
            return user.getWishList();
        } else {
            return null;
        }
    }

    public String handleWishList(Long userId, Long productId) {
        if(userRepository.existsById(userId)&&productRepository.existsById(productId)){
            User user=userRepository.findById(userId).get();
            Product product = productRepository.findById(productId).get();
            Set<Product> wishlist = getWishListByUserId(userId);
            if (wishlist.contains(product)) {
                wishlist.remove(product);
                user.setWishList(wishlist);
                userRepository.save(user);
                return "You removed a product from your wish list!";
            } else {
                wishlist.add(product);
                user.setWishList(wishlist);
                userRepository.save(user);
                return "You added a product from your wish list!";
            }
        }else{
            return "the product is not existed";
        }

    }
}
