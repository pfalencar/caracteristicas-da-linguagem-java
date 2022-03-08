package br.com.globallabs.exemplogradle.classes.pessoa;

import br.com.globallabs.exemplogradle.classes.cliente.Cliente;

public class ProgramaDoCliente {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(43);

        //Consegue acessar relatorio(), pq esta classe está no mesmo pacote que Pessoa
        System.out.println(cliente.relatorio());    //OK
    }
}
