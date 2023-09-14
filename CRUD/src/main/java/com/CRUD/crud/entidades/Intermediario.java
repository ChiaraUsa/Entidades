package com.CRUD.demo.entidades;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="intermediarios")
public class Intermediario  {
    @Id
    @GeneratedValue(strategy =
            GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String password;

}
