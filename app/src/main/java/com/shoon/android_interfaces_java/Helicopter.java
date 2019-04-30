package com.shoon.android_interfaces_java;

public class Helicopter extends Vehicle implements AirTravel {
    public Helicopter() {
    }

    String travel() {
        return fly();
    }


    public String fly() {
        return  "Fly with Wings";
    }
}