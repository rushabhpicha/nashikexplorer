package com.nashik.myNashik.dreams;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
//import static com.nashik.picha.dreams.R.*;

public class autofare_day extends Fragment {
    ListView listView_autofare;
    String[] data={"Upto 1.5KM Rs.18","1.6KM Rs.19","1.7KM Rs.20","1.8KM Rs.22","1.9KM Rs.23","2.0KM Rs.24","2.1KM Rs.25"
                    ,"2.2KM  Rs.27","2.3KM Rs.28","2.4KM Rs.29","2.5KM Rs.30","2.6KM Rs.31","2.7KM Rs.32","2.8KM Rs.34","2.9KM Rs.35","3.0KM Rs.36"
                        ,"3.1KM Rs.37","3.2KM Rs.38","3.3KM Rs.39","3.4Km Rs.41","3.5KM Rs.42","3.6KM Rs.43","3.7KM Rs.44","3.8KM Rs.45",
            "3.9KM Rs.46","4.0KM Rs.48","4.1KM Rs.50","4.2KM Rs.51","4.3KM Rs.52","4.4KM Rs.53","4.5KM Rs.54","4.6KM Rs.56","4.7KM Rs.57","4.8KM Rs.58",
            "4.9KM Rs.59","5.0KM Rs.61","5.1KM Rs.62","5.2KM Rs.63","5.4KM Rs.65","5.5KM Rs.67","5.6KM Rs.68","5.7KM Rs.69","5.8KM Rs.71","5.9KM Rs.72",
            "6.0KM Rs.73"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_autofare_day, container, false);
        listView_autofare= (ListView) view.findViewById(R.id.listview_autofare);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(), R.layout.listview_for_picnicplaces, R.id.textView_picnic,data);
        listView_autofare.setAdapter(adapter);
        return view;
    }

}
