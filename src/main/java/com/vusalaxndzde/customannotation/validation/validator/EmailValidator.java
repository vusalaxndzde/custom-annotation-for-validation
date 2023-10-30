package com.vusalaxndzde.customannotation.validation.validator;

import com.vusalaxndzde.customannotation.validation.Email;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email, String>
{
    @Override
    public boolean isValid(String email, ConstraintValidatorContext validatorContext)
    {
        if (email.endsWith("@gmail.com"))
        {
            return true;
        }

        validatorContext
                .buildConstraintViolationWithTemplate(validatorContext.getDefaultConstraintMessageTemplate())
                .addConstraintViolation();

        return false;
    }
}
