package com.algaworks.algafoodapi.jpa;

import com.algaworks.algafoodapi.domain.model.Cozinha;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CadastroCozinha {

    @PersistenceContext
    private EntityManager manager; // o que gerencia o conceito de persistia, é o responsavel pela intermediação dos comando pelas tradução SQL

    public List<Cozinha> listCozinha(){
        TypedQuery<Cozinha> query = manager.createQuery("from Cozinha", Cozinha.class);
        return query.getResultList();
    }

}
