package com.nashik.myNashik.dreams;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class Description_of_picnicplaces extends AppCompatActivity {
    TextView heading,near_to,distance,description;
    TextView images,location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_of_picnicplaces);
        heading = (TextView) findViewById(R.id.heading);
        near_to = (TextView) findViewById(R.id.near_to);
        distance = (TextView) findViewById(R.id.distance);
        description = (TextView) findViewById(R.id.description);
        images = (TextView) findViewById(R.id.images);
        location=(TextView)findViewById(R.id.location);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        final String place_naam = extras.getString("place_naam");
        String city_value = extras.getString("city");
        String near_to_value = extras.getString("near_to");
        String distance_value = extras.getString("distance");
        String description_value = extras.getString("description");

        heading.setText(place_naam);
        near_to.setText("Near to "+near_to_value);
        distance.setText("Distance from Nashik "+distance_value);
        description.setText(description_value);

        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/Crimson-Roman.ttf");
        description.setTypeface(typeface1);

        images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.google.co.in/search?hl=en&site=imghp&tbm=isch&q=" + place_naam); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=Nashik,Maharashtra,India&daddr=" + place_naam + ",Maharashtra,India&dirflg=c"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}