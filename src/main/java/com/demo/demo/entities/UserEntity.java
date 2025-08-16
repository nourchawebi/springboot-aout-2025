package com.demo.demo.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="users")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="firstname", length = 10,nullable=true)
    @Size(max=10, message=" le nom ne doit pas depasser 10 caracteres")
    private  String firstname;
    private String lastname;
    @Column(unique = true, nullable = false,length = 100)
    private String email;
    private String password ;
    private String address;
    private String username;
    private String confirmPassword;

}
