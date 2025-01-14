package com.example.api_crud_springboot.rest;


import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController

@RequestMapping("/api")


public class RestController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
