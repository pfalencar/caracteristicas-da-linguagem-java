package br.com.globallabs.exemplogradle.classes.pessoa;

public class ProgramaPessoaFisica {

    public static void main(String[] args) {

       PessoaFisica pessoaFisica = new PessoaFisica(33, 52.4f);

       //consigo acessar relatorio(), que é protected, pq esta classe está no mesmo pacote de Pessoa
       System.out.println(pessoaFisica.relatorio());

    }
}
