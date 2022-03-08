package br.com.globallabs.exemplogradle.classes.pessoa;

import br.com.globallabs.exemplogradle.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {

    public static void main(String[] args) {
        final var batman = new SuperUsuario("batman", "123456");

        batman.getLogin();
//        batman.getSenha(); //ERRO
//        batman.nome;    //ERRO

    }
}
