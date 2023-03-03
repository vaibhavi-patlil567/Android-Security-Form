package com.example.securityform;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView visitorname, visitornumber, visitorvehicle, time, flatnumber, ownername;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Hooks
        visitorname = findViewById(R.id.set_visitorname);
        visitornumber = findViewById(R.id.set_visitornumber);
        visitorvehicle = findViewById(R.id.set_visitorvehicle);
        time = findViewById(R.id.set_time);
        flatnumber = findViewById(R.id.set_flatnumber);
        ownername = findViewById(R.id.set_ownername);


        Intent intent = getIntent();
        String getVisitorName = intent.getStringExtra("visitorname");
        String getVisitorNumber = intent.getStringExtra("visitornumber");
        String getVisitorVehicle = intent.getStringExtra("visitorvehicle");
        String getTime = intent.getStringExtra("time");
        String getFlatNumber = intent.getStringExtra("flatnumber");
        String getOwnerName = intent.getStringExtra("ownername");

        visitorname.setText(getVisitorName);
        visitornumber.setText(getVisitorNumber);
        visitorvehicle.setText(getVisitorVehicle);
        time.setText(getTime);
        flatnumber.setText(getFlatNumber);
        ownername.setText(getOwnerName);
    }
}