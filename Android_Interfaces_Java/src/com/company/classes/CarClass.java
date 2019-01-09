package com.company.classes;

import com.company.interfaces.DriveTravel;
import com.company.Vehicle;

public class CarClass extends Vehicle implements DriveTravel {
    @Override
    public void drive() {
        System.out.println("Car travels by road");

    }

    @Override
    public void travel() {
        drive();
    }
}
