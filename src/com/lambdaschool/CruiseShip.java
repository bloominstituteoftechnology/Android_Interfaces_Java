package com.lambdaschool;

public class CruiseShip extends Vehicle implements WaterTravel {

    @Override
    public void sail() {
        System.out.println("Sailing with a turbine engine!");
    }

    @Override
    public void travel() {
        sail();
    }
}
