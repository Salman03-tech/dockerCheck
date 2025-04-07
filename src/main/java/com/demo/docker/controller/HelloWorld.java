package com.demo.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class HelloWorld {

    @GetMapping("/get")
    public String getMessage() {
        return "Hello, Docker World by Salman!";
    }
}
