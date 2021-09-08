package com.curso.spring.aop.ejem02;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// EJEMPLO 1 - ANTES DE APLICAR AOP

public class Probar {
    public static void main(String[] args) {
        try {
            System.out.println("...Se ejecuta doble por que esta el op en el xml y \n"
            		+ "tambien configurado en cada clase. Se pone en uno u otro \n"
            		+ " pero es para  ver...");
            ConfigurableApplicationContext ctx;
            ctx = new ClassPathXmlApplicationContext("/com/curso/spring/aop/ejem02/teatro.xml");
            System.out.println("\n___________Sale el violinista___________ ");
            Representable r = (Representable) ctx.getBean("violinista");
            r.actuar();
            
            System.out.println("\n___________Sale el pianista___________");
            r = (Representable) ctx.getBean("pianista");
            r.actuar();
            ctx.close();
            

        } catch (ActuacionException ex) {
            //Logger.getLogger(Probar.class.getName()).log(Level.SEVERE, null, ex);
        	
        	System.out.println("\n ERROR! Alguien ha desafinado");
        }
    }
}
