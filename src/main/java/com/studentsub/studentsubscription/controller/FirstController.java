package com.studentsub.studentsubscription.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//https://java-master.com/spring-mvc-thymeleaf/
@Controller
public class FirstController {
    @GetMapping("/ping")
    public String home(){
        return "ping";
    }
}
