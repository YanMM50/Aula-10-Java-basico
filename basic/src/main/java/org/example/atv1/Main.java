package org.example.atv1;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Pato pato = new Pato();
        Galo galo = new Galo();

        System.out.println(cachorro.emitirSom());
        System.out.println(gato.emitirSom());
        System.out.println(galo.emitirSom());
        System.out.println(pato.emitirSom());
    }
}
