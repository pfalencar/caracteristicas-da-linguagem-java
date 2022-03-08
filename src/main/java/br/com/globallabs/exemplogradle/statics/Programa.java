package br.com.globallabs.exemplogradle.statics;

public class Programa {
    public static void main(String[] args) {
        Cachorro pitbull = new Cachorro();
        pitbull.zoologia = "Bipede";   //se o atributo é estático e eu mudar na minha instancia, vou mudar tem todas as instâncias.

        System.out.println("pitbull.zoologia = " + pitbull.zoologia);

        Cachorro viralata = new Cachorro();
        System.out.println("viralata.zoologia = " + viralata.zoologia);

        System.out.println(Cachorro.late());

    }
}
