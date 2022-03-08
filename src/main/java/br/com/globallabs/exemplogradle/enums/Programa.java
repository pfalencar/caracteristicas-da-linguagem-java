package br.com.globallabs.exemplogradle.enums;

public class Programa {

    public static void main(String[] args) {

//        final TipoVeiculo tipoVeiculo = new TipoVeiculo();    //Enum types cannot be instantiated

        System.out.println(TipoVeiculo.AQUATICO);   //acesso um enum de forma estática
        System.out.println(TipoVeiculo.AEREO);
        System.out.println(TipoVeiculo.TERRESTE);

        //Construir um ENUM:
//        System.out.println(TipoVeiculo.valueOf("aereo")); //não tem "aereo" tudo minúsculo
        System.out.println(TipoVeiculo.valueOf("AEREO"));

        for (TipoVeiculo tipo: TipoVeiculo.values()) {
            System.out.println("Tipo: " + tipo);
        }

        System.out.println("Codigo do status CLOSE = " + Status.CLOSE.getCod());
        System.out.println("Texto do status OPEN = " + Status.OPEN.getTexto());

    }

}
