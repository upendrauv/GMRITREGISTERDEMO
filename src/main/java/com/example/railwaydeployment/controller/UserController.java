package com.example.railwaydeployment.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.railwaydeployment.model.User;
import com.example.railwaydeployment.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:5175")
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository repo;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        if (repo.existsByEmail(user.getEmail())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Email already exists");
        }
        repo.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body("User registered");
    }
    @GetMapping("/xyz")
    String a()
    {
        return "111111111111111111111111111";
    }
}
