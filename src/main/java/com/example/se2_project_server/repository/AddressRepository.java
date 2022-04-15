package com.example.se2_project_server.repository;

import com.example.se2_project_server.model.Address;
import com.example.se2_project_server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
public Address findAddressByUserId(Long userId);
public Address findAddressByRecivedNumber(String recivedNumber);
public Address findAddressByUserIdAndAndRecivedAddressAndRecivedNameAndRecivedNumber(Long id,String RecivedAddress,String RecivedName,String RecivedNumber );
}
