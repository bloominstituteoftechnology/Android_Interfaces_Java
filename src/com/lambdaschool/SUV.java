package com.lambdaschool;

public class SUV extends Vehicle implements GroundTravel {

    @Override
    public void drive() {
        System.out.println("Driving with treads!");
    }

    @Override
    public void travel() {
        drive();
    }
}
