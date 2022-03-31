package com.example.se2_project_server.service;

import com.example.se2_project_server.model.Color;
import com.example.se2_project_server.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColorService {
    @Autowired
    private ColorRepository colorRepository;
    public Color CreatNewColor(Color color){
        return colorRepository.save(color);
    }
}
