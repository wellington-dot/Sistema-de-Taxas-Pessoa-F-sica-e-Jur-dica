package com.example.classe.abstrata.classeabstratacontribuintesex;

public class Fisica extends Pessoa{

    private double gastSaude;

    public Fisica(){
        super();
    }

    public Fisica(String nome, double rendaAnual, double gastSaude, double imposto) {
        super(nome, rendaAnual, imposto);
        this.gastSaude = gastSaude;
    }

    public double getGastSaude() {
        return gastSaude;
    }

    public void setGastSaude(double gastSaude) {
        this.gastSaude = gastSaude;
    }

    @Override
    public double calcImposto() {
        return ((getRendaAnual()*getImposto()) - (gastSaude*0.5));
    }
}
