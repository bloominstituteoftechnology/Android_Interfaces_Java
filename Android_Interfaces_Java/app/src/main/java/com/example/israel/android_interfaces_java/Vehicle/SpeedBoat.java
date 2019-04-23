package com.example.israel.android_interfaces_java.Vehicle;

import com.example.israel.android_interfaces_java.TravelType.WaterTravel;

public class SpeedBoat extends Vehicle implements WaterTravel {
    @Override
    public void sail() {
        System.out.println("sail with motor");
    }
}
