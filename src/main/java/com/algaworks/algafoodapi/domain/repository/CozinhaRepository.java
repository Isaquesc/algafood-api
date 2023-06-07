package com.algaworks.algafoodapi.domain.repository;

import com.algaworks.algafoodapi.domain.model.Cozinha;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CozinhaRepository {

    List<Cozinha> listar();
    Cozinha findById(Integer id);
    Cozinha salvar(Cozinha cozinha);
    void remover(Cozinha cozinha);

}
