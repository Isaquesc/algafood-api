package com.algaworks.algafoodapi.jpa;

import com.algaworks.algafoodapi.AlgafoodApiApplication;
import com.algaworks.algafoodapi.domain.repository.CozinhaRepository;
import com.algaworks.algafoodapi.domain.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class ConsultaRestauranteTeste {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

       applicationContext.getBean(RestauranteRepository.class)
                .listar()
                .forEach(res -> System.out.printf("%s - %f - %s\n",
                        res.getNome(),
                        res.getTaxaFrete(),
                        res.getCozinha().getNome()));
    }
}
