package com.example.israel.android_interfaces_java.Vehicle;

import android.util.Log;

import com.example.israel.android_interfaces_java.TravelType.WaterTravel;

public class SailBoat extends Vehicle implements WaterTravel {
    @Override
    public void sail() {
        Log.i(Vehicle.TAG, "sailboats travel with sail");
    }
}
