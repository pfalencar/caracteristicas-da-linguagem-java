package br.com.globallabs.exemplogradle.abstracts;

public class Quadrado extends FormaGeometrica {

    private String nome;
    private Double area;

    public Quadrado(final String nome, final Double area) {
        this.nome = nome;
        this.area = area;
    }

    @Override
    public String nome() { return this.nome; }

    @Override
    public Double area() { return this.area; }

    @Override
    public String toString() {
        return "Quadrado{nome='" + nome + '\'' + ", area=" + area + '}';
//        final StringBuilder builder = "Quadrado{nome=" + this.nome + ", area=" + this.area + "}";    //NOK
//        return builder.toString();
    }
}
