package com.lambdaschool;

public class Yacht extends Vehicle implements WaterTravel {

    @Override
    public void sail() {
        System.out.println("Sailing with a sail!");
    }

    @Override
    public void travel() {
sail();
    }
}
