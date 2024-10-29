package com.project.Main.services;

import com.project.Main.repositories.ModelsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ModelsPageService {
    @Autowired
    private final ModelsRepository modelsRepository;

}
