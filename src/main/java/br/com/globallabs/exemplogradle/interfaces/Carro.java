package br.com.globallabs.exemplogradle.interfaces;

public interface Carro extends Automovel{

    String marca();

    default void ligar() {
        System.out.println("Ligando o carro!");
    }
}
