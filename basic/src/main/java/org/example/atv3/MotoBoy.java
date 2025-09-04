package org.example.atv3;

public class MotoBoy extends Funcionario{

    private String carteiraDeHabilitacao;

    public MotoBoy(String dataNascimento, String nome, double salarioBase, Setor setor, Sexo sexo, String carteiraDeHabilitacao) {
        super(dataNascimento, nome, salarioBase, setor, sexo);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return "MotoBoy{" +
                "carteiraDeHabilitacao='" + carteiraDeHabilitacao + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                ", setor=" + setor +
                ", sexo=" + sexo +
                '}';
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase;
    }

}
