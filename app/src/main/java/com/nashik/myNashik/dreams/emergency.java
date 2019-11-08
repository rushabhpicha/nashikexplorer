package com.nashik.myNashik.dreams;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.nashik.myNashik.emergency.fire_brigade;

import com.nashik.myNashik.emergency.bloodbank;

public class emergency extends AppCompatActivity {
    Toolbar toolbar;
    ImageView airplane;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        //setSupportActionBar(toolbar);
         ImageView mseb= (ImageView) findViewById(R.id.mseb);
       // ImageView railway= (ImageView) findViewById(R.id.railway);
        ImageView blood_bank= (ImageView) findViewById(R.id.bloodbank);
       // airplane= (ImageView) findViewById(R.id.airplane);
        final ImageView government= (ImageView) findViewById(R.id.government);
        ImageView ambulance= (ImageView) findViewById(R.id.ambulance);
        ImageView police= (ImageView) findViewById(R.id.police);
        final ImageView firebrigade= (ImageView) findViewById(R.id.firebrigade);
//        airplane.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent airplane=new Intent(emergency.this,com.example.picha.emergency.airplane.class);
//                startActivity(airplane);
//            }
//        });
        blood_bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent blood_bank=new Intent(emergency.this, bloodbank.class);
                startActivity(blood_bank);
            }
        });
        mseb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mseb=new Intent(emergency.this, com.nashik.myNashik.emergency.mseb.class);
                startActivity(mseb);
            }
        });

        ambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ambulance=new Intent(emergency.this, com.nashik.myNashik.emergency.ambulance.class);
                startActivity(ambulance);
            }
        });

        police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mseb=new Intent(emergency.this, com.nashik.myNashik.emergency.police.class);
                startActivity(mseb);
            }
        });

        firebrigade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mseb=new Intent(emergency.this,fire_brigade.class);
                startActivity(mseb);
            }
        });

        government.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mseb=new Intent(emergency.this, com.nashik.myNashik.emergency.government.class);
                startActivity(mseb);
            }
        });

//        railway.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent mseb=new Intent(emergency.this,railway.class);
//                startActivity(mseb);
//            }
//        });
    }
}
