package com.dm.security.DTO;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UsuarioRequestDTO {

    private String nome;
    private String email;
    private String senha;
}
