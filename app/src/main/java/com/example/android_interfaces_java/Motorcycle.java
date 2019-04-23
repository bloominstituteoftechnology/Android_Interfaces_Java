package com.example.android_interfaces_java;

import android.util.Log;

public class Motorcycle extends Vehicle implements GroundTravel {
    @Override
    public void drive() {
        Log.i("traveling"," Motorcycle Drives on 2 wheels");
    }

    @Override
    void travel() {
        drive();
    }
}

