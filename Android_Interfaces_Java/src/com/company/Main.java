package com.company;

import com.company.classes.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new AirPlaneClass());
        vehicles.add(new CarClass());
        vehicles.add(new EvolutionClass());
        vehicles.add(new ShipClass());
        vehicles.add(new SkiBoatClass());
        vehicles.add(new TankClass());

        for (Vehicle vehicle : vehicles) {
            vehicle.travel();
        }
    }
}
