package com.studentsub.studentsubscription.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//https://java-master.com/spring-mvc-thymeleaf/
@RestController
public class FirstController {
    @GetMapping("/ping")
    public String home(){
        return "pong";
    }
}
