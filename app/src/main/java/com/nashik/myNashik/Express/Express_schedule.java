package com.nashik.myNashik.Express;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import com.nashik.myNashik.dreams.R;

public class Express_schedule extends AppCompatActivity {

    String name;
    String number;
    String source;
    String destination;
    ListView listView;
    Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.express_schedule);

        listView= (ListView) findViewById(R.id.list_of_express);

        this.number = getIntent().getStringExtra("number");
        this.name = getIntent().getStringExtra("name");
        this.source=getIntent().getStringExtra("source");
        this.destination=getIntent().getStringExtra("destination");

        getData();
    }

    public void getData(){

        try {

            express_databae dbhelper = new express_databae(this);
            SQLiteDatabase db = dbhelper.getReadableDatabase();

            this.listView.setAdapter(new SimpleCursorAdapter(this, R.layout.list_item_express_schedule,
                    db.rawQuery("SELECT _id, stationname, arrival, dateplus from express where trainid = " + this.number, null),
                    new String[]{"stationname", "arrival", "dateplus"}, new int[]{R.id.staion_name, R.id.time, R.id.day}) {

                public View getView(int position, View convertView, ViewGroup parent) {
                    View view = super.getView(position, convertView, parent);
                    TextView arrival = (TextView) view.findViewById(R.id.staion_name);
                    TextView time = (TextView) view.findViewById(R.id.time);
                    TextView day = (TextView) view.findViewById(R.id.day);

                    String src_destination = arrival.getText().toString();
                    if (src_destination.equals(source) || src_destination.equals(destination)) {
                        arrival.setTextColor(getResources().getColor(R.color.white));
                        time.setTextColor(getResources().getColor(R.color.white));
                        day.setTextColor(getResources().getColor(R.color.white));
                        view.setBackgroundColor(getResources().getColor(R.color.gray_dark));
                    }
                    else{
                        arrival.setTextColor(getResources().getColor(R.color.black));
                        time.setTextColor(getResources().getColor(R.color.black));
                        day.setTextColor(getResources().getColor(R.color.black));
                        view.setBackgroundColor(getResources().getColor(R.color.white));
                    }
                    return view;
                }
            });
            Cursor cursor1 = db.rawQuery("select count(*) from (select * from express where arrival<(select arrival from express where trainid=" + number + " AND stationname = '" + source + "') AND trainid=" + number + " AND datePlus<=(select datePlus from express where trainid=" + number + " AND stationname ='" + source + "') UNION select * from express where trainid=" + number + " AND datePlus<(select datePlus from express where trainid=" + number + " AND stationname ='" + source + "'))", null);
            cursor1.moveToFirst();
            listView.setSelection(Integer.parseInt(cursor1.getString(0)));
            db.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
