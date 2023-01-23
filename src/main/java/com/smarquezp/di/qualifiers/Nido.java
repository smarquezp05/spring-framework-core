package com.smarquezp.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Nido {

    @Autowired
    private Animal pajaro;

    private static final Logger log = LoggerFactory.getLogger(Pajaro.class);

    public void imprimir() {
        log.info("Mi nido tiene un pájaro {}", pajaro.getNombre());
    }
}
