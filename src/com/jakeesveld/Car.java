package com.jakeesveld;

public class Car extends Vehicle implements GroundTravel {
    @Override
    public void drive() {
        System.out.println("The Car drives down the road.");
    }

    @Override
    public void travel() {
        drive();
    }
}
