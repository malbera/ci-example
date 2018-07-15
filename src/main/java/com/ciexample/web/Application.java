package com.ciexample.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class Application {

    @GetMapping("/")
    @ResponseBody String sayHello() {
        return "Hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
