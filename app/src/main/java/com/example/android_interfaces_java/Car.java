package com.example.android_interfaces_java;

import android.util.Log;

public class Car extends Vehicle implements GroundTravel {
    @Override
    public void drive() {
        Log.i("traveling","Car drives on 4 wheels");

    }

    @Override
    void travel() {
        drive();
    }
}
