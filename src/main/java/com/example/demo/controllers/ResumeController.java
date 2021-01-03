package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/resume")
public class ResumeController {
    @GetMapping("")
    public String cv(){
        return "resume";
    }
}
