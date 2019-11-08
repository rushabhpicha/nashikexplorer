package com.nashik.myNashik.Express;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.nashik.myNashik.dreams.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ListofExpress extends AppCompatActivity {

    express_databae db;
    SQLiteDatabase SQLITEDATABASE;
    Cursor cursor;
    SQLiteListAdapter_express ListAdapter_express;
    IndianExpressTrainsAdapter eTrainAdapter;
    EditText edittext;
    ArrayList<Array_Express> express_array = new ArrayList<>();
    ArrayList<IndianExpressTrains> eTrainArray = new ArrayList();

    CardView mCardView;
    ListView LISTVIEW;
    TextView journey_name;

    String source, destination, type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listof_express);

        edittext = (EditText) findViewById(R.id.station);
        LISTVIEW = (ListView) findViewById(R.id.list_express);
        journey_name= (TextView) findViewById(R.id.textview);

        db = new express_databae(this);
        source = getIntent().getStringExtra("source");
        destination = getIntent().getStringExtra("destination");
        type = getIntent().getStringExtra("type");

//        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
//        imm.showSoftInput(edittext, InputMethodManager.SHOW_IMPLICIT);

        if (type.equals("i")) {
            edittext.setVisibility(View.GONE);
            journey_name.setVisibility(View.VISIBLE);
            journey_name.setText(this.source + " to " + this.destination + " trains");
            singleresults();
        } else if (type.equals("a")){

            ShowSQLiteDBdata();
        } else if(type.equals("o")){
            edittext.setVisibility(View.INVISIBLE);
            ShowSQLiteDBdata();
        }

        edittext.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence cs, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence cs, int start, int before, int count) {
                {
                    if (type.equals("a")) {
                        express_databae dbhelper = new express_databae(ListofExpress.this);
                        SQLiteDatabase db = dbhelper.getWritableDatabase();
                        express_array.clear();
                        LISTVIEW.clearAnimation();
                        Cursor mems = db.rawQuery("SELECT distinct d1.trainid as trainid,d1.trainname as trainname FROM express d1 where d1.trainname like '" + cs + "%'", null);
                        if (mems.getCount() > 0) {
                            LISTVIEW.setVisibility(0);
                            if (mems.moveToFirst()) {
                                do {
                                    String trainno = mems.getString(0);
                                    String trainname = mems.getString(1);
                                    Cursor mems1 = db.rawQuery("SELECT _id, stationname, arrival, dateplus from express where trainid = " + trainno, null);
                                    mems1.moveToFirst();
                                    String src = mems1.getString(1);
                                    mems1.moveToLast();
                                    express_array.add(new Array_Express(trainname, trainno, src, mems1.getString(1)));
                                } while (mems.moveToNext());
                            }
                        } else {
                            Toast toast = Toast.makeText(ListofExpress.this, "Train name not found!", Toast.LENGTH_SHORT);
                            toast.show();
                            toast.setGravity(Gravity.CENTER, 0, 0);
                        }
                        ListAdapter_express= new SQLiteListAdapter_express(ListofExpress.this, R.layout.list_item_express_train, express_array);
                       LISTVIEW.setItemsCanFocus(false);
                        LISTVIEW.setAdapter(ListofExpress.this.ListAdapter_express);
                        ListAdapter_express.notifyDataSetChanged();
                        dbhelper.close();
                    }
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
              //  ListofExpress.this.ListAdapter_express.getFilter().filter(s);
            }
        });
    }

    private void singleresults() {
        SQLITEDATABASE = db.getWritableDatabase();
        Cursor mems2 = SQLITEDATABASE.rawQuery("select d1.trainid as t_id, d1.trainid as trainid,d1.trainname as trainname,d1.arrival as arrival, d1.sun as sun, d1.mon as mon, d1.tue as tue, d1.wed as wed, d1.thu as thu, d1.fri as fri, d1.sat as sat,d1.dateplus as dateplus FROM express d1 where d1.stationname = '" + this.source + "' and exists(select 1 from express d2 where d2.trainid=d1.trainid and d2.stationname = '"+this.destination+"' and d2._id>d1._id ) order by d1.arrival", null);

        //Cursor mems2 = SQLITEDATABASE.rawQuery("SELECT distinct d1.trainid as trainid,d1.trainname as trainname FROM express d1 ", null);

        if (mems2!= null && mems2.getCount() > 0 && mems2.moveToFirst()) {
        do {
                String trainno = mems2.getString(1);
                eTrainArray.add(new IndianExpressTrains(mems2.getString(2), trainno, mems2.getString(3), mems2.getString(4), mems2.getString(5), mems2.getString(6), mems2.getString(7), mems2.getString(8), mems2.getString(9), mems2.getString(10), mems2.getInt(11)));
            }while(mems2.moveToNext());
        }
        mems2.close();
        Cursor cursor1 = SQLITEDATABASE.rawQuery("select count(*) FROM express d1 where d1.stationname = '" + this.source + "' and exists(select 1 from express d2 where d2.trainid=d1.trainid and d2.stationname = '" + this.destination + "' and d2._id>d1._id ) and d1.arrival<'" + new SimpleDateFormat("HH:mm").format(new Date()) + "'", null);
        cursor1.moveToFirst();
        final int aa = Integer.parseInt(cursor1.getString(0));
        int count=mems2.getCount();
        this.eTrainAdapter = new IndianExpressTrainsAdapter(this, R.layout.list_item_express_train, this.eTrainArray, this.source, this.destination) {
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView name = (TextView) view.findViewById(R.id.trainname);
                TextView notitle = (TextView) view.findViewById(R.id.expnotitle);
                TextView no = (TextView) view.findViewById(R.id.expno);
                TextView timetitle = (TextView) view.findViewById(R.id.exptimetitle);
                TextView time = (TextView) view.findViewById(R.id.exptime);
                TextView txtalldays= (TextView) view.findViewById(R.id.weekly);
                CardView mCardView = (CardView) view.findViewById(R.id.result_card);
                    if (position == aa) {
                        mCardView.setCardBackgroundColor(mContext.getResources().getColor(R.color.gray_dark));
                        name.setTextColor(mContext.getResources().getColor(R.color.white));
                        notitle.setTextColor(mContext.getResources().getColor(R.color.white));
                        no.setTextColor(mContext.getResources().getColor(R.color.white));
                        timetitle.setTextColor(mContext.getResources().getColor(R.color.white));
                        time.setTextColor(mContext.getResources().getColor(R.color.white));
                        txtalldays.setTextColor(mContext.getResources().getColor(R.color.white));
                    }
                    else {
                        mCardView.setCardBackgroundColor(ListofExpress.this.getResources().getColor(R.color.white));
                        name.setTextColor(ListofExpress.this.getResources().getColor(R.color.black));
                        notitle.setTextColor(ListofExpress.this.getResources().getColor(R.color.black));
                        no.setTextColor(ListofExpress.this.getResources().getColor(R.color.black));
                        timetitle.setTextColor(ListofExpress.this.getResources().getColor(R.color.black));
                        time.setTextColor(ListofExpress.this.getResources().getColor(R.color.black));
                    }
                return view;
            }
     };
           this.LISTVIEW.setItemsCanFocus(false);
                this.LISTVIEW.setAdapter(this.eTrainAdapter);
        this.LISTVIEW.setSelection(aa);
        cursor1.close();
        SQLITEDATABASE.close();
    }

    private void ShowSQLiteDBdata() {

        SQLITEDATABASE = db.getWritableDatabase();

        cursor = SQLITEDATABASE.rawQuery("SELECT distinct d1.trainid,d1.trainname FROM express d1 ", null);
        if (cursor.moveToFirst()) {
            do {
                String name=cursor.getString(1);
                String number=cursor.getString(0);
                Cursor cursor2 =SQLITEDATABASE.rawQuery("SELECT _id, stationname, arrival, dateplus from express where trainid = " + number, null);
                cursor2.moveToFirst();
                String src = cursor2.getString(1);
                cursor2.moveToLast();
                ListofExpress.this.express_array.add(new Array_Express(name,number, src, cursor2.getString(1)));
                } while (cursor.moveToNext());
        }
        ListofExpress.this.ListAdapter_express = new SQLiteListAdapter_express(ListofExpress.this, R.layout.layout_of_list, ListofExpress.this.express_array);
        LISTVIEW.setAdapter(ListAdapter_express);
        LISTVIEW.setTextFilterEnabled(true);
//        cursor.close();
    }
}

