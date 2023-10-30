package com.vusalaxndzde.customannotation.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse
{
    private String message;
}
