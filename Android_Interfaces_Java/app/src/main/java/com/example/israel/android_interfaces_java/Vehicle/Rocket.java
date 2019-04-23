package com.example.israel.android_interfaces_java.Vehicle;

import com.example.israel.android_interfaces_java.TravelType.AirTravel;
import com.example.israel.android_interfaces_java.Vehicle.Vehicle;

public class Rocket extends Vehicle implements AirTravel {

    @Override
    public void fly() {
        System.out.println("fly with fire");
    }
}
