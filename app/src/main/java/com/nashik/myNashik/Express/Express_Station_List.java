package com.nashik.myNashik.Express;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.nashik.myNashik.dreams.R;

public class Express_Station_List extends AppCompatActivity {

    String source;
    public String type;
    String destination;
    SearchView searchview;
    EditText inputStation;
    ArrayAdapter<String> adapter;
    ListView listView_autofare;
    TextView title;
    String data[]={"Adilabad",
            "Agra Cantt",
            "Ajni",
            "Akola Junction",
            "Alipur Duar Junction",
            "Allahabad Junction",
            "Ara",
            "Atarra",
            "Aunrihar Junction",
            "Aurangabad",
            "Babhnan",
            "Babina",
            "Badnera",
            "Badnera Junction",
            "Bahadurgarh",
            "Banapura",
            "Banda Junction",
            "Barauni Junction",
            "Bareta",
            "Basti",
            "Begu Sarai",
            "Bhandara Road",
            "Bharwa Sumerpur",
            "Bhatinda",
            "Bhokar",
            "Bhopal Junction",
            "Bhusaval Junction",
            "Bilaspur Junction",
            "Bina Junction",
            "Bodvad",
            "Budhlada",
            "Burhanpur",
            "Buxar",
            "Chaitrakot",
            "Chakradharpur",
            "Chalisgaon",
            "Chalisgaon Junction",
            "Chandur",
            "Cheoki",
            "Chunar",
            "Dabra",
            "Dadar",
            "Danapur",
            "Datia",
            "Delhi Kishanganj",
            "Devlali",
            "Dhamangaon",
            "Dhaulpur",
            "Durg",
            "Faizabad Junction",
            "Faridabad",
            "Faridkot",
            "Firozpur Cant",
            "Gadarwara",
            "Gangsar Jaitu",
            "Ganj Basoda",
            "Goalpara Town",
            "Gonda Junction",
            "Gondia Junction",
            "Goneana",
            "Gorakhpur Junction",
            "Gwalior",
            "Habibganj",
            "Hamirpur Road",
            "Harda",
            "Hazur Sahib Nanded",
            "Himayatnagar",
            "Hinganghat",
            "Hoshangabad",
            "Igatpuri",
            "Itarasi",
            "Itarasi Junction",
            "Jabalpur",
            "Jakhal Junction",
            "Jalamb",
            "Jalgaon Junction",
            "Jalna",
            "Janghai Junction",
            "Jarwal Road",
            "Jaunpur Junction",
            "Jhansi Junction",
            "Jharsuguda Junction",
            "Jind Junction",
            "Kalyan Junction",
            "Kamakhya",
            "Kanpur Central",
            "Kasara",
            "Kashi",
            "Katihar Junction",
            "Katni",
            "Kayar",
            "Khalilabad",
            "Khandwa",
            "Kharagpur Junction",
            "Khirkiya",
            "Khnadwa",
            "Kinwat",
            "Kishanganj",
            "Knapur Central",
            "Kosi Kalan",
            "Kot Kapura",
            "Lalitpur",
            "Lasalgaon",
            "Lasalgaon (LS)",
            "Lasur",
            "Lingti",
            "Lokmanyatilak T(LTT)",
            "Lucknow Nr",
            "Madan Mahal",
            "Maihar",
            "Majri Junction",
            "Malkapur",
            "Manikpur Junction",
            "Manmad Junction",
            "Mansa",
            "Manwath Road",
            "Mathura",
            "Mau Junction",
            "Maur",
            "Mirzapur",
            "Morena",
            "Mudkhed Junction",
            "Mumbai CSMT",
            "Murtajapur",
            "Nagarsol",
            "Nagpur",
            "Nagpur Junction",
            "Nandgaon",
            "Nandura",
            "Narsinghpur",
            "Narwana",
            "Nashik Road",
            "Naugachia",
            "Nepanagar",
            "New Bongaigaon",
            "New Delhi",
            "New Jalpaiguri",
            "Niphad",
            "Orai",
            "Pachora Junction",
            "Parbhani Junction",
            "Partur",
            "Patna Junction",
            "Pimpal Khuti",
            "Pipariya",
            "Pokhrayan",
            "Pulgaon",
            "Purna Junction",
            "Raipur Junction",
            "Raja ki Mandi",
            "Rohtak Junction",
            "Rotegaon",
            "Rourkela",
            "Sahasrakund",
            "Santragachi Junction",
            "Satna",
            "Selu",
            "Sewagram Junction",
            "Shahganj Junction",
            "Shakurbasti",
            "Shegaon",
            "Siliguri Junction",
            "Sindi",
            "Tatanagar Junction",
            "Thane",
            "Tohana",
            "Tumsar Road",
            "Varanasi Junction",
            "Varangaon",
            "Vidisha",
            "Vindhyachal",
            "Wani",
            "Wardha",
            "Wardha Junction",
            "Warora",
            "Zafarabad Junction"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.express__station__list);

//        getWindow().setSoftInputMode(
//                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        listView_autofare= (ListView) findViewById(R.id.listview_autofare);
        title= (TextView) findViewById(R.id.title);
        inputStation= (EditText) findViewById(R.id.input);

        this.source = getIntent().getStringExtra("source");
        this.destination = getIntent().getStringExtra("destination");
        this.type = getIntent().getStringExtra("type");

        inputStation.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                    adapter.getFilter().filter(s, new Filter.FilterListener() {
                        @Override
                        public void onFilterComplete(int count) {
                            if(count==0)
                            {
                                Toast toast = Toast.makeText(Express_Station_List.this, "No Station Found!", Toast.LENGTH_SHORT);
                                toast.show();
                                toast.setGravity(Gravity.CENTER, 0, 0);
                            }
                        }
                    });
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        if(type.equals("i"))
        {
            inputStation.setHint("You are at?");
        }
        if(type.equals("o"))
        {
            inputStation.setHint("Where you want to go?");
        }
        adapter=new ArrayAdapter<String>(this, R.layout.listview_for_picnicplaces, R.id.textView_picnic,data);
        listView_autofare.setAdapter(adapter);

        listView_autofare
                .setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String station_name = (String) listView_autofare.getItemAtPosition(position);
                if (type.equals("i")) {
                    source = station_name;
                    destination="Nashik Road";
                } else if (type.equals("o")) {
                    destination=station_name;
                    source="Nashik Road";
                }
                Intent intent = new Intent(Express_Station_List.this, ListofExpress.class);
                intent.putExtra("source", source);
                intent.putExtra("destination", destination);
                intent.putExtra("type", "i");
                Express_Station_List.this.startActivity(intent);
            }
        });
    }
}
