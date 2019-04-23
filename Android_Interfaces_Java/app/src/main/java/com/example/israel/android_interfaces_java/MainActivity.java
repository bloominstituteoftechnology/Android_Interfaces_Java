package com.example.israel.android_interfaces_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.israel.android_interfaces_java.TravelType.AirTravel;
import com.example.israel.android_interfaces_java.TravelType.GroundTravel;
import com.example.israel.android_interfaces_java.TravelType.WaterTravel;
import com.example.israel.android_interfaces_java.Vehicle.Car;
import com.example.israel.android_interfaces_java.Vehicle.Helicopter;
import com.example.israel.android_interfaces_java.Vehicle.Rocket;
import com.example.israel.android_interfaces_java.Vehicle.SailBoat;
import com.example.israel.android_interfaces_java.Vehicle.SpeedBoat;
import com.example.israel.android_interfaces_java.Vehicle.Tank;
import com.example.israel.android_interfaces_java.Vehicle.Vehicle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Helicopter());
        vehicles.add(new Rocket());
        vehicles.add(new SailBoat());
        vehicles.add(new SpeedBoat());
        vehicles.add(new Tank());

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof AirTravel) {
                ((AirTravel)vehicle).fly();
            } else if (vehicle instanceof GroundTravel) {
                ((GroundTravel)vehicle).drive();
            } else if (vehicle instanceof WaterTravel) {
                ((WaterTravel)vehicle).sail();
            }
        }
    }
}
