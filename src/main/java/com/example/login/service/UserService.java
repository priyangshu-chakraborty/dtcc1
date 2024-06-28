package com.example.login.service;

import com.example.login.entity.User;
import com.example.login.repo.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepository;

    public User login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}