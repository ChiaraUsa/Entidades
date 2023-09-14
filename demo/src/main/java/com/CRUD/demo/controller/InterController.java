package com.CRUD.demo.controller;

import com.CRUD.demo.entidades.Request;
import com.CRUD.demo.entidades.Response;
import com.CRUD.demo.servicio.IntermediarioServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inter")
@RequiredArgsConstructor
public class InterController {
    @Autowired
    private final IntermediarioServicio interServicio;

    @PostMapping("/registrar")
    public ResponseEntity<Response> RegistrarInter(@RequestBody Request request){
        return ResponseEntity.ok(interServicio.registrar(request.getName(), request.getEmail(), request.getPassword()));
    }

}
