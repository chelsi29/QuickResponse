package com.example.quickresponse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    ImageView img,img1,img2,img3,img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//      Function Image click event...
        ImageView img = (ImageView) findViewById(R.id.fun);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(HomeActivity.this, FunctionActivity.class);
                startActivity(I);
            }
        });
//      Driving image click event...

        ImageView img1 = (ImageView) findViewById(R.id.drv);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(HomeActivity.this, DrivingActivity.class);
                startActivity(I);
            }
        });
//      Meeting image click event...

        ImageView img2 = (ImageView) findViewById(R.id.met);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(HomeActivity.this, MeetingActivity.class);
                startActivity(I);
            }
        });

//      Sleeping image click event...

        ImageView img3 = (ImageView) findViewById(R.id.slp);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(HomeActivity.this, SleepingActivity.class);
                startActivity(I);
            }
        });
//      Custom image click event...

        ImageView img4 = (ImageView) findViewById(R.id.custm);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(HomeActivity.this, AddMessageActivity.class);
                startActivity(I);
            }
        });
    }
}