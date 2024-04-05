package com.bitcamp.api.common;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
public class HomeController {


    @GetMapping("/")
    public String hello(){
     

        return "Welcome To Spring Boot - 9";
    }

    
}
