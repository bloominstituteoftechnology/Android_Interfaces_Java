package com.example.android_interfaces_java;

import android.util.Log;

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
