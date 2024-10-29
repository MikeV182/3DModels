package com.project.Main.controllers;

import com.project.Main.services.ModelsPageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/models")
@RequiredArgsConstructor
public class ModelsPageController {
    @Autowired
    private final ModelsPageService modelsPageService;

    @GetMapping
    public String ModelsPage() {
        return "ModelsPage";
    }
}
