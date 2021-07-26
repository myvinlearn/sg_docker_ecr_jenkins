package com.example.demo.container;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MyController {

    @GetMapping("/getMe")
    public String getMer(){
        return "Welcome";
    }
}
