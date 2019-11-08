package com.nashik.myNashik.dreams;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class city_bus extends AppCompatActivity {

    ListView listView_autofare;
    String data[]={"Nashik Road to Mahatma Nagar","Nashik Road To Panchavati","Nashik Road to Satpur","Nashik Road to Ambad via Pandav Leni"
            ,"Nashik Road to Navin Jakat Naka","Nashik Road to Ashoka Tower","Nashik Road to Eklahara Colony",
            "Nashik Road to Eklahara Gaon","Nashik Road to Mhasrul", "Nashik Road to Nimani via Jail Road","Nashik Road to Nimani via Takli"
            };
    String timings[]={
    "07.15 a.m.,07.50 a.m.,08.00 a.m.,08.45 a.m.,09.00 a.m.,09.20 a.m.,09.50 a.m.,11.00 a.m.,02.30 p.m.,04.15 p.m.,05.15 p.m.,05.45 p.m.,07.15 p.m.,09.50 p.m.",
            "In every 5 minutes there is a bus from Nashik Road from 05:00 a.m.to 12:00 a.m."
            ,"In every 35 minutes there is a bus from Nashik Road from 04:00 a.m.to 11.30 a.m.",

            "In every 25 minutes there is a bus from Nashik Road from 04:00 a.m.to 11:15 a.m.",

            "07:35 a.m.,09:25 a.m.,11:30 a.m.,03:03 p.m.,05:05 p.m.,07:15 p.m.",

            "07:10 a.m.,07:15 a.m.,08:15 a.m.,08:55 a.m.,09:30 a.m.,10:15 a.m.,12:20 p.m.,02:00 p.m.,03:40 p.m.,04:45 p.m.,05:05 p.m.,07:45 p.m.",
            "In every 5 minutes there is a bus from Nashik Road from 05:00 a.m.to 12:00 a.m.",
            "08.45 a.m.,10.45 a.m.,12.35 p.m.,05.55 p.m.",
            "In every 30 minutes there is a bus from Nashik Road from 05:10 a.m.to 09.50 p.m.",

                "Every 5 min there is a bus from Nashik Road in from Morning 05:00 a.m.to night 12:00 a.m.","04.00 a.m.,06.00 a.m.,06.45 a.m.,07.15 a.m.,07.25 a.m.,07.45 a.m.,07.50 a.m.,08:05 a.m.,08:10 a.m.,08:25 a.m.,08:35 a.m.,09:15 a.m.,09:45 a.m.,09:50 a.m.,10:30 a.m.,11:00 a.m.,11:30a.m.,12:30 p.m.,01:00 p.m.,02:00 p.m.,02:15 p.m.,03:10 p.m.,03:30 p.m.,04:00 p.m.,04:20 p.m.,04:25 p.m.,05:00 p.m.,05:30 p.m.,06:15 p.m.,06:30 p.m.,07:20 p.m.,08:00 p.m.,08:30 p.m.,09:00 p.m.,09:50 p.m.,11:00 p.m.,11:10 p.m.,11:15 p.m.,11:25 p.m.","04:00 a.m.,05:50 a.m.,06:05 a.m.,06:35 a.m.,07:10 a.m.,07:15 a.m.,07:20 a.m.,07:30 a.m.,07:50 a.m.,08:20 a.m.,08:30 a.m.,09:05 a.m.,09:15 a.m.,09:50 a.m.,10:00 a.m.,10:15 a.m.,10:30 a.m.,11:05 a.m.,11:15 a.m.,11:45 a.m.,01:40 p.m.,02:15 p.m.,02:30 p.m.,03:00 p.m.,03:30 p.m.,03:45 p.m.,04:00 p.m.,04:15 p.m.,04:40 p.m.,05:00 p.m.,05:30 p.m.,05:40 p.m.,05:50 p.m.,06:10 p.m.,06:30 p.m.,07:10 p.m.,07:30 p.m.,08:15 p.m.,09:15 p.m.,09:50 p.m.,11:15 p.m.","07:35 a.m.,09:25 a.m.,11:30 a.m.,03:03 p.m.,05:05 p.m.,07:15 p.m.”,”07:10 a.m.,07:15 a.m.,08:15 a.m.,08:55 a.m.,09:30 a.m.,10:15 a.m.,12:20 p.m.,02:00 p.m.,03:40 p.m.,04:45 p.m.,05:05 p.m.,07:45 p.m.","06:00 a.m.,06:40 a.m.,07:25 a.m.,08:00 a.m.,08:15 a.m.,09:25 a.m.,09:50 a.m.,10:15 a.m.,11:00 a.m.,11:40 a.m.,12:40 p.m.,01:20 p.m.,01:45 p.m.,02:15 p.m.,02:45 p.m.,03:15 p.m.,04:15 p.m.,05:15 p.m.,05:30 p.m.,06:15 p.m.,07:00 p.m.,07:30 p.m.,08:15 p.m.,09:15 p.m.,10:15 p.m.,11:15 p.m.","08:45 a.m.,10:45 a.m.,12:35 p.m.,05:55 p.m.","05:10 a.m.,06:00 a.m.,06:25 a.m.,07:00 a.m.,08:10 a.m.,08:25 a.m.,08:30 a.m.,08:45 a.m.,09:00 a.m.,09:15 a.m.,09:50 a.m.,10:05 a.m.,10:10 a.m.,10:35 a.m.,10:45 a.m.,11:05 a.m.,12:25 p.m.,12:50 p.m.,01:10 p.m.,01:50 p.m.,02:15 p.m.,02:30 p.m.,03:00 p.m.,03:20 p.m.,03:30 p.m.,04:10 p.m.,04:30 p.m.,05:05 p.m.,05:15 p.m.,05:30 p.m.,06:15 p.m.,06:35 p.m.,06:50 p.m.,08:00 p.m.,08:30 p.m.,09:50p.m.","05:35 a.m.,06:45 a.m.,06:55 a.m.,07:40 a.m.,08:15 a.m.,08:45 a.m.,09:00 a.m.,10:00 a.m.,10:25 a.m.,10:35 a.m.,11:00 a.m.,11:25 a.m.,11:40 a.m.,12:30 p.m.,01:35 p.m.,02:10 p.m.,03:00 p.m.,03:25 p.m.,04:10 p.m.,04:20 p.m.,04:45 p.m.,05:00 p.m.,05:40 p.m.,06:10 p.m.,06:20 p.m.,06:40 p.m.,07:10 p.m.,07:30 p.m.,08:15 p.m.,08:45 p.m.,09:15 p.m.,09:50 p.m.","05:40 a.m.,06:20 a.m.,07:10 a.m.,07:40 a.m.,08:55 a.m.,09:15 a.m.,10:15 a.m.,11:00 a.m.,12:25 p.m.,01:40 p.m.,03:15 p.m.,04:40 p.m.,06:50 p.m.,08:15 p.m.,10:10 p.m.,10:30"};
    String stops[]={"->Nashik Road\n->Bytco\n->Datta Nagar\n->Nehru Nagar\n->Upnagar\n->Gandhi Nagar\n->Ambedkar Nagar\n->Bodhale Nagar\n->"+
            "Siddharth\n->Pornima\n->Dwarka\n->Shalimar\n->Sharanpur Police Station\n->Big Bazaar\n->College Road\n->Model Colony\n->"+
            "Parijat Nagar\n->Mahatma Nagar","->Nasik Road\n->Bytco\n->Datta Mandir\n->Ashirwad\n->Mehta High School (Shikarewadi)\n->Nehru Nagar\n->Upnagar\n->Gandhi Nagar\n->Ambedkar Nagar\n->Bodhale Nagar\n->Siddharth\n->Pornima\n->Dwarka\n->Shalimar\n->CBS\n->Ashok Stambh\n->Ravivar Karanja\n->Nimani Panchwati","->Nashik Road\n->Datta Mandir\n->Ashirwad\n->Mehta High School (Shikarewadi)\n->Nehru Nagar\n->Upnagar Mun. Naka\n->Gandhi Nagar\n->Ambedkar Nagar\n->Bodhale Nagar\n->Siddharth\n->pornima\n->Dwarka\n->Old Wadala Nagar\n->Tilak Peth\n->Shalimar\n->ABB Circle\n->ITI Signal\n->Satpur","->Nashik Road\n->Bytco\n->Datta Nagar\n->Nehru Nagar\n->Upnagar\n->Gandhi Nagar\n->Ambedkar Nagar\n->Bodhale Nagar\n->Siddharth\n->Pornima\n->Dwarka\n->Mumbai Naka\n->Pathardi Fata\n->Lekh Nagar\n->SBI\n->Rane Nagar\n->Pathrdi\n->Pandav Lene\n->Ambad","->Nasik Road\n->Bytco\n->Datta Mandir\n->Ashirwad\n->Mehta High School (Shikarewadi)\n->Nehru Nagar\n->Upnagar\n->Gandhi Nagar\n->Ambedkar Nagar\n->Bodhale Nagar\n->Siddharth\n->Pornima\n->Dwarka\n->Shalimar\n->CBS\n->Ashok Stambh\n->Ravivar Karanja\n->Nimani Panchwati\n->Market Yard I/Shed\n->MSEB Colony\n->CDO\n->Meri Colony\n->RTO Corner\n->TB Sanitorium\n->Petrol Pump/ Anand Ashram\n->Mhasarul\n->Navin Jakat Naka","->Nasik Road\n->Bytco\n->Datta Nagar\n->Nehru Nagar\n->Upnagar\n->Gandhi Nagar\n->Ambedkar Nagar\n->Bodhale Nagar\n->Ashoka Tower","->Nashik Road\n->Sinnar Fata\n->Old & New Eklara X Road\n->Aringale Vasti\n->Rly. Traction/W Shop\n->Pawar Wadi\n->Chambari No 1/Rly X Road\n->Colony End\n->Eklahare Thermal Power Station",

            "->Nashik Road\n->Sinnar Fata\n->Old & New Eklara X Road\n->Aringale Vasti\n->Rly. Traction/W Shop\n->Pawar Wadi\n->Chambari No 1/Rly X Road\n->Colony End\n->Shivaji Wadi\n->Company Gate\n->Eklahare Village","->Nashik Road\n->Bytco\n->Datta Mandir\n->Ashirwad\n->Mehta High School (Shikarewadi)\n->Nehru Nagar\n->Upnagar\n->Gandhi Nagar\n->Ambedkar Nagar\n->Bodhale Nagar\n->Siddharth\n->Pornima\n->Dwarka\n->Shalimar\n->CBS\n->Ashok Stambh\n->Ravivar Karanja\n->Nimani Panchwati\n->Market Yard/I Shed\n->MSEB Colony\n->CDO\n->Meri Colony\n->RTO Corner\n->TB Sanitorium\n->Petrol Pump/ Anand Ashram\n->Mhasrul","->Nashik Road\n->Bytco\n->Girls School\n->P.C. School Fata\n->Bhim Nagar\n->Ingale Nagar/ Takli\n->Shivaji Nagar\n->Sailani Baba/ Chatrapati Chowk\n->Dasak Village\n->Manur\n->Nandur Village\n->Nandur Naka\n->Nimase Farm\n->Itro Chaya\n->Kailas Nagar\n->Seva Hsg. Soc.\n->Janardhan Swami Ashram\n->Aurangabad Naka\n->Old Adgaon Naka/ Hirawadi Fata\n->Nimani Panchwati","->Nashik Road\n->Bytco\n->Datta Mandir\n->Ashirwad\n->Shikare Wadi\n->Nehru Nagar\n->Upnagar Naka Stop\n->Icchamani Nagar\n->Sanjay Nagar\n->Ramdas Swami Nagar\n->Indrayami Nagar\n->Samta Nagar\n->Takli\n->Kathe Mala\n->Jaishankar garden Mangal Karyalay\n->Shankar Nagar\n->Ganesh Nagar Soc\n->siddheshwar Hanuman Mandir/ Kathe Galli\n->Dwarka\n->Wadala Naka\n->Tilak Peth\n->Shalimar\n->CBS\n->Ravivar Karanja\n->Nimani"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_bus);
        listView_autofare= (ListView) findViewById(R.id.listview_autofare);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, R.layout.listview_for_picnicplaces, R.id.textView_picnic,data);
        listView_autofare.setAdapter(adapter);
        listView_autofare.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                for (int i = 0; i <= data.length; i++) {
                    if (position == i) {
                        Intent intent = new Intent(city_bus.this, information_citybus.class);
                        intent.putExtra("timings_values",timings[i]);
                        intent.putExtra("stops_values",stops[i]);
                        startActivity(intent);
                    }
                }
            }
            });
        }
}
