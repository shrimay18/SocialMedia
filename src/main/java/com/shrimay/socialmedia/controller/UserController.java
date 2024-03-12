package com.shrimay.socialmedia.controller;

import com.shrimay.socialmedia.models.User;
import com.shrimay.socialmedia.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class UserController {
    UserService userService;
    public UserController(UserService user){
        this.userService = user;
    }
    @GetMapping("/users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable("id") long id){
        return userService.getUserById(id);
    }



}
