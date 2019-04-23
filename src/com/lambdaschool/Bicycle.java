package com.lambdaschool;

public class Bicycle extends Vehicle implements GroundTravel {

    @Override
    public void drive() {
        System.out.println("Driving via pedals!");
    }

    @Override
    public void travel() {
        drive();
    }
}
