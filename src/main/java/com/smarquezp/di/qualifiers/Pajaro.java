package com.smarquezp.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pajaro extends Animal implements Volador {

    private static final Logger log = LoggerFactory.getLogger(Pajaro.class);

    public Pajaro(@Value("Loquillo") String nombre, @Value("2") Integer edad) {
        super(nombre, edad);
    }

    @Override
    public void volar() {
        log.info("Soy un pájaro y vuelo");
    }
}
