package com.sem4.springtemplate.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "aboutus")
public class AboutController {

    @GetMapping
    public String index(){
        return "aboutus.index";
    }
}
