package com.andoridrest.Springboot.app.controller;

import com.andoridrest.Springboot.app.entity.User;
import com.andoridrest.Springboot.app.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/users")
    public List<User> fetchAllUser(){
        return userService.fetchAllUser();
    }

    @GetMapping("/user/{userId}")
    public User findUserById(@PathVariable("id") Long userId){
        return userService.findUserById(userId);
    }
    
}
