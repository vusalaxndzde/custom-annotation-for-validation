package com.vusalaxndzde.customannotation.dto;

import com.vusalaxndzde.customannotation.validation.Email;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Payload
{
    @Email
    private String email;
}
