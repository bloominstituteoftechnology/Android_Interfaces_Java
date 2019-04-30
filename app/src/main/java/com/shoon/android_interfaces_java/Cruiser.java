package com.shoon.android_interfaces_java;

public class Cruiser extends Vehicle implements WaterTravel {
    @Override
    String travel() {
        return  sail();
    }

    @Override
    public String sail() {
        return  "Sail";
    }
}
