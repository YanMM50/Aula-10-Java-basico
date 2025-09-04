package org.example.atv3;

public abstract class Funcionario {
    protected String nome;
    protected String dataNascimento;
    protected Sexo sexo;
    protected Setor setor;
    protected double salarioBase;

    public Funcionario(String dataNascimento, String nome, double salarioBase, Setor setor, Sexo sexo) {
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.setor = setor;
        this.sexo = sexo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public abstract double getSalarioFinal();


}
