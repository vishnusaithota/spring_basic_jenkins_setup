package com.webservices.jenkinstestapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/")
    public String returnHello(){
        return "Hello World";
    }
}
