package com.nashik.myNashik.Express;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ProgressBar;
import com.nashik.myNashik.dreams.R;
import java.util.ArrayList;

public class Express_main extends AppCompatActivity {


    ExpressAdapter expressAdapter;
    ArrayList<Express> ArrayList = new ArrayList();
    Context mContext;
    ProgressBar mMaterialProgressBar;
    RecyclerView recyclerView;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_express_main);

        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        expressAdapter=new ExpressAdapter(this,ArrayList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(expressAdapter);

        prepareExpressArray();
    }

    private void prepareExpressArray() {
        this.ArrayList.clear();
        this.ArrayList.add(new Express("Outgoing Trains", "(Nashik to Outstation)", "", "o", "P"));
        this.ArrayList.add(new Express("Incoming Trains", "(Outstation to Nashik)", "", "i", "P"));
        this.ArrayList.add(new Express("All Trains", "(All Express and Passenger trains)", "", "a", "P"));
    }
}
