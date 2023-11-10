package com.vusalaxndzde.customannotation.validation;

import com.vusalaxndzde.customannotation.dto.Payload;
import com.vusalaxndzde.customannotation.validation.validator.AllowedFileValidator;
import jakarta.validation.Constraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = AllowedFileValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AllowedFile
{
    String message() default "Invalid file!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String[] allowedExtensions() default {};
}
