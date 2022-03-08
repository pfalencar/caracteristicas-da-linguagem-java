package br.com.globallabs.exemplogradle.abstracts;

public class Programa {
    public static void main(String[] args) {
        //NÃO posso dar um "new" em FormaGeometrica, porque ela é abstrata, ela não deixa. Nõo pode ser instanciada.
//        FormaGeometrica formaGeometrica = new FormaGeometrica();

        FormaGeometrica quadrado = new Quadrado("Quadrado", 9.0);

        System.out.println(quadrado);
        System.out.println(quadrado.area());
        System.out.println(quadrado.nome());
        System.out.println(quadrado.desenha(23, 83));

    }
}
