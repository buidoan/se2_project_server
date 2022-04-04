package com.example.se2_project_server.validation;


import com.example.se2_project_server.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class UniqueSlugNameValidator implements ConstraintValidator<UniqueSlugName, String> {

    @Autowired
    private ProductRepository productRepository;



    @Override
    public void initialize(UniqueSlugName uniqueSlugName) {

    }

    @Override
    public boolean isValid(String slugName, ConstraintValidatorContext constraintValidatorContext) {
        return (productRepository.findBySlugName(slugName) == null);
    }
}
