package com.nashik.myNashik.dreams;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class foodies extends AppCompatActivity {
    Toolbar toolbar;
    String name[] = {"Seasons Kitchens And Bar","Vaibhav Misal And Chinese","Udupi Tadkas Hariyaali pure Veg Restaurant"
    ,"The Blue Pink Pure Veg Restaurant","Apple Mint Pure Veg Family Restaurant","Hotel Curry Leaves","New Rasoi Family Veg Restaurant",
            "Morya Snacks","Hotel Purohit Dham","Purohit Thali Restaurant","Shalimar Restaurant"
           ,"Chetna Dinning Hall","Leafy Veg","Smokin Joes Pizza","Panchvati Pure Veg Restaurant","MH-15 Family Restaurant"
    ,"Hotel Radhika","Tadka Family Restaurant","Hotel Mathura Pure Veg","Hariyaali","Vaishali Family Restaurant","Sai Leela" +
            " Family Restaurant","Madras Cafe Restaurant","Sai Jagat Pure Veg Restaurant","Hotel Sayaji","Vrindavan Family Restaurant"
    };
//    String contact[]={"Contact number:","Contact number:","Contact number:","Contact number:","Contact number:","Contact number:",
//            "Contact number:","Contact number:","Contact number:","Contact number:","Contact number:","Contact number:",
//            "Contact number:","Contact number:","Contact number:","Contact number:","Contact number:","Contact number:",
//            "Contact number:","Contact number:","Contact number:","Contact number:","Contact number:"};
    String address[] = {"Gangapur Road,Ayodhya Nagar","Lam Road,Nashik Road","Opposite Somani Garden,Nashik Road","Lam Road,Nashik Road",
    "Shinde Pulse,Nashik Road","Nashik-Pune Highway,Nashik Road","Opposite Muktidham,Nashik Road","Tapovan Road,Tapovan","Mukti Dham,Nashik Road"
            ,"Nashik Road,Bytco point","MG Road,Nashik Road","Sargade Galli","Jail Road,Nashik Road",
    "Nashik-Pune Road,Bytco Point","Dr.Babasaheb Ambedkar Road,Road","Opp. Janlaxmi Bank,Jail Road","Ganesh Market,Nasik",
    "Jail Road,Nashik Road","Datta Mandir Road,Back to Muktidham","MG Road,Nashik Road","Nashik Road,Bytco Point","Nashik Road,Jail Road",
    "Dr. Ambedkar Road,Nashik Road","Bytco Point,Nashik Road","Nashik-Pune Highway,Nashik Road","Datta Mandir Road"};
    String contact_no[]={"9850717626","9420577506","02532460666","02532473473","9404493959","02532468894"
    ,"02532459348","9421232149","02532463883","02532463407","02532456300","09766156434","9766608008","02532462220","9975914500"
    ,"9028187621","9823100142","02532453668","02532468333","02532456060","9881151134","02536464333","8087058596"
    ,"9762725838","9890981017","9730073709"};

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodies2);
        ListView listView = (ListView) findViewById(R.id.linlay);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
//        button= (Button) findViewById(R.id.maps_foodies);

//      button.setOnClickListener(new View.OnClickListener() {
//          @Override
//          public void onClick(View v) {
//              Intent i=new Intent(foodies.this,map_foodies.class);
//              startActivity(i);
//          }
//      });
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
            view = getLayoutInflater().inflate(R.layout.listview_emergency, null);
            final TextView textView = (TextView) view.findViewById(R.id.textView);
            TextView textView1 = (TextView) view.findViewById(R.id.textView1);
            final TextView textView2 = (TextView) view.findViewById(R.id.textView2);
            final TextView textView3 = (TextView) view.findViewById(R.id.textView3);
            TextView call = (TextView) view.findViewById(R.id.call);
            TextView share = (TextView) view.findViewById(R.id.share);
//            ImageView emergency_share = (ImageView) view.findViewById(R.id.emergency_share);
//            ImageView calling1= (ImageView) view.findViewById(R.id.calling);
//            emergency_share.setImageResource(share[position]);
//            calling1.setImageResource(calling[position]);
            textView.setText(name[position]);
//            textView1.setText(contact[position]);
            textView2.setText(contact_no[position]);
            textView3.setText(address[position]);

            call.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:"+textView2.getText().toString()));
                    startActivity(intent);
                }
            });
      //      call.setBackgroundResource(R.drawable.highlight);
            share.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_TEXT,"Name :"+textView.getText()+"\nAddress :"+textView3.getText()+"\nContact No: "+textView2.getText());
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "The title");
                    startActivity(Intent.createChooser(shareIntent, "Share..."));
                }
            });
            return view;
        }
    }

}
