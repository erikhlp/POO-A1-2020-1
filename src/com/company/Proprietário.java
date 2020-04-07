package com.company;

public class Proprietário {
    private String nome;
    private String cpf;
    private String rg;
    private String dataDeNascimento;

    public Proprietário(String nome, String cpf, String rg, String dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String toString() {
        return "Dados do proprietário: Nome: " + this.nome + "\nCpf: " + this.cpf + "\nRg: " + this.rg + "\nData de nascimento: " + this.dataDeNascimento;
    }
}

