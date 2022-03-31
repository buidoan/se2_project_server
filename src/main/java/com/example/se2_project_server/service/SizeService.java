package com.example.se2_project_server.service;

import com.example.se2_project_server.model.Size;
import com.example.se2_project_server.repository.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SizeService {
    @Autowired
    private SizeRepository sizeRepository;
    public Size createNewSize(Size size){
        return sizeRepository.save(size);
    }
}
