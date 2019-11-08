package com.nashik.myNashik.dreams;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class bus_timings extends AppCompatActivity {
    TextView textview= (TextView) findViewById(R.id.textView);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_timings);
        Bundle bundle=getIntent().getExtras();
        if (bundle!=null)
        {
            textview.setText(bundle.getString("data"));
        }
    }
}
