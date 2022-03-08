package br.com.globallabs.exemplogradle.classes.tipos.naoprimitivos;

//contruo um objeto e atribuo a um tipo primitivo
public class Unboxing {

    public static void main(String[] args) {
        int i = new Integer(23);

        int inteiro = 1024;

        boolean b = new Boolean(true);
        boolean b2 = Boolean.TRUE;
        boolean b3 = Boolean.getBoolean("false");

        System.out.println("i = " + i);
        System.out.println("inteiro = " + inteiro);
        System.out.println("b = " + b);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
    }
}
