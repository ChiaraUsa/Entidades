package com.CRUD.crud.repositorio;

import com.CRUD.crud.entidades.Admin;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface AdminRepositorio extends CrudRepository<Admin,Integer> {
    Optional<Admin> findByEmail (String email);
}
