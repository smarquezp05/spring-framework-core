package com.smarquezp.di;

import com.smarquezp.di.qualifiers.Animal;
import com.smarquezp.di.qualifiers.Avion;
import com.smarquezp.di.qualifiers.Nido;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {
    private static final Logger log = LoggerFactory.getLogger(DependencyInjectionApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

        Nido nido = context.getBean(Nido.class);

        nido.imprimir();

    }

}
