package org.example;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring Boot";
    }
    @GetMapping("/info")
    public String info(){
        return "Lets Explore more on spring boot";
    }
}
