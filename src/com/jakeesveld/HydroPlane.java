package com.jakeesveld;

public class HydroPlane extends Vehicle implements AirTravel, WaterTravel {
    @Override
    public void fly() {
        System.out.println("The HydroPlane takes off into the air!");
    }

    @Override
    public void travel() {
        sail();
        System.out.print("And then...");
        fly();
    }

    @Override
    public void sail() {
        System.out.println("The HydroPlan glides along the water.");
    }
}
