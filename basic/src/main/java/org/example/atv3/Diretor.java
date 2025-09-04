package org.example.atv3;

public class Diretor extends Funcionario{

    private final double PREMIO = 0.2;

    public Diretor(String dataNascimento, String nome, double salarioBase, Setor setor, Sexo sexo) {
        super(dataNascimento, nome, salarioBase, setor, sexo);
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase + (salarioBase * PREMIO);
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "dataNascimento='" + dataNascimento + '\'' +
                ", nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                ", setor=" + setor +
                ", sexo=" + sexo +
                '}';
    }
}
