package br.com.globallabs.exemplogradle.interfaces;

public interface Veiculo {

    String registro();

    default void ligar() {
        System.out.println("Ligando veiculo...");
    }
}
