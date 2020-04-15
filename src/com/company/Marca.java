package com.company;

public class Marca {
    private String modelo;
    private String cor;
    private int ano;
    private String marca;
    private String chassi;

    public Marca(String modelo, String cor, int ano, String marca, String chassi) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
        this.chassi = chassi;
    }

    public String getChassi() {
        return chassi;
    }

    public String toString() {
        return "Marca: " + this.marca + "\nModelo: " + this.modelo + "\nCor: " + this.cor + "\nAno: " + this.ano + "\nChassi: " + this.chassi;
    }
}