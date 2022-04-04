package com.example.se2_project_server.validation;

import javax.validation.Payload;
import javax.validation.Constraint;

import java.lang.annotation.*;

@Constraint(validatedBy = UniqueSlugNameValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface UniqueSlugName {
    String message() default "Slug name is already existed";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
