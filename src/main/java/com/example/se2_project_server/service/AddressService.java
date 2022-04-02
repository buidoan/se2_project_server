package com.example.se2_project_server.service;

import com.example.se2_project_server.model.Address;
import com.example.se2_project_server.model.User;
import com.example.se2_project_server.repository.AddressRepository;
import com.example.se2_project_server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private UserRepository userRepository;

    public List<Address> findByUserId(Long id) {
      if(userRepository.existsById(id)){
          return addressRepository.findAddressByUserId(id);
      }
      else{
          return null;
      }
    }
    public Address createNewAddress(Long id, Address address){
        if(userRepository.existsById(id)){
            User user=userRepository.findById(id).get();


            address.setUser(user);
            addressRepository.save(address);
            return address;
        } else{
            return null;
        }
    }
}
