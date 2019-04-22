package com.jakeesveld;

public class JetSki extends Vehicle implements WaterTravel {
    @Override
    public void travel() {
        sail();
    }

    @Override
    public void sail() {
        System.out.println("The Jetski zooms across the bay, leaving a cloud of mist in its wake.");
    }
}
