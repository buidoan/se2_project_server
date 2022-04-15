package com.example.se2_project_server.controller;

import com.example.se2_project_server.model.Product;
import com.example.se2_project_server.model.User;
import com.example.se2_project_server.model.WishListRequest;
import com.example.se2_project_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.parameters.P;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
//get user by id
@GetMapping("/get/{id}")
@PreAuthorize("HasRole('Admin')")
public User getById(@PathVariable(name = "id") Long userId){
  return   userService.getById(userId);
}
//update user
    @PutMapping("/{id}")
    @PreAuthorize("hasAnyRole('Admin','User')")
    public User updateUser(@PathVariable(name = "id") Long userId, @RequestBody User newUser){
    return userService.updateById(userId,newUser);
    }
    @PostMapping({"/register"})
    public User registerNewUser(@Valid @RequestBody User user) {
        return userService.registerNewUser(user);
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;

    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyRole('Admin','User')")
    public String deleteById(@PathVariable(name = "id") Long userId){
    return userService.deleteById(userId);
    }
//get wish list by user id
    @GetMapping("/wishlist/{id}")
    @PreAuthorize("hasAnyRole('Admin','User')")
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
