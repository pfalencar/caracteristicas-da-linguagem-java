package br.com.globallabs.exemplogradle.interfaces;

public class Fiesta implements Carro, Veiculo{
    @Override
    public String marca() {
        return "Ford";
    }

    @Override
    public void ligar() {
        Carro.super.ligar();
        Veiculo.super.ligar();
    }

    @Override
    public String registro() {
        return "ISP939043094";
    }
}
