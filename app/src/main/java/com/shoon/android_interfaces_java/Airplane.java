package com.shoon.android_interfaces_java;

public class Airplane extends Vehicle implements AirTravel{
    @Override
    String travel() {
        return fly();
    }


    @Override
    public String fly() {
        return "Fly with wings";
    }
}
