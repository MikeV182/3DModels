package com.project.Main.controllers;

import com.project.Main.models.Client;
import com.project.Main.models.ClientPrincipal;
import com.project.Main.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
public class ClientController {
    @Autowired
    private final ClientService clientService;

    @GetMapping
    public String homePage() {
        return "homePage";
    }

    @GetMapping("/new")
    public String signUpPage() {
        return "SignUpPage";
    }

    @PostMapping("/new")
    public String createClient(@RequestBody Client client) {
        clientService.createClient(client);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String logInPage(@ModelAttribute("client") Client client) {
        return "LogInPage";
    }

    @GetMapping("/account")
    public String accountInfoPage(@AuthenticationPrincipal ClientPrincipal client, Model model) {
        model.addAttribute("client_name", client.getName());
        model.addAttribute("client_surname", client.getSurname());
        model.addAttribute("client_email", client.getUsername());
        return "AccountPage";
    }
}
