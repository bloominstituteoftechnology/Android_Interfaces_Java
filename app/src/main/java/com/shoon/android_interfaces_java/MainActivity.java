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
        tv.append(((Airplane) at).travel());
    }
}
