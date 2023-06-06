package com.algaworks.algafoodapi.domain.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "cozinhas")
public class Cozinha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
}
