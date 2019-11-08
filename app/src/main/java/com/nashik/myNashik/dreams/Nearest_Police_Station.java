package com.nashik.myNashik.dreams;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class Nearest_Police_Station extends AppCompatActivity {
    ListView listView_autofare;
    String data[]={"Gangapur Police Station","Ambad Police Station","Sarkarwada Police Station","Upnagar Police Station"
            ,"Panchavati Police Station","Nashik Commissioner Office","Satpur Police Station"
            ,"Mhasrul Police Station","Nashik Road Police Station","Upnagar Police Station","Ashwin Nagar Police Chauki",
            "CBS Police Station Bhadrakali","Deolali Camp Police Chauki","Nashik Taluka Police Thana","College Road Police Chauki"
            ,"Deolali Camp Police Station"};
    String contact_no[]={"02532305242","0253 239 2233","0253 231 9621","0253 241 5641","0253 262 9831"
            ,"0253 230 5247","0253 230 5237","0253 253 3233","0253 246 5533","02532415641","97621 00100","0253 230 5214","0253 249 1233"
            ,"0253 230 9711","0253 230 5242","0253 249 1233"};
//    String contact[]={"Contact Number:","Contact Number:","Contact Number:","Contact Number:","Contact Number:","Contact Number:",
//            "Contact Number:","Contact Number:","Contact Number:","Contact Number:","Contact Number:","Contact Number:",
//            "Contact Number:","Contact Number:","Contact Number:","Contact Number:"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearest__police__station);
        ListView listView = (ListView) findViewById(R.id.linlay);
        TextView visit_us= (TextView) findViewById(R.id.visit_us);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        visit_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inNetworkConnected();
            }
        });
    }
    private boolean inNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        if(cm.getActiveNetworkInfo()!=null)
        {
            String url = "http://nashikpolice.com/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
        else
        {
            Toast toast=Toast.makeText(Nearest_Police_Station.this, "Check Internet Connection", Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER, 0, 0);
        }
        return cm.getActiveNetworkInfo() != null;
    }
    class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return contact_no.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View view, ViewGroup parent) {
            view = getLayoutInflater().inflate(R.layout.listview_without_address, null);
            final TextView textView = (TextView) view.findViewById(R.id.textView);
            final TextView textView2 = (TextView) view.findViewById(R.id.textView2);
            final TextView textView3 = (TextView) view.findViewById(R.id.textView3);
            TextView call = (TextView) view.findViewById(R.id.call);
            TextView share = (TextView) view.findViewById(R.id.share);
//            ImageView emergency_share = (ImageView) view.findViewById(R.id.emergency_share);
//            ImageView calling1= (ImageView) view.findViewById(R.id.calling);
//            emergency_share.setImageResource(share[position]);
//            calling1.setImageResource(calling[position]);
            textView.setText(data[position]);
//            textView1.setText(contact[position]);
            textView2.setText(contact_no[position]);
//            textView3.setText(address[position]);

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + textView2.getText().toString()));
                    startActivity(intent);
                }
            });
            share.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Name :" + textView.getText() + "\nContact No: " + textView2.getText());
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "The title");
                    startActivity(Intent.createChooser(shareIntent, "Share..."));
                }
            });
            return view;
        }
    }
}