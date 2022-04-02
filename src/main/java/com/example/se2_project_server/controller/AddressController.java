package com.example.se2_project_server.controller;

import com.example.se2_project_server.model.Address;
import com.example.se2_project_server.model.User;
import com.example.se2_project_server.repository.UserRepository;
import com.example.se2_project_server.service.AddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Address addAddress(@PathVariable(name = "id") Long id,@RequestBody Address address){
return addressService.createNewAddress(id,address);
    }
}
