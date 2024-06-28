package com.example.login.controller;

import com.example.login.entity.User;
import com.example.login.service.UserService;
import com.example.login.model.logincreds;

//import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String api() {
        return "hello";
    }

    @PostMapping("/go")
    public String login(@RequestBody logincreds logincred) {
        User user = userService.login(logincred.getUsername(), logincred.getPassword());
        if (user != null) {
            return "Login successful";
        } else {
            return "Invalid username or password";
        }
        // return logincred.getUsername();
    }
}