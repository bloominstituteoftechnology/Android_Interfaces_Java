package com.shoon.android_interfaces_java;

public class Bus extends Vehicle implements GroundTravel {
    @Override
    public String drive() {
        return "travel";
    }

    @Override
    String travel() {
        return "travel";
    }
}
