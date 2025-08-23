package com.demo.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idrole;
    @Enumerated(EnumType.STRING)
    private   RoleName roleName;
    @ManyToMany(mappedBy="role")
    private Set<UserEntity> users = new HashSet<>();
}
