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

public class movie extends AppCompatActivity {
    String name[] = {"INOX Cinema","Cinemax","PVR Cinemas","Mahalaxmi Theatre","Divya Big Cinema"};

    String contact_no[] = {"0253 242 1111","0253 661 2020","0253 669 5225","0253 251 1936","093254 02677"};
    String address[] = {"Nashik Pune road, Shivaji nagar","City Centre Mall,Lawate Nagar",
    "Vitthal Charni Complex,Canada corner","Loksahakar Nagar","Cidco Nashik","Bhadrakali,Shalimar"};
    String book_tickets[]={"book tickets","book tickets","book tickets","bookings:NA","bookings:NA"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
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
            view = getLayoutInflater().inflate(R.layout.listview_movie, null);
            //final WebView webView= (WebView) findViewById(R.id.webView);
            TextView textView = (TextView) view.findViewById(R.id.textView);
  //          TextView textView1 = (TextView) view.findViewById(R.id.textView1);
            final TextView textView2 = (TextView) view.findViewById(R.id.textView2);
            final TextView textView3 = (TextView) view.findViewById(R.id.textView3);
            TextView textView4 = (TextView) view.findViewById(R.id.book_tickets);
            TextView location= (TextView) view.findViewById(R.id.location);
            textView.setText(name[position]);
//            textView1.setText(contact[position]);
            textView2.setText(contact_no[position]);
            textView3.setText(address[position]);
            textView4.setText(book_tickets[position]);

        location.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        inNetworkConnected();
    }

            private boolean inNetworkConnected() {

                    ConnectivityManager cm = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                    if(cm.getActiveNetworkInfo()!=null)
                    {
                        if (position == 0) {
                            String url = "https://www.google.co.in/maps/place/INOX+Cinema/@19.978554,73.8057812," +
                                    "17z/data=!3m1!4b1!4m5!3m4!1s0x3bddeafda601b20d:0xdc2714f7c6378eba!8m2!3d19.978554!4d73.8079699";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }


                        if (position == 1) {
                            String url = "https://www.google.co.in/maps/place/Cinemax/@19.9785437,73.7729501,13z/data=!3m1!5s0x3bd" +
                                    "deb70fa9ca425:0xf8ef09f759bfd7c4!4m8!1m2!2m1!1scinemax+nasik!3m4!1s0x3bddeb70eef9de0d:0x51c3ce9262356dec!8m2!3d19.990584!4d73.7605558";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }

                        if (position == 2) {
                            String url = "https://www.google.co.in/maps/place/PVR+Cinemas,+College+Road/@19.9790396,73.7666236" +
                                    ",13z/data=!4m8!1m2!2m1!1spv+cinemas+nasik!3m4!1s0x3bddeb994e48e08b:0xa13e6e2de7c8360e!8m2!3d20.0051321!4d73.7662546";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }

                        if (position == 3) {
                            String url = "https://www.google.co.in/maps/place/Mahalaxmi+Theatre/@20.014338,7" +
                                    "3.7945712,17z/data=!3m1!4b1!4m5!3m4!1s0x3bddea4d6f0a8b4b:0x55b9d78af40650!8m2!3d20.014338!4d73.7967599";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                        if (position == 4) {
                            String url = "https://www.google.co.in/maps/place/DIVYA+BIG+Cinemas/@19.981469,73.756" +
                                    "0872,15z/data=!4m5!3m4!1s0x0:0x9998bc97551fdf80!8m2!3d19.981469!4d73.7560872";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);

                        }

                    }
                    else
                    {
                        Toast toast=Toast.makeText(movie.this, "Check Internet Connection", Toast.LENGTH_SHORT);
                        toast.show();
                        toast.setGravity(Gravity.CENTER, 0, 0);
                    }
                    return cm.getActiveNetworkInfo() != null;
                }

        });
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inNetworkConnected();
                }

                private boolean inNetworkConnected() {
                    ConnectivityManager cm = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                    if(cm.getActiveNetworkInfo()!=null)
                    {
                        if (position == 0) {
                            String url = "https://in.bookmyshow.com/buytickets/inox-cinemas-nashik/cinema-nask-FMNK-MT/20170522";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }


                        if (position == 1) {
                            String url = "https://in.bookmyshow.com/nashik/cinemas/cinemax-city-center-nashik/CXNC";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }


                        if (position == 2) {
                            String url = "https://www.pvrcinemas.com/cinemasessions/Nashik/cinemax---city-center-mall,-nashik/NACC";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }

//                        if (position == 3) {
//                            String url = "https://www.pvrcinemas.com/cinemasessions/Nashik/cinemax---city-center-mall,-nashik/NACC";
//                            Intent i = new Intent(Intent.ACTION_VIEW);
//                            i.setData(Uri.parse(url));
//                            startActivity(i);
//                        }
//                        if (position == 4) {
//                            String url = "https://in.bookmyshow.com/nashik/cinemas/carnival-divya/ADDV";
//                            Intent i = new Intent(Intent.ACTION_VIEW);
//                            i.setData(Uri.parse(url));
//                            startActivity(i);
//                        }
                    }
                    else
                    {
                        Toast toast=Toast.makeText(movie.this, "Check Internet Connection", Toast.LENGTH_SHORT);
                        toast.show();
                        toast.setGravity(Gravity.CENTER, 0, 0);
                    }
                    return cm.getActiveNetworkInfo() != null;
                }
            });

                return view;


    }
}
}
