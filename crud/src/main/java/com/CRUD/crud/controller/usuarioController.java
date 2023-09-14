package com.CRUD.crud.controller;


import com.CRUD.crud.Entidades.Request;
import com.CRUD.crud.Entidades.response;
import com.CRUD.crud.servicio.usuarioServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class usuarioController {

    @Autowired
    private final usuarioServicio usuarioServicio;

    @PostMapping("/registrar")
    public ResponseEntity<response> RegistrarUsu(@RequestBody Request request){
        return ResponseEntity.ok(usuarioServicio.registrar(request.getName(),request.getEmail(),request.getPassword()));
    }

}
