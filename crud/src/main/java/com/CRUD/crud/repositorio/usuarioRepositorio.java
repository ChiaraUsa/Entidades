package com.CRUD.crud.repositorio;

import com.CRUD.crud.Entidades.usuarios;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface usuarioRepositorio extends CrudRepository<usuarios,Integer> {
    Optional<usuarios> findByEmail (String email);
}
