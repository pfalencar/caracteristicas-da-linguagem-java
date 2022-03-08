package br.com.globallabs.exemplogradle.statics;

public class Cachorro {

//    public String zoologia = "Quadrupide"; //Uma instância
    public static String zoologia = "Quadrupide";  //Todas as instâncias

    public static String late() {
        return "Au! Au!";
    }
}
