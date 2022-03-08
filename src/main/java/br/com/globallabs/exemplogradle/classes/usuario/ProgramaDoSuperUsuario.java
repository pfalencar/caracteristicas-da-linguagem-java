package br.com.globallabs.exemplogradle.classes.usuario;

public class ProgramaDoSuperUsuario {

    public static void main(String[] args) {

        var superUsuario = new SuperUsuario("root", "1234");

        String login = superUsuario.getLogin();
        String senha = superUsuario.getSenha();

        String root = superUsuario.nome;

        System.out.println("login: " + login);
        System.out.println("senha: " + senha);
    }
}
