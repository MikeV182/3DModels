package com.project.Main.controllers;

import com.project.Main.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ClientController {
    @Autowired
    private final ClientService clientService;

    @GetMapping("/")
    public String homePage() {
        return "homePage";
    }

    @GetMapping("/new")
    public String signUpPage() {
        return "SignUpPage";
    }
}
