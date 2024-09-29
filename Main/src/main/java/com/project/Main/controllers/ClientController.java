package com.project.Main.controllers;

import com.project.Main.models.Client;
import com.project.Main.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ClientController {
    @Autowired
    private final ClientService clientService;

    @GetMapping("/")
    public String homePage() {
        return "homePage";
    }

    @PostMapping("/")
    public String createClient(Client client) {
        clientService.createClient(client);
        return "redirect:/";
    }

    @GetMapping("/new")
    public String signUpPage() {
        return "SignUpPage";
    }

    @GetMapping("/login")
    public String logInPage() {
        return "LogInPage";
    }

    @PostMapping("/loginResult")
    public String logInResult(Client client, Model model) {
        if (clientService.getClientByEmailAndPassword(client) == null)
            model.addAttribute("result", "Email or Password was incorrect");
        else {
            model.addAttribute("result", "Log In - successfully");
        }
        return "LogInResultPage";
    }

}
