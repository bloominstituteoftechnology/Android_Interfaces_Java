package com.example.israel.android_interfaces_java.Vehicle;

import android.util.Log;

import com.example.israel.android_interfaces_java.TravelType.AirTravel;

public class Helicopter extends Vehicle implements AirTravel {

    @Override
    public void fly() {
        Log.i(Vehicle.TAG, "helicopters fly with rotor");
    }
}
