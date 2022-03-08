package br.com.globallabs.exemplogradle.finals;

public class CasualGamer extends Gamer {

    @Override
    public String keyboard() {  return "Simple keyboard";  }

//    public String mouse() { return super.mouse(); }    //não deixa sobrescrever, pq o método é final

    public String play(final String game) {
//        game = "Wow";     //Não pode atribuir um valor para a variável final 'game'
        return "Jogando " + game;
    }
}
