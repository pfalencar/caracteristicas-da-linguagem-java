package br.com.globallabs.exemplogradle.classes.tipos.tipagem;

public class TipoInferido {

    public static void main(String[] args) {

        var numero = Integer.valueOf("123456");

        var texto = "Este é um texto.";
//        texto = 342;      //NOK

        System.out.println(numero);
        System.out.println(texto);
    }
}
