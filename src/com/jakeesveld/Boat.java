package com.jakeesveld;

public class Boat extends Vehicle implements WaterTravel {
    @Override
    public void travel() {
        sail();
    }

    @Override
    public void sail() {
        System.out.println("The boat sails off into the sunset.");
    }
}
