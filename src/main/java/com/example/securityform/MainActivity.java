package com.example.securityform;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText visitorname, visitornumber, visitorvehicle, time, flatnumber, ownername;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Hooks
        visitorname = findViewById(R.id.visitorname);
        visitornumber = findViewById(R.id.visitornumber);
        visitorvehicle = findViewById(R.id.visitorvehicle);
        time = findViewById(R.id.time);
        flatnumber = findViewById(R.id.flatnumber);
        ownername = findViewById(R.id.ownername);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String getVisitorName = visitorname.getText().toString();
                String getVisitorNumber = visitornumber.getText().toString();
                String getVisitorVehicle = visitorvehicle.getText().toString();
                String getTime = time.getText().toString();
                String getFlatNumber = flatnumber.getText().toString();
                String getOwnerName = ownername.getText().toString();
                //Pass data to 2nd activity
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("visitorname", getVisitorName);
                intent.putExtra("visitornumber", getVisitorNumber);
                intent.putExtra("visitorvehicle", getVisitorVehicle);
                intent.putExtra("time", getTime);
                intent.putExtra("flatnumber", getFlatNumber);
                intent.putExtra("ownername", getOwnerName);
                startActivity(intent);
            }
        });
    }
}