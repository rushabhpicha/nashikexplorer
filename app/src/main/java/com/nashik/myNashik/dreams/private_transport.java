package com.nashik.myNashik.dreams;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class private_transport extends AppCompatActivity {
    String name[] = {"Siddhivinayak Tours & Travals",
            "Matoshri Travels & Auto Consultant",
            "Yash Tours & Travels",
            "Nisarga Tours Pvt Ltd",
            "Matoshree Tours & Travels Pvt Ltd",
            "Mahalakshmi Tours & Travels",
            "Vaishali Travels",
            "Rajyog Travels",
            "Parik Travels",
            "Hari Om Travels",
            "Atharva Tours",
            "Holiday Makers",
            "Trade Wings Tours LTD",
            "Prasanna Holidays",
            "Choudhary Yatra Company PVT LTD",
            "Shah Travels",
            "Rameshwar Tours And Travels",
            "Rajmahal Travel Agency",
            "Raghav Holidays Pvt Ltd",
            "Qb Tours & Travals",
            "Laxmivaibhav Tours & Travels",
            "Sai Sai Tours & Travels",
            "Siddhivinayak Tours & Travals",
            "Rawat Travels",
            "Geeta Tours and Travels",
            "Choudhary Yatra Company PVT LTD",
            "Sujay Holidays",
            "Indani Travels",
            "Bombay Tour&Travel",
            "Pushpanjali Travels",
            "Vaishnavi Tours and Travels",
            "Kinara Tours & Travels",
            "Sai Tours And Travels",
            "Y Axis Solutions PVT LTD",
            "Ambica Travels",
            "T S Travels"};
//    String contact[] = {"Contact number:", "Contact number:","Contact number:","Contact number: ","Contact number:"
//            ,"Contact number:","Contact number:","Contact number:","Contact number:","Contact number:","Contact number:"
//            ,"Contact number:","Contact number:","Contact number:","Contact number:","Contact number:","Contact number:"
//            ,"Contact number:","Contact number:","Contact number:","Contact number:","Contact number:","Contact number:"
//            ,"Contact number:","Contact number:","Contact number:","Contact number:","Contact number:","Contact number:",
//            "Contact number:","Contact number:","Contact number:","Contact number:","Contact number:","Contact number:"
//            ,"Contact number:","Contact number:","Contact number:","Contact number:","Contact number:","Contact number:"
//            ,"Contact number:","Contact number:","Contact number:","Contact number:","Contact number:","Contact number:","Contact number:"
//            ,"Contact number:","Contact number:","Contact number:","Contact number:"};
    String contact_no[] = {"02532503117","9890149726","9370265007",
"0253-2571375",
 "02532379455",
"02532513069",
 "02532463694",
    "NA",
    "02532575904",
   "02532467960",

   "02532317100",
            "02532319993",
 "02532579556",
"02532590680",
"02532456741",
            "02532306941",
 "9404785103",
 "02532572880",
"02536697028",
 "02533206898",
 "02532511551",
 "7588097578",
 "02532503117",
 "02532465569",
 "9923441415",
 "02532598871",
 "02532319328",
 "02532511555",
 "9767786786",
 "02532324578",
 "9850225607",
"02532503193",
            "9975417102",
 "9396401515",
 "9764082786",
 "9970251251"};
    String address[] = {"CBS",
            "Shranpur Road",
            "Gangapur Road",
            "Gangapur Road",
            "Pawan Nagar",
            "Panchavati",
            "Nashik Road",
            "Dwarka",
            "Tilak Road",
            "Nashik Pune Highway,Nashik Road",
            "Canada Corner",
            "College Road",
            "Vakilwadi",
            "College Road",
            "Nashik Road",
            "Ganjmal",
            "Cidco",
            "CBS",
            "College Road",
            "Suchita Nagar",
            "Panchavati",
            "Panchavati",
            "Cbs",
            "Bytco Point",
            "Panchavati",
            "M G Road",
            "Sharanpur",
            "Panchavati",
            "Bhadrakali",
            "New Nashik",
            "Satpur",
            "Mumbai Naka",
            "Deolali",
            "Nashik H O",
            "Gangapur Road,Gangapur",
            "Gurudwara Road"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_transport);
        ListView listView = (ListView) findViewById(R.id.linlay);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
    }
    class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return name.length;
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
 //           textView1.setText(contact[position]);
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

