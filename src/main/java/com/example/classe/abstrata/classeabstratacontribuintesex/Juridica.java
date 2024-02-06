package com.example.classe.abstrata.classeabstratacontribuintesex;

public class Juridica extends Pessoa{
    private int nmrFunc;

    public Juridica(){
        super();
    }

    public Juridica(String nome, double rendaAnual, double imposto, int nmrFunc) {
        super(nome, rendaAnual, imposto);
        this.nmrFunc = nmrFunc;
    }

    public int getNmrFunc() {
        return nmrFunc;
    }

    public void setNmrFunc(int nmrFunc) {
        this.nmrFunc = nmrFunc;
    }

    @Override
    public double calcImposto() {
        return (getRendaAnual()*getImposto());
    }
}
