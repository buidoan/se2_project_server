package com.example.se2_project_server.validation;

import com.example.se2_project_server.repository.ProductRepository;
import com.example.se2_project_server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueUserNameValidator implements ConstraintValidator<UniqueUserName, String> {
    @Autowired
    private UserRepository userRepository;



    @Override
    public void initialize(UniqueUserName uniqueUserName) {

    }
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return (userRepository.getByUserName(s)==null);
    }
}
