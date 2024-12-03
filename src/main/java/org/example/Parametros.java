package org.example;

public class Parametros {
    private Parametros(){};
    private static Parametros instance = new Parametros();
    public static  Parametros getInstance(){
        return instance;
    }
    private String nomeMercado;
    private int qntCaixas;

    public String getNomeMercado(){
        return nomeMercado;
    }
    public void setNomeMercado(String nomeMercado){
        this.nomeMercado = nomeMercado;
    }
    public int getQntCaixas(){
        return qntCaixas;
    }
    public void setQntCaixas(int qntCaixas){
        this.qntCaixas = qntCaixas;
    }
}
