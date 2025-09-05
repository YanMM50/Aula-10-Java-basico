package org.example.atv3;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca implements Contratacao {
    private static final double PREMIO = 0.1;

    public Diretor(String nome, String cpf, String rg, Sexo genero, double salarioBase,
                   LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao, Bonificacao.DIRETOR);
    }

    @Override
    public double getSalarioFinal() {
        return super.getSalarioFinal() + (salarioBase * PREMIO);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo funcionário: " + funcionario.nome);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo funcionário: " + funcionario.nome);
    }

    @Override
    public String toString() {
        return super.toString() + " Diretor{}";
    }
}
