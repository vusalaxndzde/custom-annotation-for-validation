package com.vusalaxndzde.customannotation.controller;

import com.vusalaxndzde.customannotation.dto.FileDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoController
{
    @PostMapping("/file")
    public ResponseEntity<?> saveFile(@Valid @ModelAttribute FileDTO file)
    {
        return ResponseEntity.ok().build();
    }
}
