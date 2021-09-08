package com.curso.spring.aop.ejem02;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *
 * @author bolea
 */
public class Publico {

    //Se ejecutará antes de la actuación
    public void tomarAsiento(){
        System.out.println("El publico toma asiento.");
    }
    //Se ejecuta después de la actuacion
    public void aplaudir(){
        System.out.println("PLA PLA PLA PLA. Bravo !!!");
    }
    //Se ejecuta después de la actuacion
    public void abuchear(){
        System.out.println("BUUUUUhhh FUERAAA !!!");
    }
    //Se ejecuta cuando se ha realizado una mala actuación
    public void solicitarDevolucionEntrada(){
        System.out.println("Buuuu! Queremos dinero de la entrada!!");
    }
}
