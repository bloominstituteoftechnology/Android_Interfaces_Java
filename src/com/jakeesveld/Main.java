package com.jakeesveld;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boat boat = new Boat();
        boat.travel();
        Car car = new Car();
        car.travel();
        Helicopter helicopter = new Helicopter();
        helicopter.travel();
        HydroPlane hydroPlane = new HydroPlane();
        hydroPlane.travel();
        JetSki jetSki = new JetSki();
        jetSki.travel();
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.travel();
    }
}
