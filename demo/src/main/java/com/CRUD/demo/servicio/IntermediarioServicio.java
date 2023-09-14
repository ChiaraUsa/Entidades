package com.CRUD.demo.servicio;

import com.CRUD.demo.entidades.Intermediario;
import com.CRUD.demo.entidades.Response;
import com.CRUD.demo.repositorio.InterRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IntermediarioServicio {
    @Autowired
    private final InterRepositorio interRepositorio;
    public Response registrar(String name, String email, String password) {
        var user = Intermediario.builder()
                .name(name)
                .email(email)
                .password(password)
                .build();
        interRepositorio.save(user);

        return Response.builder().respuesta("Exito").build();
    }
}
