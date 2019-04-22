package com.jakeesveld;

public class Motorcycle extends Vehicle implements GroundTravel {
    @Override
    public void drive() {
        System.out.println("The motorcycle cruises down the interstate");
    }

    @Override
    public void travel() {
        drive();
    }
}
