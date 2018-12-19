package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoResource {

    @RequestMapping("/")
    public String handler(){
        return "Welsome to Mustak's demo springboot application";
    }
}
