package com.example.userdetailsapp.controller;

import com.example.userdetailsapp.model.User;
import com.example.userdetailsapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path="/")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping(value = "/user/add")
    public User addUser(@RequestBody User user) {
        userRepository.save(user);
        return user;
    }

    @PostMapping(value = "/delete/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        userRepository.deleteById(userId);
    }
}