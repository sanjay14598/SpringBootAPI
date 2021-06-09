package com.andoridrest.Springboot.app.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld() {
        return "Welcome to new Spring boot project to check get method ok everything..!!";
    }
}
