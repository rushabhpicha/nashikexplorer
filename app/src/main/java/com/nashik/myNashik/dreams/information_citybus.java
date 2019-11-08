package com.nashik.myNashik.dreams;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;



public class information_citybus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_citybus);
        TextView timings= (TextView) findViewById(R.id.timings);
        TextView timings_values= (TextView) findViewById(R.id.timings_values);
        TextView stops_values= (TextView) findViewById(R.id.stops_values);
        stops_values.setMovementMethod(new ScrollingMovementMethod());

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            timings_values.setText(bundle.getString("timings_values"));
            stops_values.setText(bundle.getString("stops_values"));
        }
    }
}
