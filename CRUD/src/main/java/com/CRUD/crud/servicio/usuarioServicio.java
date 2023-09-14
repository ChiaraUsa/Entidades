package com.CRUD.crud.servicio;

import com.CRUD.crud.Entidades.response;
import com.CRUD.crud.repositorio.usuarioRepositorio;
import com.CRUD.crud.Entidades.usuarios;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class usuarioServicio {

    @Autowired
    private final usuarioRepositorio usuarioRepositorio;
    public response registrar(String name, String email, String password) {

        var user = usuarios.builder()
                .name(name)
                .email(email)
                .password(password)
                .build();

        usuarioRepositorio.save(user);

        return response.builder().respuesta("Success").build();

    }
}
