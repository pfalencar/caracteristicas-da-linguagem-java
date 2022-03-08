package br.com.globallabs.exemplogradle.classes.pessoa;

public class Pessoa {

    private Integer idade;
    private Float peso;

    public Pessoa() {
    }

    public Pessoa(final Integer idade) {
        this.idade = idade;
    }

    public Pessoa(final Integer idade, final Float peso) {
        this.idade = idade;
        this.peso = peso;
    }

    public Integer getIdade() { return idade; }

    public Float getPeso() { return peso; }

    //protected é acessado somente via classes do mesmo pacote e herança
    protected String relatorio() { return "Idade: " + idade + "\nPeso: " + peso;  }
}
