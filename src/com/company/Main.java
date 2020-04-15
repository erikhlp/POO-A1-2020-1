package com.company;

import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Proprietário dadosDoProprietario = new Proprietário("Érikh", "12312312312", "1231231231", "8 de Março de 2001");
        Endereco endereçoDoProprietario = new Endereco("Dr Pereira Neto", "Tristeza", "Porto Alegre", "Rio Grande do Sul", "91910670", "650");
        Marca modeloCarro = new Marca("Corsa", "Prata", 2020, "Chevrolet", "512");
        Marca modeloCarro2 = new Marca("Mustang", "Preto", 2010, "Chevrolet", "321");
        Carro corsa = new Carro(220, 60, 4, "Sim", 6, "Não", 11, 3);
        Carro mustang = new Carro(100, 60, 2, "Sim", 6, "Não", 11, 2);

        corsa.calculoAutonomiaDeViagem(11);

        corsa.acelerar();

        corsa.acelerar();

        corsa.acelerar();

        System.out.println("\n");

        System.out.println(dadosDoProprietario);

        System.out.println(endereçoDoProprietario);

        System.out.println(corsa);

        System.out.println(modeloCarro);

        Venda novaVenda = new Venda();

        novaVenda.adicionarCarro(modeloCarro);

        System.out.println(novaVenda);

        System.out.println("\n" + novaVenda.obterVeiculo("512"));
    }
}