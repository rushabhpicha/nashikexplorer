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


public class school extends AppCompatActivity {
    String name[] = {"Abhinav Adarsh Marathi School",

            "Annasaheb Vashampa Yan Vidyalay",
            "AP Patil High School",
            "Arambha Mahavidyalay",
            "Kilbil St Joseph School",
                "Smt Rangubai Junnare English Medium School",
            "DON Bosco School",
            "New Era English School",
            "Rasbihari International School",
            "Silver Oak High School",
            "Ashoka Universal School Chandsi",
            "Golden Horizon School",
            "Guru Govind Singh Public School",
            "Holy Flower English School",
            "St Philomenas Convent High School",
            "St Xaviers High School",
            "Vikhe Patil Memorial School",
            "A P Patil High School",
            "Brooklyn Birdies School",
            "Calibers English Medium School",
            "Dawn Breakers School",
            "Dr Kakasaheb Deodhar English School",
            "Flying Colours Pre School",
            "Gurudev School",
            "Hab English Medium High School",
            "Kishor Suryawanshi International School",
            "Little Flower English School",
            "Mother Mary Educational Trust",
            "My Home English Medium School",
            "Sacred Heart Convent High School",
            "Sahaj Blossom English Medium School",
            "Sandip Foundation",
            "School Tribunal",
//            "Shree Kisanlalji Bora English Medium School",
            "Shree Panchavati Education Society",
            "Shri Chintamani Education Trust Foundation School" ,
            "Shri Swaminarayan English Medium School" ,
            "Silver Bells English Medium School",
            "St Lawrence English Medium School",
            "St Patrick Convent School"
};
    String contact_no[] = {"02532415444","02532352184","02532512139","02532460012","02532570359","82762506687","02532313635","02532574871","02532304622","02532314300",
    "02536453929","02532417674","02532373547","02532410952","02532561367","02532411644","02532381835","02532512139","02536533630"
    ,"71522573499","02532357165","02532534291","02532376661","02532310972","71522572661","02536450720",
    "9270056836","9822893732","9422255743","02532599338","02532280989","0253222585","02532590737",
            "02532621193","02536451556","02532514570","02532280406","02532395940","02532491214"
            };
    String address[] = {"Narayan Bapu Nagar,Saikheda Road",
            "Trimbak Road,Mahatma Nagar"
            ,"Near Nimani Bus Stand,Nimani Bus Stop",
            "Sane Guruji Nagar,Jail Road,Nashik Road",
            "DON Bosco Marg,College Road",
            "Kathe Lane, Dwarka",
            "DON Bosco Marg," +
            "Samarth Nagar","Mumbai Agra Road," +
            "Govind Nagar","Nashik Ozar Road," +
            "Panchavati","Sharanpur Road," +
            "Sharanpur","Gangapur Road," +
            "Nashik","New Tapovan Ram Ghat Road," +
            "Shivaji Nagar","Guru Gobind Singh Road," +
            "Pathardi Phata","Old Saikheda Road," +
            "Jail Road","Nashik Pune Rd," +
            "Jail Road","Nashik Pune Road," +
            "Nashik Main Road","Cidco Ambad Link Road," +
            "Ambad","Nimani Bus Stop," +
            "Nashik","Pathardi Phata," +
            "Nashik","Sharanpur Road" ,"Gangapur Link Road," +
            "Satpur",
            "Dindori Road," +
                    "Dindori Naka","Ganesh Temple," +
            "Ashwini Nagar"," Uttanwadi Road," +
            "Sambhaji Chowk","Old Pandit Colony," +
            "Sharanpur Road","Old Agra Road","Ambad","Cidco","Dindori Road," +
            "Dindori Naka","Wadala Road","Shivaji Nagar, Satpur","Trimbak Road," +
            "Main road","Shalimar","Panchavati","Dwarka","Mumbai Agra Road," +
            "Panchavati","Ashok Nagar","Cidco","Welman Road," +
            "Deolali"
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);
        ListView listView = (ListView) findViewById(R.id.linlay);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
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


