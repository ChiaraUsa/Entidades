package com.CRUD.crud.servicio;

import com.CRUD.crud.entidades.Admin;
import com.CRUD.crud.entidades.Response;
import com.CRUD.crud.repositorio.AdminRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminServicio {

    @Autowired
    private final AdminRepositorio adminRepositorio;
    public Response registrar(String name, String email, String password) {
        var admin = Admin.builder()
                .name(name)
                .email(email)
                .password(password)
                .build();

        adminRepositorio.save(admin);

        return Response.builder().respuesta("Exito").build();
    }
}
