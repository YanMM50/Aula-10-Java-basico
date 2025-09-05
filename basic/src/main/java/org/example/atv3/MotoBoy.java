package org.example.atv3;

import java.time.LocalDate;

public class MotoBoy extends Funcionario {
    private String placaDaMoto;

    public MotoBoy(String nome, String cpf, String rg, Sexo genero, double salarioBase,
                   LocalDate dataNascimento, LocalDate dataAdmissao, String placaDaMoto) {
        super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase; // não tem bonificação
    }

    @Override
    public String toString() {
        return super.toString() + " MotoBoy{placaDaMoto='" + placaDaMoto + "'}";
    }
}
