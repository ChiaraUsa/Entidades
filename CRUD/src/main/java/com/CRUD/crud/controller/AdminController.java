package com.CRUD.crud.controller;

import com.CRUD.crud.entidades.Request;
import com.CRUD.crud.entidades.Response;
import com.CRUD.crud.servicio.AdminServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminController {

    @Autowired
    private final AdminServicio adminServicio;

    @PostMapping("/registrar")
    public ResponseEntity<Response> RegistrarAdmin(@RequestBody Request resquest){
        System.out.println("entre admin");
        return ResponseEntity.ok(adminServicio.registrar(resquest.getName(),resquest.getEmail(),resquest.getPassword()));
    }

}
