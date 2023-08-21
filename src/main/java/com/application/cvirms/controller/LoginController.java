package com.application.cvirms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "welcome to cvirms";
    }

    @PostMapping("/register")
    public String register(){
        return "account created";
    }
}
