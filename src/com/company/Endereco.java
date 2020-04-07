package com.company;

public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String complemento;

    public Endereco(String rua, String bairro, String cidade, String estado, String cep, String complemento) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.complemento = complemento;
    }

    public String toString() {
        return "Endereço do proprietário: \nRua = " + this.rua + "\nBairro = "
                + this.bairro + "\nCidade = " + this.cidade + "\nEstado = " + this.estado
                + "\nCep = " + this.cep + "\nComplemento = " + this.complemento + "\n";
    }
}
