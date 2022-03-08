package br.com.globallabs.exemplogradle.classes.tipos.naoprimitivos;

public class NaoPrimitivos {

    public static void main(String[] args) {

        String texto = "Meu texto para apresentação";

        Void v;   //Tipo válido

        Object o = new Object();

        Number numero = Integer.valueOf(100);

        System.out.println(numero.toString());
    }
}
