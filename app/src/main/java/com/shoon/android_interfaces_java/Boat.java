package com.shoon.android_interfaces_java;

public class Boat extends Vehicle implements WaterTravel{
    @Override
    String travel() {
        return sail();
    }

    @Override
    public String sail() {
        return "Sail";
    }
}
