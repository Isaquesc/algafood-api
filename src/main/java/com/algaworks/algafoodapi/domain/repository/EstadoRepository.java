package com.algaworks.algafoodapi.domain.repository;

import com.algaworks.algafoodapi.domain.model.Estado;

import java.util.List;

public interface EstadoRepository {

    List<Estado> listar();
    Estado findById(Integer id);
    Estado salvar(Estado estado);
    void remover(Estado estado);

}

