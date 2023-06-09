package com.algaworks.algafoodapi.domain.repository;

import com.algaworks.algafoodapi.domain.model.FormaPagamento;

import java.util.List;

public interface FormaPagamentoRepository {

    List<FormaPagamento> listar();

    FormaPagamento findById(Integer id);

    FormaPagamento salvar(FormaPagamento formaPagamento);

    void remover(FormaPagamento formaPagamento);

}
