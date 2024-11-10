package com.project.Main.controllers;

import com.project.Main.models.MyModel;
import com.project.Main.services.ModelsPageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/models")
@RequiredArgsConstructor
public class ModelsPageController {
    @Autowired
    private final ModelsPageService modelsPageService;

    @GetMapping
    public String modelsPage(Model model) {
        model.addAttribute("models", modelsPageService.getMyModels());
        return "ModelsPage";
    }

    @GetMapping("/{id}")
    public String modelInfo(@PathVariable Long id, Model model) {
        model.addAttribute("model", modelsPageService.getMyModel(id));
        return "ModelInfoPage";
    }
}
