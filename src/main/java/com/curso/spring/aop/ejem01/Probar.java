package com.curso.spring.aop.ejem01;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// EJEMPLO 1 - ANTES DE APLICAR AOP

public class Probar {
    public static void main(String[] args) {
        try {
            ConfigurableApplicationContext ctx;
            ctx = new ClassPathXmlApplicationContext("/com/curso/spring/aop/ejem01/teatro.xml");
            Representable r = (Representable) ctx.getBean("pianista");
            r.actuar();
            ctx.close();
        } catch (ActuacionException ex) {
            Logger.getLogger(Probar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
