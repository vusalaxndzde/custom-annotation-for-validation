package com.vusalaxndzde.customannotation.controller;

import com.vusalaxndzde.customannotation.dto.Payload;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payloads")
public class PayloadController
{
    @PostMapping
    public ResponseEntity<Payload> save(@Valid @RequestBody Payload payload)
    {
        return ResponseEntity.ok(payload);
    }
}
