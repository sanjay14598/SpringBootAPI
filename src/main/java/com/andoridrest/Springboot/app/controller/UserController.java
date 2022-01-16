package com.andoridrest.Springboot.app.controller;

import com.andoridrest.Springboot.app.entity.User;
import com.andoridrest.Springboot.app.error.ResourceNotFoundException;
import com.andoridrest.Springboot.app.repository.UserRepository;
import com.andoridrest.Springboot.app.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/users")
    public List<User> fetchAllUser() {
        return userService.fetchAllUser();
    }


    @GetMapping("/user/{phone}/{password}")
    public User getValidateUser(@PathVariable String phone, @PathVariable String password) {
        return userService.getValidateUser(phone, password);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<User> geUserById(
            @PathVariable(value = "userId") Long userId) throws ResourceNotFoundException {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found :: " + userId));
        return ResponseEntity.ok().body(user);
    }

    @PutMapping("/user/{userId}")
    public ResponseEntity<User> updateUser(
            @PathVariable(value = "userId") Long userId,
            @Valid @RequestBody User userDetail) throws ResourceNotFoundException {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found :: " + userId));
        user.setUserName(userDetail.getUserName());
        final User updatedUser = userRepository.save(user);
        return ResponseEntity.ok(updatedUser);
    }

    @PutMapping("/user/forgotPassword/{userId}")
    public ResponseEntity<User> updatePassword(
            @PathVariable(value = "userId") Long userId,
            @Valid @RequestBody User userDetail) throws ResourceNotFoundException {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found :: " + userId));
        user.setUserPassword(userDetail.getUserPassword());
        final User updatedUser = userRepository.save(user);
        return ResponseEntity.ok(updatedUser);
    }
}
