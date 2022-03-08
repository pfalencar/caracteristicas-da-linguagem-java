package br.com.globallabs.exemplogradle.finals;

public class Programa {

    public static void main(String[] args) {
        //consigo criar instância de HardcoreGamer, a classe pode herdar, mas não pode ser herdada.
        final HardcoreGamer hardcoreGamer = new HardcoreGamer();


        final Gamer gamer = new Gamer();
        final CasualGamer casualGamer = new CasualGamer();

        final var game = "Quebra-cabeca";
//        game = "Wow";             //Não pode atribuir um valor para a variável final 'game'
//        System.out.println(casualGamer.play(game));

    }
}
