package com.company;

public class Carro {
    private Proprietário proprietario;
    private int velocidadeMaxima;
    private int velocidadeAtual;
    private int numeroDePortasDoCarro;
    private String tetoSolar;
    private int numeroDeMarchasDoCarro;
    private String cambioAutomatico;
    private int volumeDeCombustivel;
    private int marchaAtual;
    private boolean marchaRe;
    private int autonomiaDeViagem;

    public Carro(int velocidadeMaxima, int velocidadeAtual, int numeroDePortasDoCarro, String tetoSolar, int numeroDeMarchasDoCarro, String cambioAutomatico, int volumeDeCombustivel, int marchaAtual) {
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.numeroDePortasDoCarro = numeroDePortasDoCarro;
        this.tetoSolar = tetoSolar;
        this.numeroDeMarchasDoCarro = numeroDeMarchasDoCarro;
        this.cambioAutomatico = cambioAutomatico;
        this.volumeDeCombustivel = volumeDeCombustivel;
        this.marchaAtual = marchaAtual;
    }

    public void acelerar() {
        ++this.velocidadeAtual;
    }

    public void frear() {
        this.velocidadeAtual = 0;
    }

    public void trocaDeMarcha() {
        ++this.marchaAtual;
    }

    public void reduzirMarcha() {
        --this.marchaAtual;
    }

    public void mudandoParaMarchaRe() {
        if (this.marchaAtual == -1 && this.velocidadeAtual > 0) {
            System.out.println("Não é possivel engatar a marcha ré em movimento.");
        } else if (this.marchaAtual == -1) {
            System.out.println("Voce ja esta na marcha ré");
        } else {
            this.marchaAtual = -1;
        }
    }

    public void getAutonomiaDeViagem() {
        System.out.println("A autonomia de viagem é de " + this.autonomiaDeViagem + "KM");
    }

    public void calculoAutonomiaDeViagem(int kmPercorridosPorLitro) {
        this.autonomiaDeViagem = kmPercorridosPorLitro * this.volumeDeCombustivel;
    }

    public String toString() {
        return "Dados do carro: \nVelocidade Maxima: " + this.velocidadeMaxima + "\nVelocidade Atual: " + this.velocidadeAtual + "\nNumero de portas do carro: " + this.numeroDePortasDoCarro + "\nTeto Solar: " + this.tetoSolar + "\nNumero de marchas do carro: " + this.numeroDeMarchasDoCarro + "\nCambio automatico: " + this.cambioAutomatico + "\nVolume de combustivel: " + this.volumeDeCombustivel + " Litros \nMarcha atual: " + this.marchaAtual + "\nMarcha re: " + this.marchaRe + "\nA autonomia de viagem é " + this.autonomiaDeViagem + " KM";
    }
}
