package com.nashik.myNashik.dreams;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class about extends Fragment {
    ListView listView_autofare;
    String data[]={"Share App With Your Friends","Contact Us","Feedback","Terms and Conditions","Advertise with us" };

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState){
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_about, container, false);
//        Button button= (Button) view.findViewById(R.id.button);
//        Button button1= (Button) view.findViewById(R.id.button1);

        listView_autofare= (ListView) view.findViewById(R.id.listview_autofare);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(), R.layout.listview_about, R.id.textView_picnic,data);
        listView_autofare.setAdapter(adapter);
            listView_autofare.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String data = String.valueOf(parent.getItemAtPosition(position));
                    if(position==0)
                    {
                        try {
                            Intent i = new Intent(Intent.ACTION_SEND);
                            i.setType("text/plain");
                            i.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                            String sAux = "\nLet me recommend you this application for the city of Nashik.\n\n";
                            sAux = sAux + "https://play.google.com/market://details?id=com.example.picha \n\n";
                            i.putExtra(Intent.EXTRA_TEXT, sAux);
                            startActivity(Intent.createChooser(i, "choose one"));
                        } catch (Exception e) {
                            //e.toString();
                        }
                    }
                    if(position==2)
                    {
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.setType("plain/text");
                        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "rushabhpicha12@gmail.com" });
                        intent.putExtra(Intent.EXTRA_SUBJECT, "Enter your subject here:");
                        intent.putExtra(Intent.EXTRA_TEXT, "Enter your feedback here:");
                        startActivity(Intent.createChooser(intent, ""));
                    }
                    if(position==1)
                    {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:9167211958"));
                        startActivity(intent);
                    }
                    if(position==4)
                    {
                        Intent email = new Intent(android.content.Intent.ACTION_SEND);
                        email.setType("message/rfc822");
                        email.putExtra(Intent.EXTRA_EMAIL, new String[] { "rushabhpicha12@gmail.com" });
                        email.putExtra(Intent.EXTRA_SUBJECT, "Advertisement Content");
                        email.putExtra(Intent.EXTRA_TEXT, "Enter the content here:-");
                        startActivity(Intent.createChooser(email,"Choose an Email client :"));
                    }

                }
            });
        return view;
    }
}
