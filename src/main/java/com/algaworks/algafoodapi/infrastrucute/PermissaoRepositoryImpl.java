package com.algaworks.algafoodapi.infrastrucute;

import com.algaworks.algafoodapi.domain.model.FormaPagamento;
import com.algaworks.algafoodapi.domain.model.Permissao;
import com.algaworks.algafoodapi.domain.repository.PermissaoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class PermissaoRepositoryImpl implements PermissaoRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Permissao> listar() {
        TypedQuery<Permissao> query = manager.createQuery("from Permissao", Permissao.class);
        return query.getResultList();
    }

    @Override
    public Permissao findById(Integer id) {
        return manager.find(Permissao.class, id);
    }

    @Transactional
    @Override
    public Permissao salvar(Permissao pemissao) {
        return manager.merge(pemissao);
    }

    @Transactional
    @Override
    public void remover(Permissao permissao) {
        Permissao permissaoManager = findById(permissao.getId());
        manager.remove(permissaoManager);
    }
}
