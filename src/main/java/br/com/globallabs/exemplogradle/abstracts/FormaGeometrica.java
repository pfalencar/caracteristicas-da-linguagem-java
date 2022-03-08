package br.com.globallabs.exemplogradle.abstracts;

public abstract class FormaGeometrica {

    public abstract String nome();

    public abstract Double area();

    public String desenha(int x, int y) {
        return "Desenhando nas coordenadas " + x + " e " + y;
//        return "Desenhando nas coordenadas X=$x e Y=$y";  //NOK
    }
}
