package br.com.globallabs.exemplogradle.interfaces;

public class Programa {

    public static void main(String[] args) {
//        Gol gol = new Gol();  //OK
        final Carro gol = new Gol();
        System.out.println(gol.marca());
        gol.ligar();

        final Veiculo trator = new Trator();
        System.out.println(trator.registro());
        trator.ligar();

        final Fiesta fiesta = new Fiesta();
        fiesta.ligar();
        System.out.println(fiesta.marca());
        System.out.println(fiesta.registro());

//        Carro.super.ligar();  //só pode ser acessado por quem implementa, ou seja, pelo Fiesta, neste caso.
    }
}
