package org.example.atv3;

public enum Bonificacao {
    GERENTE(0.2),
    DIRETOR(0.4);

    private final double valor;

    Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
