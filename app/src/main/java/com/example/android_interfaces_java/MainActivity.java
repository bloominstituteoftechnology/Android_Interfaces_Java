package com.example.android_interfaces_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for(int i = 0;i <5; i++){
            vehicles.add(new Airplane());
            vehicles.add(new Car());
            vehicles.add(new PontoonBoat());
            vehicles.add(new Moped());
            vehicles.add(new Motorcycle());
            vehicles.add(new Tank());
        }
        for (Vehicle vehicle:vehicles){
            vehicle.travel();
        }
    }
}
