package br.com.globallabs.exemplogradle.classes.tipos.primitivos;

public class DefaultValues {
    public static void main(String[] args) {
        Default d = new Default();
//        d.i = 10;
//        d.active = true;
        System.out.println("isActive: " + d.isActive() + "\ni = " + d.getI());
    }
}

class Default {
    int i;
    boolean active;

    public int getI() {   return i;  }

    public boolean isActive() {  return active; }
}
