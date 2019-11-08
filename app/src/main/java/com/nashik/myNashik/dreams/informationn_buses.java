package com.nashik.myNashik.dreams;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class informationn_buses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informationn_buses);
        TextView bus_heading= (TextView) findViewById(R.id.bus_heading);
        TextView arrival= (TextView) findViewById(R.id.arrival);
        TextView departure= (TextView) findViewById(R.id.departure);
        TextView afirst= (TextView) findViewById(R.id.afirst);
        TextView dfirst= (TextView) findViewById(R.id.dfirst);
        TextView asecond= (TextView) findViewById(R.id.asecond);
        TextView dsecond= (TextView) findViewById(R.id.dsecond);
        TextView athird= (TextView) findViewById(R.id.athird);
        TextView dthird= (TextView) findViewById(R.id.dthird);
        TextView afourth= (TextView) findViewById(R.id.afourth);
        TextView dfourth= (TextView) findViewById(R.id.dfourth);
//        TextView bus_stop= (TextView) findViewById(R.id.busstop);
//        TextView value= (TextView) findViewById(R.id.busstopname);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            bus_heading.setText(bundle.getString("bus_heading"));
            arrival.setText(bundle.getString("arrival"));
            departure.setText(bundle.getString("departure"));
            afirst.setText(bundle.getString("afirst"));
            dfirst.setText(bundle.getString("dfirst"));
//            bus_stop.setText(bundle.getString("bus_stop"));
//            value.setText(bundle.getString("value"));
//            bus_stop.setText(bundle.getString("bus_stop"));
//            value.setText(bundle.getString("value"));
            asecond.setText(bundle.getString("asecond"));
            dsecond.setText(bundle.getString("dsecond"));
            athird.setText(bundle.getString("athird"));
            dthird.setText(bundle.getString("dthird"));
            afourth.setText(bundle.getString("afourth"));
            dfourth.setText(bundle.getString("dfourth"));
        }
    }
}
