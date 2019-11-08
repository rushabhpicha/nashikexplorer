package com.nashik.myNashik.dreams;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.nashik.myNashik.Express.ListofExpress;


public class travel extends Fragment {
    ConnectivityManager cm;
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_travel, container, false);
        //textView.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        ImageView traffic_violation_rules= (ImageView) view.findViewById(R.id.trafic_violation_fines);
        ImageView auto=(ImageView) view.findViewById(R.id.auto);
        ImageView nearest_police_station=(ImageView) view.findViewById(R.id.nearestpolicestation);
        ImageView emergency= (ImageView) view.findViewById(R.id.emergency);
        ImageView bus= (ImageView) view.findViewById(R.id.bus);
        ImageView express= (ImageView) view.findViewById(R.id.express);
        ImageView news=  (ImageView) view.findViewById(R.id.news);
        ImageView college= (ImageView) view.findViewById(R.id.college);
        ImageView city_bus= (ImageView) view.findViewById(R.id.city_bus);
        ImageView picnic = (ImageView) view.findViewById(R.id.picnic);
        ImageView ngo= (ImageView) view.findViewById(R.id.ngo);
        ImageView school= (ImageView) view.findViewById(R.id.school);
        ImageView foodies = (ImageView) view.findViewById(R.id.foodies);
        ImageView tuition= (ImageView) view.findViewById(R.id.tuition);
        ImageView movie= (ImageView) view.findViewById(R.id.movie);
        ImageView private_transport= (ImageView) view.findViewById(R.id.private_transport);
        traffic_violation_rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent traffic_violation_rules=new Intent(getContext().getApplicationContext(),traffic_violation_fines.class);
                startActivity(traffic_violation_rules);
            }
        });
        private_transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ijobs = new Intent(getContext().getApplicationContext(), private_transport.class);
                startActivity(ijobs);
            }
        });
        city_bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ijobs = new Intent(getContext().getApplicationContext(), city_bus.class);
                startActivity(ijobs);
            }
        });
        picnic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ipicnic = new Intent(getContext().getApplicationContext(), picnicplaces.class);
                startActivity(ipicnic);
            }
        });
        ngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ipicnic = new Intent(getContext().getApplicationContext(), ngo.class);
                startActivity(ipicnic);
          }
      });
            school.setOnClickListener(new View.OnClickListener() {@Override
           public void onClick(View v) {
              Intent school = new Intent(getContext().getApplicationContext(), school.class);
              startActivity(school);
           }
       });
        movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent movie=new Intent(getContext().getApplicationContext(), movie.class);
                startActivity(movie);
            }
        });
        foodies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodies=new Intent(getContext().getApplicationContext(), foodies.class);
                startActivity(foodies);
            }
        });
        tuition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tuition = new Intent(getContext().getApplicationContext(), tuition.class);
                startActivity(tuition);
            }
        });

        college.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tuition = new Intent(getContext().getApplicationContext(), college.class);
                startActivity(tuition);
            }
        });
            auto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        Intent autofare = new Intent(getContext().getApplicationContext(), autofare.class);
                        startActivity(autofare);
                    }
                    catch(Exception e){
                        e.printStackTrace();
                        System.out.println();
                    }
                }
            });
        nearest_police_station.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent nearest_police_station = new Intent(getContext().getApplicationContext(), Nearest_Police_Station.class);
                    startActivity(nearest_police_station);
                }
                catch(Exception e){
                    e.printStackTrace();
                    System.out.println();
                }
            }
        });
    emergency.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent emergency = new Intent(getContext().getApplicationContext(), emergency.class);
            startActivity(emergency);
        }
    });
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bus = new Intent(getContext().getApplicationContext(), bus.class);
                startActivity(bus);
            }
        });

        express.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                inNetworkConnected();
//                Intent railways = new Intent(getContext().getApplicationContext(), express.class);
//                startActivity(railways);
            }
            private boolean inNetworkConnected() {
                ConnectivityManager cm = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
                if(cm.getActiveNetworkInfo()!=null)
                {
                    Intent railways = new Intent(getContext().getApplicationContext(), ListofExpress.class);
                    startActivity(railways);
                }
                else
                {
                    Toast toast=Toast.makeText(getActivity(), "Check Internet Connection", Toast.LENGTH_SHORT);
                    toast.show();
                    toast.setGravity(Gravity.CENTER, 0, 0);
                }
                return cm.getActiveNetworkInfo() != null;
            }
        });
        news.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                inNetworkConnected();
//                Intent railways = new Intent(getContext().getApplicationContext(), express.class);
//                startActivity(railways);
            }
            private boolean inNetworkConnected() {
                ConnectivityManager cm = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
                if(cm.getActiveNetworkInfo()!=null)
                {
                    Intent railways = new Intent(getContext().getApplicationContext(), com.nashik.myNashik.dreams.news.class);
                    startActivity(railways);

                }
                else
                {
                    Toast toast=Toast.makeText(getActivity(), "Check Internet Connection", Toast.LENGTH_SHORT);
                    toast.show();
                    toast.setGravity(Gravity.CENTER, 0, 0);
                }
                return cm.getActiveNetworkInfo() != null;
            }
        });
        return view;
    }
}

