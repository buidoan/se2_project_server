package com.example.se2_project_server.service;

import com.example.se2_project_server.model.Gender;
import com.example.se2_project_server.repository.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenderService {
    @Autowired
    private GenderRepository genderRepository;
    public Gender createNewColor(Gender gender){
        return genderRepository.save(gender);
    }
}
