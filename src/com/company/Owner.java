package com.company;

import java.time.LocalDate;

public class Owner {
    private String name;
    private String cpf;
    private String rg;
    private LocalDate birth;
    private Adress adress;

    public Owner(String name, String cpf, String rg, Adress adress) {
        super();
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.adress = adress;
    }

}
