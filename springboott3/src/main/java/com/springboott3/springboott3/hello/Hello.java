package com.springboott3.springboott3.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
