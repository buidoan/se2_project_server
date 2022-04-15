package com.example.se2_project_server.repository;

import com.example.se2_project_server.model.Address;
import com.example.se2_project_server.model.Order;
import com.example.se2_project_server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    public List<Order> findOrderByUser(User user);
}
