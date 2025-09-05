package org.example.atv3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Funcionario motoboy = new MotoBoy("Yan", "111.111.111-11", "123456", Sexo.MASCULINO, 3000,
                LocalDate.of(2000, 12, 18), LocalDate.of(2020, 1, 10), "ABC-1234");

        Funcionario gerente = new Gerente("Maria", "222.222.222-22", "654321", Sexo.FEMININO, 4000,
                LocalDate.of(1995, 5, 10), LocalDate.of(2019, 3, 5));

        Diretor diretor = new Diretor("João", "333.333.333-33", "987654", Sexo.MASCULINO, 8000,
                LocalDate.of(1988, 8, 15), LocalDate.of(2015, 2, 20));

        System.out.println(motoboy + " | Salário Final: " + motoboy.getSalarioFinal());
        System.out.println(gerente + " | Salário Final: " + gerente.getSalarioFinal());
        System.out.println(diretor + " | Salário Final: " + diretor.getSalarioFinal());

        diretor.admitir(motoboy);
        diretor.demitir(gerente);
    }
}
