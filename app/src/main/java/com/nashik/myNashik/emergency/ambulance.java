package com.nashik.myNashik.emergency;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.nashik.myNashik.dreams.R;



public class ambulance extends AppCompatActivity {
    Toolbar toolbar;
    String name[] = {"Nashik Ambulance Service", "Suvichar Hospital","Ashwini Accident Hospital","Krupaprasad",
            "Parijat Hospital","Roshni Hospital","Shreeyas Hospital","DR Kakatkar Hospital","Nashik Civil Hospital","Gupte Hospital"
    ,"Sahara Hospital","Soham Hospital","Sushrut Hospital","Shramik Sanjivani","Life Force","Jairam Hospital and Research center",
            "ISP Hospital","Bahujan Yuva Sangathan","Vidya Vikas Hospital","Arogyashala Hospital","Ramalayam Hospital","Esi Hospital",
            "Siddhi Hospital","City Care Hospital Chemist","Raje Bahadur Hospital","Shree Saibaba Heart Institute","Siddhivinayak Hospital"
    ,"Name Foundation"};
//    String contact[] = {"Contact number:", "Contact number:","Contact number:","Contact number: ","Contact number:"
//            ,"Contact number:","Contact number:","Contact number:","Contact number:","Contact number:","Contact number:"
//            ,"Contact number:","Contact number:","Contact number:","Contact number:","Contact number:","Contact number:"
//            ,"Contact number:","Contact number:","Contact number:","Contact number:","Contact number:","Contact number:"
//            ,"Contact number:","Contact number:","Contact number:","Contact number:","Contact number:"};
    String contact_no[] = {"102", "2536454986","2532599994","2532575586","2551222344","2532596055","9970001414","2532574949","2532572038","2532572962",
    "2532517777","2532314661","2532578091","2532314062","2533013232","2532462414","2532463721","2532563442","2532578141","2532574967","2532517251"
    ,"2532350379","2532353077","2532505771","2532503201","2536692100","9850256869","2402501100"};
    String address[] = {"NA", "Dwarka","Mumbai Naka","Old Agra Road","M G Road","Indira Nagar","TilakWadi","Trimbak Road","Gole Colony",
    "Dindori Naka","Sharanpur Road","Sharanpur Road","Jail Road","Jail Road","Nashik Road","Nehru Nagar,Nashik-Pune Road","Ingale Nagar"
    ,"Gangapur Road","Gangapur Road","Panchavati","Panchavati","Satpur","Satpur","Dwarka","Shalimar Chowk","Shalimar","Cidco","Nashik Pune Road,Shingada Talav"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ambulance);
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
  //          textView1.setText(contact[position]);
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

