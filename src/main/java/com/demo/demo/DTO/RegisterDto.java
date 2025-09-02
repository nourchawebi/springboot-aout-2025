package com.demo.demo.DTO;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class RegisterDto {
    private  String firstname;
    private String lastname;

    private String email;
    private String password ;
    private String username;
}
