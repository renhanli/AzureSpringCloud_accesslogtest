package com.example.hello;

import com.example.hello.NumberServiceClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private NumberServiceClient numServiceClient;

    @GetMapping("/")
    public String index() {
        String randomNumber = numServiceClient.getRandomNumber();
       
        return "Got a random number "+ randomNumber+ " from App number-service";
    }
}
