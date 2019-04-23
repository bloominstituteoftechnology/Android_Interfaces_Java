package com.example.israel.android_interfaces_java.Vehicle;

import com.example.israel.android_interfaces_java.TravelType.GroundTravel;

public class Car extends Vehicle implements GroundTravel {

    @Override
    public void drive() {
        System.out.println("drive with wheels");
    }
}
