package com.example.israel.android_interfaces_java.Vehicle;

import android.util.Log;

import com.example.israel.android_interfaces_java.TravelType.GroundTravel;

public class Tank extends Vehicle implements GroundTravel {

    @Override
    public void drive() {
        Log.i(Vehicle.TAG, "tanks drive with treads");
    }
}
