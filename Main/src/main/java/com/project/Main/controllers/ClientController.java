package com.project.Main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {
    @GetMapping("/")
    public String homePage() {
        return "homePage";
    }

    @GetMapping("/new")
    public String signUpPage() {
        return "SignUpPage";
    }
}
