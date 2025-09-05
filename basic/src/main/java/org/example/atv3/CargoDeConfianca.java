package org.example.atv3;

import java.time.LocalDate;

public abstract class CargoDeConfianca extends Funcionario {
    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, String rg, Sexo genero, double salarioBase,
                            LocalDate dataNascimento, LocalDate dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
        this.bonificacao = bonificacao;
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase + (salarioBase * bonificacao.getValor());
    }
}
