package com.dm.security.controller;

import com.dm.security.DTO.UsuarioRequestDTO;
import com.dm.security.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("users")
@RestController
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity criarUsuario(@RequestBody UsuarioRequestDTO dto) {
        return ResponseEntity.ok(usuarioService.criarUsuario(dto));
    }
}
