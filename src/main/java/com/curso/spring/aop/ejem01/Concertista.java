package com.curso.spring.aop.ejem01;

public class Concertista implements Representable{

    private String obra;
    private Publico publico;

    public Concertista() {
    }

    public void setObra(String obra) {
        this.obra = obra;
    }

    public void setPublico(Publico publico) {
        this.publico = publico;
    }

    public void actuar() throws ActuacionException {
       publico.tomarAsiento();
       try{
           System.out.println("Tocando la obra " + obra);
           publico.aplaudir();
       }catch(Exception e){
           publico.solicitarDevolucionEntrada();
       }
    }
}
