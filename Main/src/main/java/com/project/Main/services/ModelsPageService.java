package com.project.Main.services;

import com.project.Main.models.MyModel;
import com.project.Main.repositories.ModelsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ModelsPageService {
    @Autowired
    private final ModelsRepository modelsRepository;

    public List<MyModel> getMyModels() {
        return modelsRepository.findAll();
    }

    public MyModel getMyModel(Long id) {
        return modelsRepository.findById(id).orElse(null);
    }
}
