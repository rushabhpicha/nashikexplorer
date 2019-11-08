package com.nashik.myNashik.dreams;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class bus extends AppCompatActivity  {
    SearchView searchview;
    ArrayAdapter<String> adapter;
    ListView listView_autofare;
    String data[] = {"Ahmedabad","Ahmednagar","Akola", "Amaravati","Aurangabad","Baramati","Belgaon","Bhusaval","Chopada",
            "Fultan","Gondawale","Indore","Jalgaon","Karad","Kolhapur","Kalyan","Latur","Mahabaleshwar","Malkhapur","Mumbai",
            "Nagpur","Paithan","Pandharpur","Parbhani","Pune","Pusad","Raver","Sangli","Saswad","ShaniShignapur",
            "Shegaon","Shirdi","Shreerampur","Solapur","Surat","Tuljapur","Yavatmal"};
    String data1[]={"Buses for Ahmedabad","Buses for Ahmednagar","Buses for Akola","Buses for Amaravati","Buses for Aurangabad","Buses for Baramati"
    ,"Buses for Belgaon","Buses for Bhusaval","Buses for Chopada","Buses for Fultan","Buses for Gondawale","Buses for Indore","Buses for Jalgaon"
    ,"Buses for Karad","Buses for Kolhapur","Buses for Kalyan","Buses for Latur","Buses for Mahabaleshwar","Buses for Malkhapur","Buses for Mumbai",
    "Buses for Nagpur","Buses for Paithan","Buses for Pandharpur","Buses for Parbhani","Buses for Pune","Buses for Pusad","Buses for Raver"
    ,"Buses for Sangli","Buses for Saswad","Buses for ShaniShignapur","Buses for Shegaon","Buses for Shirdi","Buses for Shreerampur","Buses for " +
            "Solapur","Buses for Surat","Buses for Tuljapur","Buses for Yavatmal"};
    String bus_stop[]={"Bus Stop:","Bus Stop:","Bus Stop:"};
    String arr[]={"Leaving Time","Leaving Time","Leaving Time","Leaving Time","Leaving Time"};
    String dep[]={"Reaching Time","Reaching Time","Reaching Time","Reaching Time"};
    String value[]={"Central Bus Stand(CBS)","Thakkar","Thakkar","Thakkar","Thakkar","Thakkar","Thakkar","Thakkar","Thakkar"
            ,"Thakkar","Thakkar","Thakkar","Thakkar","Thakkar","Thakkar","Thakkar","Thakkar","Thakkar","Thakkar","Thakkar"
            ,"Thakkar","Thakkar","Thakkar","Thakkar","Thakkar","Thakkar","Thakkar","Thakkar","Thakkar","Thakkar","Thakkar","Thakkar"
            ,"Thakkar","Thakkar","Thakkar","Thakkar","Thakkar","Thakkar","Thakkar","Thakkar"};
    String firsta[]={"02.00 a.m.","After 45 min interval","08.30 a.m.","05.30 a.m.", "After 30 min interval","06.45 a.m.","04.30 a.m.",
    "00.15 a.m.","00.30 a.m.","05.15 a.m.","06.30 a.m.","07.15 a.m.","00.00 a.m.","06.00 a.m.",
    "08.00 p.m.","02.15 a.m.","06.00 a.m.","06.15 a.m.","06.45 a.m.","After 30 min interval","08.00 p.m.",
    "02.30 p.m.","07.00 a.m.","00.00 a.m.","After 30 min interval","08.45 p.m.","05.00 a.m.","06.45 a.m.",
          "06.15 a.m." ,"08.00 a.m." ,"08.00 a.m.","After 30 min interval","01.50 a.m.","06.30 a.m.","00.00 a.m.",
    "07.00 a.m.","06.45 p.m."};
    String firstd[]={"02.00 p.m.","between 07.00 a.m.","08.30 p.m.","08.30 p.m.", "between 05.30 a.m.","02.00 p.m.","07.30 p.m.",
    "06.00 a.m.","06.30 a.m.","02.00 p.m.","06.30 p.m.","07.15 p.m.","05.30 a.m.","03.00 p.m.",
            "07.00 a.m.","06.15 a.m.","05.00 p.m.","03.30 p.m.","02.45 p.m.","between 05.30 a.m.","01.30 p.m.",
    "09.30 p.m.","04.00 p.m.","12.00 p.m.","between 05.00 a.m.","08.45 a.m.","01.00 p.m.","05.30 p.m.",
           "12.30 p.m.","12.30 p.m.","07.00 p.m.","between 05.30 a.m.","05.45 a.m.","03.30 p.m.","06.00 a.m."
    ,"05.00 p.m.","06.30 a.m."};
    String seconda[]={"08.30 a.m.","to 07.00 p.m.","09.45 a.m.","","to 09.30 p.m.","","03.00 p.m.",
            "06.00 a.m.","01.30 p.m.","","","", "11.45 a.m.","",
            "","12.30 p.m.","09.30 p.m.","","","to 09.30 p.m.", "",
            "06.15 p.m.","09.00 a.m.","","to 9.30 p.m.","", "09.15 p.m.","07.15 p.m.",
                  "04.00 p.m."  ,"" ,"" ,"to 09.30 p.m.","02.25 a.m." ,"08.30 a.m.","00.15 a.m."
    ,"08.00 a.m.",""};
    String secondd[]={"08.30 p.m.","","09.00 p.m.","","","","06.00 a.m.",
            "12.00 p.m.","07.30 p.m.","","","","05.30 p.m.","",
            "","04.45 p.m.", "08.30 a.m.","","","","",
            "7.00 p.m.","06.00 p.m.","","","","05.30 p.m.","06.00 a.m.",
           "10.00 p.m.","","","","06.30 a.m.","05.30 p.m.","06.15 a.m.",
    "06.00 p.m.",""};
    String thirda[]={"04.00 p.m.","","","","","","",
            "12.00 p.m.","02.30 p.m.","","","","",""
            ,"","02.00 p.m.","","","","","",
            "","08.30 p.m.", "","","","","",
           "","","","","05.45 a.m.","09.30 a.m.","10.30 a.m."
    ,"10.00 a.m.",""};
    String thirdd[]={"04.00 a.m.","","","","","","",
            "06.00 p.m.","08.30 p.m.","","","","","",
            "","06.15 p.m.","","","","","",
            "","05.30 a.m.","", "","","","",
            "","","","","10.00 a.m.","06.30 p.m.","04.30 p.m."
    ,"08.00 p.m.",""};
    String fourtha[]={"08.30 p.m.","","","","","","",
            "01.15 p.m.","04.30 p.m.","","","","","",
            "","04.00 p.m.","","","","","",
            "","","","","","","",
            "" ,"" ,"" ,"" ,"10.15 a.m.","11.00 a.m.","11.30 a.m."
    ,"07.00 p.m.",""};
    String fourthd[]={"08.30 a.m.","","","","","",""
            ,"07.30 p.m.","10.30 p.m.","","","","","",
            "","08.30 p.m.","","","","","",
            "","","","","", "","",
            "","","","","02.30 p.m.","08.00 p.m.","05.30 p.m.",
    "05.00 a.m.",""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);
        listView_autofare= (ListView) findViewById(R.id.listview_autofare);

        TextView contact_us= (TextView) findViewById(R.id.contact_us);
        contact_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bus_contacts = new Intent(bus.this,contact_bus.class);
                startActivity(bus_contacts);
            }
        });
         adapter=new ArrayAdapter<String>(this, R.layout.listview_for_picnicplaces, R.id.textView_picnic,data);
        listView_autofare.setAdapter(adapter);

       // searchview.setIconifiedByDefault(false);

        listView_autofare.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                for(int i=0;i<=data.length;i++) {
                    if (position == i) {
                        Intent intent = new Intent(bus.this, informationn_buses.class);
                        intent.putExtra("bus_heading", data1[i]);
                        intent.putExtra("arrival", arr[0]);
                        intent.putExtra("departure", dep[0]);
                        intent.putExtra("bus_stop", bus_stop[0]);
                        intent.putExtra("value", value[i]);
                        intent.putExtra("afirst", firsta[i]);
                        intent.putExtra("dfirst", firstd[i]);
                        intent.putExtra("asecond", seconda[i]);
                        intent.putExtra("dsecond", secondd[i]);
                        intent.putExtra("athird", thirda[i]);
                        intent.putExtra("dthird", thirdd[i]);
                        intent.putExtra("afourth", fourtha[i]);
                        intent.putExtra("dfourth", fourthd[i]);

                        startActivity(intent);
                    }
                }
//                if(position==1) {
//                    Intent intent=new Intent(bus.this,informationn_buses.class);
//                    intent.putExtra("bus_heading",data1[1]);
//                    intent.putExtra("arrival",arr[1]);
//                    intent.putExtra("departure",dep[1]);
//                    intent.putExtra("bus_stop",bus_stop[1]);
//                    intent.putExtra("value",value[1]);
//                    intent.putExtra("afirst",firsta[1]);
//                    intent.putExtra("dfirst",firstd[1]);
//                    intent.putExtra("asecond",seconda[1]);
//                    intent.putExtra("dsecond",secondd[1]);
//                    intent.putExtra("athird",thirda[1]);
//                    intent.putExtra("dthird",thirdd[1]);
//                    intent.putExtra("afourth",fourtha[1]);
//                    intent.putExtra("dfourth",fourthd[1]);
//                    startActivity(intent);
//                }
//                if(position==2) {
//                    Intent intent=new Intent(bus.this,informationn_buses.class);
//                    intent.putExtra("bus_heading",data1[2]);
//                    intent.putExtra("arrival",arr[2]);
//                    intent.putExtra("departure",dep[2]);
//                    intent.putExtra("bus_stop",bus_stop[2]);
//                    intent.putExtra("value",value[2]);
//                    intent.putExtra("afirst",firsta[2]);
//                    intent.putExtra("dfirst",firstd[2]);
//                    intent.putExtra("asecond",seconda[2]);
//                    intent.putExtra("dsecond",secondd[2]);
//                    intent.putExtra("athird",thirda[2]);
//                    intent.putExtra("dthird",thirdd[2]);
//                    intent.putExtra("afourth",fourtha[2]);
//                    intent.putExtra("dfourth",fourthd[2]);
//                    startActivity(intent);
//                }
//                if(position==3) {
//                    Intent intent=new Intent(bus.this,informationn_buses.class);
//                    intent.putExtra("bus_heading",data1[3]);
//                    intent.putExtra("arrival",arr[3]);
//                    intent.putExtra("departure",dep[3]);
//                    intent.putExtra("bus_stop",bus_stop[3]);
//                    intent.putExtra("value",value[3]);
//                    intent.putExtra("afirst",firsta[3]);
//                    intent.putExtra("dfirst",firstd[3]);
//                    intent.putExtra("asecond",seconda[3]);
//                    intent.putExtra("dsecond",secondd[3]);
//                    intent.putExtra("athird",thirda[3]);
//                    intent.putExtra("dthird",thirdd[3]);
//                    intent.putExtra("afourth",fourtha[3]);
//                    intent.putExtra("dfourth",fourthd[3]);
//                    startActivity(intent);
//                }
//                if(position==4) {
//                    Intent intent=new Intent(bus.this,informationn_buses.class);
//                    intent.putExtra("bus_heading",data1[4]);
//                    intent.putExtra("arrival",arr[4]);
//                    intent.putExtra("departure",dep[4]);
//                    intent.putExtra("bus_stop",bus_stop[4]);
//                    intent.putExtra("value",value[4]);
//                    intent.putExtra("afirst",firsta[4]);
//                    intent.putExtra("dfirst",firstd[4]);
//                    intent.putExtra("asecond",seconda[4]);
//                    intent.putExtra("dsecond",secondd[4]);
//                    intent.putExtra("athird",thirda[4]);
//                    intent.putExtra("dthird",thirdd[4]);
//                    intent.putExtra("afourth",fourtha[4]);
//                    intent.putExtra("dfourth",fourthd[4]);
//                    startActivity(intent);
//                }
//                if(position==5) {
//                    Intent intent=new Intent(bus.this,informationn_buses.class);
//                    intent.putExtra("bus_heading",data1[5]);
//                    intent.putExtra("arrival",arr[5]);
//                    intent.putExtra("departure",dep[5]);
//                    intent.putExtra("bus_stop",bus_stop[5]);
//                    intent.putExtra("value",value[5]);
//                    intent.putExtra("afirst",firsta[5]);
//                    intent.putExtra("dfirst",firstd[5]);
//                    intent.putExtra("asecond",seconda[5]);
//                    intent.putExtra("dsecond",secondd[5]);
//                    intent.putExtra("athird",thirda[5]);
//                    intent.putExtra("dthird",thirdd[5]);
//                    intent.putExtra("afourth",fourtha[5]);
//                    intent.putExtra("dfourth",fourthd[5]);
//                    startActivity(intent);
//                }
//                if(position==6) {
//                    Intent intent=new Intent(bus.this,informationn_buses.class);
//                    intent.putExtra("bus_heading",data1[6]);
//                    intent.putExtra("arrival",arr[6]);
//                    intent.putExtra("departure",dep[6]);
//                    intent.putExtra("bus_stop",bus_stop[6]);
//                    intent.putExtra("value",value[6]);
//                    intent.putExtra("afirst",firsta[6]);
//                    intent.putExtra("dfirst",firstd[6]);
//                    intent.putExtra("asecond",seconda[6]);
//                    intent.putExtra("dsecond",secondd[6]);
//                    intent.putExtra("athird",thirda[6]);
//                    intent.putExtra("dthird",thirdd[6]);
//                    intent.putExtra("afourth",fourtha[6]);
//                    intent.putExtra("dfourth",fourthd[6]);
//                    startActivity(intent);
//                }
//                if(position==7) {
//                    Intent intent=new Intent(bus.this,informationn_buses.class);
//                    intent.putExtra("bus_heading",data1[7]);
//                    intent.putExtra("arrival",arr[7]);
//                    intent.putExtra("departure",dep[7]);
//                    intent.putExtra("bus_stop",bus_stop[7]);
//                    intent.putExtra("value",value[7]);
//                    intent.putExtra("afirst",firsta[3]);
//                    intent.putExtra("dfirst",firstd[3]);
//                    intent.putExtra("asecond",seconda[3]);
//                    intent.putExtra("dsecond",secondd[3]);
//                    intent.putExtra("athird",thirda[3]);
//                    intent.putExtra("dthird",thirdd[3]);
//                    intent.putExtra("afourth",fourtha[3]);
//                    intent.putExtra("dfourth",fourthd[3]);
//                    startActivity(intent);
//                }
//                if(position==3) {
//                    Intent intent=new Intent(bus.this,informationn_buses.class);
//                    intent.putExtra("bus_heading",data1[3]);
//                    intent.putExtra("arrival",arr[3]);
//                    intent.putExtra("departure",dep[3]);
//                    intent.putExtra("bus_stop",bus_stop[3]);
//                    intent.putExtra("value",value[3]);
//                    intent.putExtra("afirst",firsta[3]);
//                    intent.putExtra("dfirst",firstd[3]);
//                    intent.putExtra("asecond",seconda[3]);
//                    intent.putExtra("dsecond",secondd[3]);
//                    intent.putExtra("athird",thirda[3]);
//                    intent.putExtra("dthird",thirdd[3]);
//                    intent.putExtra("afourth",fourtha[3]);
//                    intent.putExtra("dfourth",fourthd[3]);
//                    startActivity(intent);
//                }
//                if(position==3) {
//                    Intent intent=new Intent(bus.this,informationn_buses.class);
//                    intent.putExtra("bus_heading",data1[3]);
//                    intent.putExtra("arrival",arr[3]);
//                    intent.putExtra("departure",dep[3]);
//                    intent.putExtra("bus_stop",bus_stop[3]);
//                    intent.putExtra("value",value[3]);
//                    intent.putExtra("afirst",firsta[3]);
//                    intent.putExtra("dfirst",firstd[3]);
//                    intent.putExtra("asecond",seconda[3]);
//                    intent.putExtra("dsecond",secondd[3]);
//                    intent.putExtra("athird",thirda[3]);
//                    intent.putExtra("dthird",thirdd[3]);
//                    intent.putExtra("afourth",fourtha[3]);
//                    intent.putExtra("dfourth",fourthd[3]);
//                    startActivity(intent);
//                }
//                if(position==3) {
//                    Intent intent=new Intent(bus.this,informationn_buses.class);
//                    intent.putExtra("bus_heading",data1[3]);
//                    intent.putExtra("arrival",arr[3]);
//                    intent.putExtra("departure",dep[3]);
//                    intent.putExtra("bus_stop",bus_stop[3]);
//                    intent.putExtra("value",value[3]);
//                    intent.putExtra("afirst",firsta[3]);
//                    intent.putExtra("dfirst",firstd[3]);
//                    intent.putExtra("asecond",seconda[3]);
//                    intent.putExtra("dsecond",secondd[3]);
//                    intent.putExtra("athird",thirda[3]);
//                    intent.putExtra("dthird",thirdd[3]);
//                    intent.putExtra("afourth",fourtha[3]);
//                    intent.putExtra("dfourth",fourthd[3]);
//                    startActivity(intent);
//                }
//                if(position==3) {
//                    Intent intent=new Intent(bus.this,informationn_buses.class);
//                    intent.putExtra("bus_heading",data1[3]);
//                    intent.putExtra("arrival",arr[3]);
//                    intent.putExtra("departure",dep[3]);
//                    intent.putExtra("bus_stop",bus_stop[3]);
//                    intent.putExtra("value",value[3]);
//                    intent.putExtra("afirst",firsta[3]);
//                    intent.putExtra("dfirst",firstd[3]);
//                    intent.putExtra("asecond",seconda[3]);
//                    intent.putExtra("dsecond",secondd[3]);
//                    intent.putExtra("athird",thirda[3]);
//                    intent.putExtra("dthird",thirdd[3]);
//                    intent.putExtra("afourth",fourtha[3]);
//                    intent.putExtra("dfourth",fourthd[3]);
//                    startActivity(intent);
//                }
//                if(position==3) {
//                    Intent intent=new Intent(bus.this,informationn_buses.class);
//                    intent.putExtra("bus_heading",data1[3]);
//                    intent.putExtra("arrival",arr[3]);
//                    intent.putExtra("departure",dep[3]);
//                    intent.putExtra("bus_stop",bus_stop[3]);
//                    intent.putExtra("value",value[3]);
//                    intent.putExtra("afirst",firsta[3]);
//                    intent.putExtra("dfirst",firstd[3]);
//                    intent.putExtra("asecond",seconda[3]);
//                    intent.putExtra("dsecond",secondd[3]);
//                    intent.putExtra("athird",thirda[3]);
//                    intent.putExtra("dthird",thirdd[3]);
//                    intent.putExtra("afourth",fourtha[3]);
//                    intent.putExtra("dfourth",fourthd[3]);
//                    startActivity(intent);
//                }

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search, menu);
        // Retrieve the SearchView and plug it into SearchManager
        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(menu.findItem(R.id.action_search));
        SearchManager searchManager = (SearchManager) getSystemService(SEARCH_SERVICE);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));



        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }

}
