package com.lambdaschool;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();

        vehicleArrayList.add(new Concorde());
        vehicleArrayList.add(new CruiseShip());
        vehicleArrayList.add(new Bicycle());
        vehicleArrayList.add(new Zeppelin());
        vehicleArrayList.add(new Yacht());
        vehicleArrayList.add(new SUV());

        for (Vehicle vehicle:vehicleArrayList)
            vehicle.travel();
    }
}
