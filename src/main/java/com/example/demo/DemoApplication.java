package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {
    @RequestMapping("/index")
    public String index(){
        return "this is frist springboot project!";
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

