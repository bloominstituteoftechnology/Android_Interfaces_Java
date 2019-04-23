package com.example.android_interfaces_java;

import android.util.Log;

public class Tank extends Vehicle implements GroundTravel {
    @Override
    public void drive() {
        Log.i("traveling"," Tank rolls on tracks");

    }

    @Override
    void travel() {
        drive();
    }
}
