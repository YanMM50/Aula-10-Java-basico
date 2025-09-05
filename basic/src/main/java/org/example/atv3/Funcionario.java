package org.example.atv3;

import java.time.LocalDate;
import java.time.Period;

public abstract class Funcionario implements SalarioFinal {
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Sexo genero;
    protected double salarioBase;
    protected LocalDate dataNascimento;
    protected LocalDate dataAdmissao;

    public Funcionario(String nome, String cpf, String rg, Sexo genero, double salarioBase,
                       LocalDate dataNascimento, LocalDate dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.salarioBase = salarioBase;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
    }

    public int getIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", genero=" + genero.getTexto() +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
