package com.example.classe.abstrata.classeabstratacontribuintesex;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Entre com a quantidade de pagadores: ");
        int qtdPagadores = input.nextInt();

        for (int i=1;i<=qtdPagadores;i++){
            System.out.println("Pessoa " + i + ": ");
            System.out.print("Fisica ou Juridica: (f/j)? ");
            char ch = input.next().charAt(0);

            System.out.print("Nome: ");
            input.nextLine();
            String nome = input.nextLine();
            System.out.print("Renda anual: ");
            double renda = input.nextDouble();

            if(ch == 'f'){
                double imposto;
                System.out.print("Gasto com saude: ");
                double gstSaude = input.nextDouble();

                if(renda >= 20000){
                   imposto = 0.25;
                } else{
                    imposto = 0.15;
                }

                Pessoa fisica = new Fisica(nome, renda, gstSaude, imposto);
                pessoas.add(fisica);

            } else if(ch == 'j'){
                System.out.print("Informe a quantidade de funcionários: ");
                int qtdFuncionarios = input.nextInt();
                double imposto;

                if(qtdFuncionarios > 10) {
                    imposto = 0.14;
                } else {
                    imposto = 0.16;
                }
                Pessoa juridica = new Juridica(nome, renda, imposto, qtdFuncionarios);
                pessoas.add(juridica);
            }
        }
        System.out.println();
        System.out.println("IMPOSTOS PAGOS: ");
        for(Pessoa c : pessoas){
            System.out.println(c.getNome() + ": R$" + c.calcImposto());
        }

        double sum = 0;
        for (Pessoa x : pessoas){
            sum = sum + x.calcImposto();
        }
        System.out.println();
        System.out.print("TOTAL IMPOSTOS: R$" + sum);
    }

}
