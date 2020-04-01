package com.company;

public class Main {

    public static void main(String[] args) {
        Owner owner1 = new Owner("João", "21312331233", "3112107000", "asdasdasdasd");

        Car car1 = new Car(owner1);

        car1.accelerate();


    }
}
