package com.example.se2_project_server.controller;

import com.example.se2_project_server.model.Address;
import com.example.se2_project_server.model.User;
import com.example.se2_project_server.repository.UserRepository;
import com.example.se2_project_server.service.AddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;
    @Autowired
    private UserRepository userRepository;
    //get list addresss by id of user
    @GetMapping("/{id}")
    public List<Address> getAddressByUserId(@PathVariable(value = "id")Long id){
        return addressService.findByUserId(id);
    }
    //create new address with id of user
    @PostMapping("/{id}")
    public Address addAddress(@PathVariable(name = "id") Long id,@Valid  @RequestBody Address address){
return addressService.createNewAddress(id,address);
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
}
