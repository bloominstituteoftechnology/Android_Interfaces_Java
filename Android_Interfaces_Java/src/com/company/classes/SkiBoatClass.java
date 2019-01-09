package com.company.classes;

import com.company.Vehicle;
import com.company.interfaces.WaterTravel;

public class SkiBoatClass extends Vehicle implements WaterTravel {
    @Override
    public void travel() {
        sail();
    }

    @Override
    public void sail() {
        System.out.println("Ski boats travels by water");

    }
}
