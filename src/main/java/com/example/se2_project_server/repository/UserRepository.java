package com.example.se2_project_server.repository;




import com.example.se2_project_server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
public User getByUserName(String name);
}
