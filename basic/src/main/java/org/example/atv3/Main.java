package org.example.atv3;

public class Main {
    public static void main(String[] args) {
        Funcionario motoboy = new MotoBoy("18/12/2000", "Yan", 3.000,Setor.OPERACOES, Sexo.MASCULINO,"A");
        Funcionario diretor = new Diretor("25/10/1999", "Maria", 4.000, Setor.FINANCEIRO, Sexo.FEMININO);

        System.out.println(motoboy.toString());
        System.out.println("Salário Final Motoboy: " + motoboy.getSalarioFinal());

        System.out.println(diretor.toString());
        System.out.println("Salário Final Diretor: " + diretor.getSalarioFinal());



    }
}
