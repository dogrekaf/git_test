package com.example.dengtao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @RequestMapping("/hello")
    public String handle01(){
        return "hello world 2";
    }
}
