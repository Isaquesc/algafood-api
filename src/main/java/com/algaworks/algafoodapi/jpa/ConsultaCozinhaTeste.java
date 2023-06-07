package com.algaworks.algafoodapi.jpa;

import com.algaworks.algafoodapi.AlgafoodApiApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class ConsultaCozinhaTeste {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        applicationContext.getBean(CadastroCozinhaImpl.class)
                .listCozinha()
                .forEach(System.out::println);

        System.out.println(applicationContext
                .getBean(CadastroCozinhaImpl.class)
                .findById(1));
    }
}
