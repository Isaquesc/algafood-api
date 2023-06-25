package com.algaworks.algafoodapi.domain.controller;

import com.algaworks.algafoodapi.domain.model.Cozinha;
import com.algaworks.algafoodapi.domain.repository.CozinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@RestController
@RequestMapping(value = "cozinha", produces = {APPLICATION_XML_VALUE, APPLICATION_JSON_VALUE})
public class CozinhaController {

    @Autowired
    private CozinhaRepository repository;

    @GetMapping(path = "cozinhas")
    public List<Cozinha> cozinhaList(){
        return repository.listar();
    }

    @GetMapping(path = "{id}")
    public Cozinha findByID(@PathVariable Integer id){
        return repository.findById(id);
    }
}
