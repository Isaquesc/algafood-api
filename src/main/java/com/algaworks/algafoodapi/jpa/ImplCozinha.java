package com.algaworks.algafoodapi.jpa;

import com.algaworks.algafoodapi.domain.model.Cozinha;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ImplCozinha {

    @PersistenceContext
    private EntityManager manager; // gerenciador de persistencia, é o responsavel pela intermediação dos comando pelas tradução SQL

    public List<Cozinha> listCozinha(){
        TypedQuery<Cozinha> query = manager.createQuery("from Cozinha", Cozinha.class);
        return query.getResultList();
    }

    public Cozinha findById(Integer id){
        return manager.find(Cozinha.class, id);
    }

    @Transactional
    public Cozinha adicionarCozinha(Cozinha cozinha){
        return manager.merge(cozinha);
    }

    @Transactional
    public void remover(Cozinha cozinha){
        Cozinha cozinhaManager = findById(cozinha.getId());
        manager.remove(cozinhaManager);
    }

}
