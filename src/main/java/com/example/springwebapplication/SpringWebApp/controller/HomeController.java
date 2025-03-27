package com.example.springwebapplication.SpringWebApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/home")
    public String build(){
        return "Welcome Santosh Kumar";
    }

    @RequestMapping("/about")
    public String aboutHome(){
        return "Welcome To HomePage - version 1.0.0";
    }
}
