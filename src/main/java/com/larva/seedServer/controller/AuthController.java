package com.larva.seedServer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {

    @GetMapping("/hello")
    public String getHelloMessage() {
        return "{\"message\":\"Hello from Spring Boot Server!\"}";
    }
}