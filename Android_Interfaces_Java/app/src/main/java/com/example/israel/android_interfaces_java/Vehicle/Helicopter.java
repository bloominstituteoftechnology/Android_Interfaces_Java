package com.example.israel.android_interfaces_java.Vehicle;

import com.example.israel.android_interfaces_java.TravelType.AirTravel;

public class Helicopter extends Vehicle implements AirTravel {

    @Override
    public void fly() {
        System.out.println("fly with rotor");
    }
}
