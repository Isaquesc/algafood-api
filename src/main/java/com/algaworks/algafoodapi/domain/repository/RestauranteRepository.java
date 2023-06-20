package com.algaworks.algafoodapi.domain.repository;

import com.algaworks.algafoodapi.domain.model.Restaurante;

import java.util.List;

public interface RestauranteRepository {

    List<Restaurante> listar();

    Restaurante findById(Integer id);

    Restaurante salvar(Restaurante restaurante);

    void remover(Restaurante restaurante);

}
