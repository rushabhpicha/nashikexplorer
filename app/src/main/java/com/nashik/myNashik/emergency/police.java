package com.nashik.myNashik.emergency;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.nashik.myNashik.dreams.R;


public class police extends AppCompatActivity {
    String name[] = {"Emergency","Nashik Control Room","Police Commissioner","Sarkarwada","Panchavati","Ambad","Bhadrakali"
            ,"Deolali Camp","Satpur"};
//    String contact[] = {"Contact number:", "Contact number:","Contact number:","Contact number: ","Contact number:"
//            ,"Contact number:","Contact number:","Contact number:","Contact number:"};
    String contact_no[] = {"100","02532305233","02532305200","02532319621","02532512733","02532392233","02532590333","02532491233"
    ,"02532350599"};
//    String address[] = {"Everywhere", "Dwarka","Mumbai Naka","Old Agra Road","M G Road","Indira Nagar","TilakWadi","Trimbak Road","Gole Colony",
//            "Dindori Naka","Sharanpur Road","Sharanpur Road","Jail Road","Jail Road","Nashik Road","Nehru Nagar,Nasik-Pune Road","Ingale Nagar"
//            ,"Gangapur Road","Gangapur Road","Panchavati","Panchavati","Satpur","Satpur","Dwarka","Shalimar Chowk","Shalimar","Cidco"," "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.police);
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
            view = getLayoutInflater().inflate(R.layout.listview_without_address, null);
            final TextView textView = (TextView) view.findViewById(R.id.textView);
//            TextView textView1 = (TextView) view.findViewById(R.id.textView1);
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
//            textView3.setText(address[position]);

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
                    shareIntent.putExtra(Intent.EXTRA_TEXT,"Name :"+textView.getText()+"Contact No: "+textView2.getText());

                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "The title");
                    startActivity(Intent.createChooser(shareIntent, "Share..."));
                }
            });
            return view;
        }
    }
}
