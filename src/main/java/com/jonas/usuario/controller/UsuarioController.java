package com.jonas.usuario.controller;

import com.jonas.usuario.business.UsuarioService;
import com.jonas.usuario.business.dto.UsuarioDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioDTO> salvaUsuario(UsuarioDTO usuarioDTO){
    return ResponseEntity.ok(usuarioService.salvaUsuario(usuarioDTO));
    }
}
