package com.vusalaxndzde.customannotation.dto;

import com.vusalaxndzde.customannotation.validation.AllowedFile;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FileDTO
{
    @AllowedFile(allowedExtensions = {"jpg", "png", "txt"})
    private MultipartFile file;
}
