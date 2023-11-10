package com.vusalaxndzde.customannotation.validation.validator;

import com.vusalaxndzde.customannotation.validation.AllowedFile;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AllowedFileValidator implements ConstraintValidator<AllowedFile, MultipartFile>
{
    private final Set<String> allowedExtensions = new HashSet<>();

    @Override
    public void initialize(AllowedFile constraintAnnotation)
    {
        this.allowedExtensions.addAll(Arrays.asList(constraintAnnotation.allowedExtensions()));
    }

    @Override
    public boolean isValid(MultipartFile file, ConstraintValidatorContext constraintValidatorContext)
    {
        if (file == null || file.isEmpty())
        {
            return false;
        }

        String originalFilename = file.getOriginalFilename();

        if (originalFilename != null && !originalFilename.isEmpty())
        {
            String extension = originalFilename.substring(originalFilename.indexOf(".") + 1);

            if (!allowedExtensions.contains(extension))
            {
                constraintValidatorContext.disableDefaultConstraintViolation();
                constraintValidatorContext
                        .buildConstraintViolationWithTemplate("Invalid file extension: ." + extension)
                        .addConstraintViolation();

                return false;
            }
        }
        else
        {
            return false;
        }

        return true;
    }
}
