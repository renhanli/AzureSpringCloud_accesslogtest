package com.example.numberservice;

import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(path="/number")
public class NumberController {

    @RequestMapping("/random")
    public String randomnumber() {
        Random rand = new Random(); 
        int upperbound = 100;
        //generate random values from 0-100
        int random = rand.nextInt(upperbound); 

        return String.valueOf(random);
    }
}