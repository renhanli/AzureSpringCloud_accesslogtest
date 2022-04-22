package com.example.hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("number-service")
public interface NumberServiceClient {

    @GetMapping("/number/random")
    String getRandomNumber();

}
