package com.nashik.myNashik.dreams;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.nashik.myNashik.Express.Express_main;


public class MainActivity extends AppCompatActivity {

    private static final int INSTRUCTIONS_CODE = 0;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;

    private boolean isFirstRun = true;
    private SharedPreferences prefs;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView traffic_violation_rules = (ImageView) findViewById(R.id.trafic_violation_fines);
        ImageView auto = (ImageView) findViewById(R.id.auto);
        ImageView nearest_police_station = (ImageView) findViewById(R.id.nearestpolicestation);
        ImageView emergency = (ImageView) findViewById(R.id.emergency);
        ImageView bus = (ImageView) findViewById(R.id.bus);
        ImageView express = (ImageView) findViewById(R.id.express);
        ImageView news = (ImageView) findViewById(R.id.news);
        ImageView college = (ImageView) findViewById(R.id.college);
        ImageView city_bus = (ImageView) findViewById(R.id.city_bus);
        ImageView picnic = (ImageView) findViewById(R.id.picnic);
        ImageView ngo = (ImageView) findViewById(R.id.ngo);
        ImageView school = (ImageView) findViewById(R.id.school);
        ImageView foodies = (ImageView) findViewById(R.id.foodies);
        ImageView tuition = (ImageView) findViewById(R.id.tuition);
        ImageView movie = (ImageView) findViewById(R.id.movie);
        ImageView atm = (ImageView) findViewById(R.id.atm);
        ImageView weather = (ImageView) findViewById(R.id.weather);

        TextView local_transportation = (TextView) findViewById(R.id.local_transportation);
        TextView outstaion_transportation = (TextView) findViewById(R.id.outstation_transportation);
        TextView news_and_emergency = (TextView) findViewById(R.id.news_and_emergency);
        TextView entertainment = (TextView) findViewById(R.id.entertainment);
        TextView bank_atm_weather = (TextView) findViewById(R.id.bank_atm_weather);
        TextView educational = (TextView) findViewById(R.id.educational);

        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/Crimson-Roman.ttf");
        local_transportation.setTypeface(typeface1);
        outstaion_transportation.setTypeface(typeface1);
        news_and_emergency.setTypeface(typeface1);
        entertainment.setTypeface(typeface1);
        bank_atm_weather.setTypeface(typeface1);
        educational.setTypeface(typeface1);

        LayoutInflater li = getLayoutInflater();
        //Getting the View object as defined in the customtoast.xml file
        final View layout = li.inflate(R.layout.custom_toast,
                (ViewGroup) findViewById(R.id.custom_toast_layout));


        ImageView private_transport = (ImageView) findViewById(R.id.private_transport);
        traffic_violation_rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent traffic_violation_rules = new Intent(MainActivity.this, traffic_violation_fines.class);
                startActivity(traffic_violation_rules);
            }
        });
        private_transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ijobs = new Intent(MainActivity.this, private_transport.class);
                startActivity(ijobs);
            }
        });
        city_bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ijobs = new Intent(MainActivity.this, city_bus.class);
                startActivity(ijobs);
            }
        });
        picnic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ipicnic = new Intent(MainActivity.this, picnicplaces.class);
                startActivity(ipicnic);
            }
        });
        ngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ipicnic = new Intent(MainActivity.this, ngo.class);
                startActivity(ipicnic);
            }
        });
        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent school = new Intent(MainActivity.this, school.class);
                startActivity(school);
            }
        });
        movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent movie = new Intent(MainActivity.this, movie.class);
                startActivity(movie);
            }
        });
        foodies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodies = new Intent(MainActivity.this, foodies.class);
                startActivity(foodies);
            }
        });
        tuition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tuition = new Intent(MainActivity.this, tuition.class);
                startActivity(tuition);
            }
        });

        college.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tuition = new Intent(MainActivity.this, college.class);
                startActivity(tuition);
            }
        });
        auto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent autofare = new Intent(MainActivity.this, autofare.class);
                    startActivity(autofare);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println();
                }
            }
        });
        nearest_police_station.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent nearest_police_station = new Intent(MainActivity.this, Nearest_Police_Station.class);
                    startActivity(nearest_police_station);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println();
                }
            }
        });
        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emergency = new Intent(MainActivity.this, emergency.class);
                startActivity(emergency);
            }
        });
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bus = new Intent(MainActivity.this, bus.class);
                startActivity(bus);
            }
        });
        atm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bus = new Intent(MainActivity.this, atm.class);
                startActivity(bus);
            }
        });
        weather.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           inNetworkConnected();
                                       }

                                       private boolean inNetworkConnected() {
                                           ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                                           if (cm.getActiveNetworkInfo() != null) {
                                               Intent railways = new Intent(MainActivity.this, com.nashik.myNashik.dreams.weather.class);
                                               startActivity(railways);
                                           } else {
                                               Toast toast = Toast.makeText(MainActivity.this, "Check Internet Connection", Toast.LENGTH_SHORT);
                                               toast.show();
                                               toast.setGravity(Gravity.CENTER, 0, 0);
                                           }
                                           return cm.getActiveNetworkInfo() != null;
                                       }
                                   }
        );

        express.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
               Intent railways = new Intent(MainActivity.this, Express_main.class);
               startActivity(railways);
            }
        });
        news.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                inNetworkConnected();
            }

            private boolean inNetworkConnected() {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (cm.getActiveNetworkInfo() != null) {
                    Intent railways = new Intent(MainActivity.this, com.nashik.myNashik.dreams.News_Main.class);
                    startActivity(railways);

                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Check Internet Connection", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                return cm.getActiveNetworkInfo() != null;
            }
        });
       license();
    }

    private void license() {
        prefs = PreferenceManager.getDefaultSharedPreferences(this);
        isFirstRun = prefs.getBoolean("isFirstRun", true);
        if(isFirstRun){
            final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog.setTitle("Terms and Conditions");
            String alert1 = "Please read these terms and conditions carefully before using this application.Your access to " +
                    "and the use of the service is conditioned on your acceptance of and compliance with these terms.These terms apply " +
                    "to all visitors,users and others who access or use the service." +
                    "This app has been designed to provide you information about the city of Nashik.If you find any wrong information " +
                    "or have any feedback or comments then please contact us.Most of the features of this app can work offline." +
                    "This app does not collect any personal information.The developer does not and will not undertake any legal responsibility" +
                    " with regards to this app and the information available in it.Please use the app with your own prudence and responsibility.";
            alertDialog.setMessage(alert1);
            alertDialog.setCancelable(false);

            alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            AlertDialog alert = alertDialog.create();
            alert.show();
        }

        isFirstRun = false;

        prefs.edit().putBoolean("isFirstRun", isFirstRun).commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @ Override
    public void onBackPressed() {
        new AlertDialog.Builder(this,R.style.AlertDialogCustom)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.share_app:
                try {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                    String sAux = "#NashikExplorer\nLet me recommend you this application to access available resources in Nashik." +
                            "Get to know the bus timings,traffic violation fines" +
                            ",private transport,police stations,emergency contacts,news,picnic spots" +
                            ",movie theatres,hotels,banks,ATMs,schools,colleges,tuitions" +
                            " and NGOs in the city of Nashik.\nIt is very useful,intuitive and simple to use.\n#MustForaNashikar\n\n";
                    sAux = sAux + "https://play.google.com/store/apps/details?id=com.nashik.myNashik.dreams";
                    i.putExtra(Intent.EXTRA_TEXT, sAux);
                    startActivity(Intent.createChooser(i, "choose one"));
                } catch (Exception e) {
                    //e.toString();
                }
                break;
            case R.id.contact_us:
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9167211958"));
                startActivity(intent);
                break;
            case R.id.feedback:
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "nashikexplorer@gmail.com"));
                intent1.putExtra(Intent.EXTRA_SUBJECT, "Subject of feedback:-");
                intent1.putExtra(Intent.EXTRA_TEXT, "Content of feedback:-");
                startActivity(intent1);
                break;
            case R.id.terms_and_conditions:
                AlertDialog.Builder a = new AlertDialog.Builder(MainActivity.this);
                a.setTitle("Terms and Conditions");
                a.setMessage("Please read these terms and condition carefully before using this application.Your access to " +
                        "and the use of the service is conditioned on your acceptance of and compliance with these Terms.These Terms apply " +
                        "to all visitors,users and others who access or use the service.\n\n" +
                        "This app has been designed to provide you information about the city of Nashik.If you find any wrong information " +
                        "or have any feedback or comments then please contact us.Most of the features of this app can work offline." +
                        "This app does not collect any personal information.The developer does not and will not undertake any legal responsibility" +
                        " with regards to this app and the information available in it.Please use the app with your own prudence and responsibility.");
                a.show();
                break;
            case R.id.advertise_with_us:
                Intent inte = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "nashikexplorer@gmail.com"));
                inte.putExtra(Intent.EXTRA_SUBJECT, "Subject Of Advertisement:-");
                inte.putExtra(Intent.EXTRA_TEXT, "Content Of Advertisement:-");
                startActivity(inte);
                break;

            case R.id.rate_us:
                Uri uri = Uri.parse("market://details?id=" + this.getPackageName());
                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                // To count with Play market backstack, After pressing back button,
                // to taken back to our application, we need to add following flags to intent.
                goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                        Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                        Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                try {
                    startActivity(goToMarket);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://play.google.com/store/apps/details?id=" + this.getPackageName())));
                }
        }
                return super.onOptionsItemSelected(item);

    }
}



