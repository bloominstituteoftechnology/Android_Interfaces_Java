package com.company.classes;

import com.company.interfaces.AirTravel;
import com.company.interfaces.DriveTravel;
import com.company.Vehicle;
import com.company.interfaces.WaterTravel;

public class EvolutionClass extends Vehicle implements AirTravel, WaterTravel, DriveTravel {
    @Override
    public void fly() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void travel() {

    }

    @Override
    public void sail() {

    }
}
