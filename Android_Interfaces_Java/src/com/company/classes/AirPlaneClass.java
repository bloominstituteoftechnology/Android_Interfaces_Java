package com.company.classes;

import com.company.interfaces.AirTravel;
import com.company.Vehicle;

public class AirPlaneClass extends Vehicle implements AirTravel {
    @Override
    public void fly() {
        System.out.println("Airplane travels by air");
    }

    @Override
    public void travel() {
        fly();
    }
}
