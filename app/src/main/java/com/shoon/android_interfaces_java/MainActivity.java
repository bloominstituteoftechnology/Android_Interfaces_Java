package com.shoon.android_interfaces_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=findViewById(R.id.text);
        Helicopter hp=new Helicopter();
        tv.setText(hp.fly());
        tv.append("\n");
        AirTravel at=new Airplane();
        tv.append(((Airplane) at).travel()+"\n");
        Vehicle[] vh=new Vehicle[6];
        vh[0]=new Airplane();
        vh[1]=new Boat();
        vh[2]=new Bus();

        vh[3]=new Car();
        vh[4]=new Cruiser();
        vh[5]=new Helicopter();
        for(int i=0;i<6;i++){
            tv.append(vh[i].travel()+"\n");
        }


    }
}
