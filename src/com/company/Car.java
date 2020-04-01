package com.company;

import java.time.LocalDate;

public class Car{
    //Modelo/Cor/Ano/Marca/Chassi/Proprietário/Velocidade máxima/Velocidade atual/Nr de portas/tem teto solar?/Nr Marchas/tem cambio automatico?/Volume de combustível//
    private String model;
    private String color;
    private LocalDate year;
    private String marker;
    private String chassi;
    private Owner owner;
    private double maxspeed;
    private double currentspeed;
    private Integer doors;
    private Boolean solar;
    private Integer gear;
    private Boolean automatic;
    private double fuel;

    public Car(Owner owner) {
        this.owner = owner;
        this.currentspeed = 0;
        this.fuel = 0;
        this.gear = 0;
    }

    public void accelerate(double speed) {
        speed = speed + 1;
    }

    public void stop(double speed) {
        speed = 0;
    }

    public void upgear(Integer gear) {
        gear = gear + 1;
    }

    public void downgear(Integer gear) {

        gear = gear - 1;
    }

    public double getAutonomia(double consumo){
        return consumo * this.fuel;
    }
}
