package com.algaworks.algafoodapi.domain.controller;

import com.algaworks.algafoodapi.domain.model.Cozinha;
import com.algaworks.algafoodapi.domain.repository.CozinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("cozinha")
public class CozinhaController {

    @Autowired
    private CozinhaRepository repository;

    @GetMapping(path = "cozinhas", produces = APPLICATION_JSON_VALUE)
    public List<Cozinha> cozinhaList(){
        return repository.listar();
    }
}
