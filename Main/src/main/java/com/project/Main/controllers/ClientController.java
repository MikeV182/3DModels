package com.project.Main.controllers;

import com.project.Main.models.Client;
import com.project.Main.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @PostMapping("/new")
    public String createClient(Client client) {
        clientService.createClient(client);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String logInPage(@ModelAttribute("client") Client client) {
        return "LogInPage";
    }

    @PostMapping("/login")
    public String logInResult(Client client, RedirectAttributes redirectAttributes) {
        Client existingClient = clientService.getClientByEmailAndPassword(client);
        if (existingClient == null) {
            redirectAttributes.addFlashAttribute("client", client);
            return "redirect:/login";
        }

        redirectAttributes.addAttribute("client", existingClient);
        return "redirect:/account";
    }

    @GetMapping("/account")
    public String accountInfoPage(@ModelAttribute("client") Client client) {
        return "AccountPage";
    }
}
