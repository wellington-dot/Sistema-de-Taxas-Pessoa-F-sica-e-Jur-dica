package com.example.classe.abstrata.classeabstratacontribuintesex;

public abstract class Pessoa {
    private String nome;
    private double rendaAnual;
    private double imposto;

    public Pessoa(){

    }

    public Pessoa(String nome, double rendaAnual, double imposto) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
        this.imposto = imposto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public abstract double calcImposto();
}
