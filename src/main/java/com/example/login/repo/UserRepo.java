package com.example.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.login.entity.User;

//import java.util.Optional;

public interface UserRepo extends JpaRepository<User, String> {
    User findByUsername(String username);
}