package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Proprietário dadosDoProprietario = new Proprietário("Érikh", "12312312312", "1231231231", "8 de Março de 2001");
        Endereco endereçoDoProprietario = new Endereco("Dr Pereira Neto", "Tristeza", "Porto Alegre", "Rio Grande do Sul", "91910670", "650");
        Marca modeloCarro = new Marca("Corsa", "Prata", 2020, "Chevrolet", 512);
        Carro mustang = new Carro(220, 60, 4, "Sim", 6, "Não", 11, 3);
        mustang.calculoAutonomiaDeViagem(11);
        mustang.acelerar();
        mustang.acelerar();
        mustang.acelerar();
        mustang.acelerar();
        mustang.acelerar();
        System.out.println("\n");
        System.out.println(dadosDoProprietario);
        System.out.println(endereçoDoProprietario);
        System.out.println(mustang);
        System.out.println(modeloCarro);
    }
}