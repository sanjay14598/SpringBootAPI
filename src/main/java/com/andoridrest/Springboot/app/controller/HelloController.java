package com.andoridrest.Springboot.app.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${welcome.message}")
    private String welcome_message;

    @GetMapping("/")
    public String helloWorld() {
        return welcome_message;
    }
}
