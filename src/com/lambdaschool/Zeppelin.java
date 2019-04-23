package com.lambdaschool;

public class Zeppelin extends Vehicle implements AirTravel {

    @Override
    public void fly() {
        System.out.println("Sailing with hot air!");
    }

    @Override
    public void travel() {
        fly();
    }
}
