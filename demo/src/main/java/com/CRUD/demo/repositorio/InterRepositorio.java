package com.CRUD.demo.repositorio;

import com.CRUD.demo.entidades.Intermediario;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface InterRepositorio extends CrudRepository<Intermediario,Integer> {
    Optional<Intermediario> findByEmail (String email) ;
}
