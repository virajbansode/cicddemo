package com.example.cicddemo.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DemoController {

    @GetMapping("/greet")
    public String getGreeting(@RequestParam(name = "text", required = false) String text) {
        if(!StringUtils.hasText(text)) {
            return "<html><body><h1>Make <span style=\"color:red;\">LIFESTYLE</span> Awesome!</h1></body></html>";
        }
        return "<html><body><h1>Make <span style=\"color:blue;\">"+text.toUpperCase()+"</span> Awesome!</h1></body></html>";
    }

}
