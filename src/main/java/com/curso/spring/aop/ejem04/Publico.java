package com.curso.spring.aop.ejem04;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *
 * @author bolea
 */
@Aspect
public class Publico {

    //Se ejecutará antes de la actuación
	@Before("execution(* *.actuar(..))")
    public void tomarAsiento(){
        System.out.println("El publico toma asiento.");
    }
    //Se ejecuta después de la actuacion
    @AfterReturning("execution(* *.actuar(..))")
    public void aplaudir(){
        System.out.println("PLA PLA PLA PLA. Bravo !!!");
    }
    @AfterThrowing("execution(* *.actuar(..))")
    //Se ejecuta después de la actuacion
    public void abuchear(){
        System.out.println("BUUUUUhhh FUERAAA !!!");
    }
    //Se ejecuta cuando se ha realizado una mala actuación
    public void solicitarDevolucionEntrada(){
        System.out.println("Buuuu! Queremos dinero de la entrada!!");
    }
}
