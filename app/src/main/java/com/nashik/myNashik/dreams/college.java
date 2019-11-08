package com.nashik.myNashik.dreams;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;



public class college extends AppCompatActivity {
    Toolbar toolbar;
    String name[] = {"BYK College of Commerce", "Nashik District Maratha Vidya Prasarak Samaj's Karmaveer Baburao Thakare " +
            "College of Engineering", "Bhonsala Military School", "Gokhale Education Society's R. H. Sapat College of" +
            " Engineering, Management Studies and Research", "Mahatma Gandhi Vidyamandir's Pharmacy College",
            "Gargi Agriculture Research And Training Institute (GARTI)",
            "K. K. Wagh Institute of Engineering Education & Research", "Symbiosis Institute of Operations Management",
            "H.P.T. Arts & R.Y.K. Science College", "Gokhale Education Society's College Of Engineering Central Library",
            "KTHM College", "Jawahar Education Society's Institute of Technology Management and Research",
            "Bytco College", "Sandip Institute of Pharmaceutical Sciences", "N.D.M.V.P.Samajs Arts & Commerce College",
            "Dr. Vasantrao Pawar Medical College"};

    String contact[] = {"Contact number:", "Contact number:", "Contact number:", "Contact number: ", "Contact number:"
            , "Contact number:", "Contact number:", "Contact number:", "Contact number:", "Contact number:", "Contact number:"
            , "Contact number:", "Contact number:", "Contact number:", "Contact number:", "Contact number:"};

    String contact_no[] = {"0253 257 2520", "0253 257 1439", "0253 230 9610", "0253 257 0106", "0253 262 8399", "0253 237 8474"
            , "0253 222 1106", "0253 237 6107", "0253 257 2153", "0253 257 9480", "0253 257 1376", "73870 45065", "0253 246 1548",
            "01800 233 2714", "0253 257 1439", "0253 222 0500"};

    String address[] = {" Hpt College Road, Canada Corner", " Gangapur Road", " Samarth Nagar, Model Colony"
            , " Krishi Nagar", "Krishna Nagar", "Patil Nagar, New Nashik(CIDCO)", "Amrut-Dham, Panchavati", "Shravan Sector, New Cidco",
            " Sharanpur Road, TA Kulkarni,Vidya Nagar", "College Road, Krishi Nagar", "Gangapur Road", "SH27, Govardhan"
            , "Nashik Pune Road, Ashirwad stop", "Trimbakeshwar Road", "Gangapur Road", "Vasantdadanagar, Adgaon"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college);
        ListView listView = (ListView) findViewById(R.id.linlay);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return contact.length;
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
            view = getLayoutInflater().inflate(R.layout.college_listview, null);
            final TextView textView = (TextView) view.findViewById(R.id.textView);
            TextView textView1 = (TextView) view.findViewById(R.id.textView1);
            final TextView textView2 = (TextView) view.findViewById(R.id.textView2);
            final TextView textView3 = (TextView) view.findViewById(R.id.textView3);
            TextView call = (TextView) view.findViewById(R.id.call);
            TextView share = (TextView) view.findViewById(R.id.share);
            TextView visit_us = (TextView) view.findViewById(R.id.visit_us);
//            ImageView emergency_share = (ImageView) view.findViewById(R.id.emergency_share);
//            ImageView calling1= (ImageView) view.findViewById(R.id.calling);
//            emergency_share.setImageResource(share[position]);
//            calling1.setImageResource(calling[position]);
            textView.setText(name[position]);
            textView1.setText(contact[position]);
            textView2.setText(contact_no[position]);
            textView3.setText(address[position]);
            visit_us.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inNetworkConnected();
                }

                private boolean inNetworkConnected() {
                    ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                    if(cm.getActiveNetworkInfo()!=null)
                    {
                        if(position==0)
                        {
                            String url = "http://www.bykcollege.com/";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                        if(position==1)
                        {
                            String url = "http://kbtcoe.org/";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                        if(position==2)
                        {
                            String url = "http://bmc.bhonsala.in/";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                        if(position==3)
                        {
                            String url = "http://ges-coengg.org/";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                        if(position==4)
                        {
                            String url = "http://www.mgv.org.in";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                        if(position==5)
                        {
                            String url = "http://www.gargiedu.com/";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                        if(position==6)
                        {
                            String url = "http://www.engg.kkwagh.edu.in/";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                        if(position==7)
                        {
                            String url = "https://www.siom.in/";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                        if(position==8)
                        {
                            String url = "http://www.hptrykcollege.com/";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                        if(position==9)
                        {
                            String url = "http://ges-coengg.org/";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                        if(position==10)
                        {
                            String url = "http://www.kthmcollege.ac.in/";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }


                        if(position==11)
                        {
                            String url = "http://www.jitnashik.edu.in/index.htm";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                        if(position==12)
                        {
                            String url = "http://www.cbccollege.in/";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                        if(position==13)
                        {
                            String url = "http://www.sandipfoundation.org/";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                        if(position==14)
                        {
                            String url = "http://kbtcoe.org/";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                        if(position==15)
                        {
                            String url = "http://drvasantraopawarmedicalcollege.com/";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                    }
                    else
                    {
                        Toast toast=Toast.makeText(college.this, "Check Internet Connection", Toast.LENGTH_SHORT);
                        toast.show();
                        toast.setGravity(Gravity.CENTER, 0, 0);
                    }
                    return cm.getActiveNetworkInfo() != null;
                }
            });
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
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Name :" + textView.getText() + "\nAddress :" + textView3.getText() + "\nContact No: " + textView2.getText());
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "The title");
                    startActivity(Intent.createChooser(shareIntent, "Share..."));
                }
            });
            return view;


        }
       
    }
}
