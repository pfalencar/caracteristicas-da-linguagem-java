package br.com.globallabs.exemplogradle.classes.cliente;

public class ProgramaDoCliente {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(18);

        cliente.getIdade();
        cliente.getPeso();

        //relatorio() não pode acssado, pq a classe Pessoa está em pacote diferente do pacote desta classe.
        //Apesar de a classe Cliente herdar de Pessoa
//        System.out.println(cliente.relatorio());      //NOK
    }
}
