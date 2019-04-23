package com.example.android_interfaces_java;

import android.util.Log;

import com.example.android_interfaces_java.Interfaces.AirTravel;
import com.example.android_interfaces_java.Vehicle;

public class Airplane extends Vehicle implements AirTravel {
    @Override
    public void fly() {
        Log.i("traveling"," Airplane flies on wings");

    }

    @Override
    void travel() {
        fly();
    }
}
