package com.example.android_interfaces_java;

import android.util.Log;

import com.example.android_interfaces_java.Interfaces.WaterTravel;
import com.example.android_interfaces_java.Vehicle;

public class PontoonBoat extends Vehicle implements WaterTravel {
    @Override
    void travel() {
        sail();
    }

    @Override
    public void sail() {
        Log.i("traveling"," Pontoon Boat glides across the water");


    }
}
