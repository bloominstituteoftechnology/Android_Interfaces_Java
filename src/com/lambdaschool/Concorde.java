package com.lambdaschool;

public class Concorde extends Vehicle implements AirTravel {

    @Override
    public void fly() {
        System.out.println("Flying at supersonic speed!");
    }

    @Override
    public void travel() {
        fly();
    }
}
