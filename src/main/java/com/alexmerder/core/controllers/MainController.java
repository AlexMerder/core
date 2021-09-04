package com.alexmerder.core.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("message","Hello World");
        return "hello";
    }

 }
