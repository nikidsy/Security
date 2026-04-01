package com.dm.security.entities;

import com.dm.security.entities.enums.Role;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @Column(unique = true)
    private String email;
    private String senha;
    private Role role;
}


