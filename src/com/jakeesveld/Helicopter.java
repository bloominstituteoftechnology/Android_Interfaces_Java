package com.jakeesveld;

public class Helicopter extends Vehicle implements AirTravel {
    @Override
    public void fly() {
        System.out.println("The helicopter spins it's rotor and takes off into the sky.");
    }

    @Override
    public void travel() {
        fly();
    }
}
