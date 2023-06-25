package com.algaworks.algafoodapi.domain.controller;

import com.algaworks.algafoodapi.domain.model.Estado;
import com.algaworks.algafoodapi.domain.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "estado", produces = APPLICATION_JSON_VALUE)
public class EstadoController {

    @Autowired
    private EstadoRepository repository;

    @GetMapping(path = "estados")
    public List<Estado> estadosList(){
        return repository.listar();
    }
}
