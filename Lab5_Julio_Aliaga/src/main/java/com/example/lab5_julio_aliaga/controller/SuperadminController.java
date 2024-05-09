package com.example.lab5_julio_aliaga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class SuperadminController {
    @GetMapping("")
    public String Plantilla() {
        return "Plantilla";
    }


}
