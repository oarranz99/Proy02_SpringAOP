package com.curso.spring.aop.ejem02;

public class Concertista implements Representable{

    private String obra;

    public Concertista() {
    }

    public void setObra(String obra) {
        this.obra = obra;
    }
    public void actuar() throws ActuacionException {
           System.out.println("Tocando la obra " + obra);
           if(this.obra.equals("desafina")) {
        	   System.out.println("Desafina");
        	   throw new ActuacionException("Esta desafinando");
           }else {
        	   System.out.println("No desafina la obra" + this.obra);
           }
        	   
    }
}
