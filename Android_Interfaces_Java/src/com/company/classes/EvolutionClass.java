package com.company.classes;

import com.company.interfaces.AirTravel;
import com.company.interfaces.DriveTravel;
import com.company.Vehicle;
import com.company.interfaces.WaterTravel;

public class EvolutionClass extends Vehicle implements AirTravel, WaterTravel, DriveTravel {
    @Override
    public void fly() {
        System.out.println("Evolution travels by air");

    }

    @Override
    public void drive() {
        System.out.println("Evolution travels by road");

    }

    @Override
    public void travel() {
        fly();
        drive();
        sail();
    }

    @Override
    public void sail() {
        System.out.println("Evolution travels by water");

    }
}
