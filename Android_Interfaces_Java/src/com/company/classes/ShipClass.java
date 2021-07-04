package com.company.classes;

import com.company.interfaces.AirTravel;
import com.company.Vehicle;
import com.company.interfaces.WaterTravel;

public class ShipClass extends Vehicle implements WaterTravel {

    @Override
    public void travel() {
        sail();
    }

    @Override
    public void sail() {
        System.out.println("Ships travels by water");

    }
}
