package org.example.atv2;


public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Mutiplicacao mutiplicacao = new Mutiplicacao();
        Divisao divisao = new Divisao();

        System.out.println(soma.calcular(1,1));
        System.out.println(subtracao.calcular(2,2));
        System.out.println(mutiplicacao.calcular(3,3));
        System.out.println(divisao.calcular(4,4));


    }
}