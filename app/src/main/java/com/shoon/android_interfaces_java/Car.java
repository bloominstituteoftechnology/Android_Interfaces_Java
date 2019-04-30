package com.shoon.android_interfaces_java;

public class Car extends Vehicle implements GroundTravel {
    @Override
    public String drive() {
        return "wheel";
    }

    @Override
    String travel() {
        return drive();
    }

}

