package com.algaworks.algafoodapi.jpa;

import com.algaworks.algafoodapi.AlgafoodApiApplication;
import com.algaworks.algafoodapi.domain.model.Cozinha;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class InsertCozinhaTeste {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        ImplCozinha implCozinha = applicationContext.getBean(ImplCozinha.class);

        Cozinha cozinha = new Cozinha();
        cozinha.setId(1);
        cozinha.setNome("Argentina");

        Cozinha cozinha1 = new Cozinha();
        cozinha1.setNome("Japonesa");

        implCozinha.adicionarCozinha(cozinha);
        implCozinha.adicionarCozinha(cozinha1);
    }
}