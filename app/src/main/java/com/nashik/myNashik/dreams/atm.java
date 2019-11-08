package com.nashik.myNashik.dreams;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class atm extends AppCompatActivity {

    ListView listView_autofare;
    ArrayAdapter<String> adapter;
    String data[]={"Axis Bank",
            "Bank of Baroda",
            "Bank of India",
            "Central Bank of India",
            "Citi Bank",
            "City Union Bank",
            "Corporation Bank",
            "Development Credit Bank",
            "Federal Bank",
            "HDFC Bank",
            "ICICI Bank",
            "IDBI Bank",
            "IJS Bank",
            "Indian Bank",
            "Indian Overseas Bank",
            "IndusInd Bank",
            "ING Vysya Bank",
            "Jalgaon Janata Sahakari Bank",
            "Jammu and Kashmir Bank",
            "Karur Vysya Bank",
            "Kotak Mahindra Bank",
            "Oriental Bank of Commerce",
            "PMC Bank",
            "Punjab And Sind Bank" ,
            "Punjab National Bank" ,
            "Ratnakar Bank" ,
            "Saraswat Bank" ,
            "South Indian Bank" ,
            "State Bank of Bikaner and Jaipur" ,
            "State Bank of Hyderabad" ,
            "State Bank of India" ,
            "State Bank of Patiala" ,
            "Syndicate Bank" ,
            "The Mahanagar Co Op Bank" ,
            "United Bank of India" ,
            "Vijaya Bank",
            "Yes Bank"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atm);
        listView_autofare= (ListView) findViewById(R.id.listview_autofare);

        adapter=new ArrayAdapter<String>(this, R.layout.listview_for_picnicplaces, R.id.textView_picnic,data);
        listView_autofare.setAdapter(adapter);

        listView_autofare.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(atm.this);
                    b0.setTitle("Axis Bank");
                    b0.setMessage(R.string.Axis_Bank);
                    b0.show();
                }
                if(position==1)
                {
                    AlertDialog.Builder b1=new AlertDialog.Builder(atm.this);
                    b1.setTitle("Bank of Baroda");
                    b1.setMessage(R.string.Bank_Of_Baroda);
                    b1.show();
                }
                if(position==2)
                {
                    AlertDialog.Builder b2=new AlertDialog.Builder(atm.this);
                    b2.setTitle(R.string.b2);
                    b2.setMessage(R.string.Central_Bank_of_India);
                    b2.show();
                }
                if(position==3)
                {
                    AlertDialog.Builder b3=new AlertDialog.Builder(atm.this);
                    b3.setTitle(R.string.b3);
                    b3.setMessage(R.string.Central_Bank_of_India);
                    b3.show();
                }
                if(position==4)
                {
                    AlertDialog.Builder b4=new AlertDialog.Builder(atm.this);
                    b4.setTitle(R.string.b4);
                    b4.setMessage(R.string.Citi_Bank);
                    b4.show();
                }
                if(position==5)
                {
                    AlertDialog.Builder b5=new AlertDialog.Builder(atm.this);
                    b5.setTitle(R.string.b5);
                    b5.setMessage(R.string.city_union_bank);
                    b5.show();
                }
                if(position==6)
                {
                    AlertDialog.Builder b6=new AlertDialog.Builder(atm.this);
                    b6.setTitle(R.string.b6);
                    b6.setMessage(R.string.corporation_bank);
                    b6.show();
                }
                if(position==7)
                {
                    AlertDialog.Builder b7=new AlertDialog.Builder(atm.this);
                    b7.setTitle(R.string.b7);
                    b7.setMessage(R.string.development_credit_bank);
                    b7.show();
                }
                if(position==8)
                {
                    AlertDialog.Builder b8=new AlertDialog.Builder(atm.this);
                    b8.setTitle(R.string.b8);
                    b8.setMessage(R.string.federal_bank);
                    b8.show();
                }
                if(position==9)
                {
                    AlertDialog.Builder b9=new AlertDialog.Builder(atm.this);
                    b9.setTitle(R.string.b9);
                    b9.setMessage(R.string.hdfc_bank);
                    b9.show();
                }
                if(position==10)
                {
                    AlertDialog.Builder b10=new AlertDialog.Builder(atm.this);
                    b10.setTitle(R.string.b10);
                    b10.setMessage(R.string.icici_bank);
                    b10.show();
                }
                if(position==11)
                {
                    AlertDialog.Builder b11=new AlertDialog.Builder(atm.this);
                    b11.setTitle(R.string.b11);
                    b11.setMessage(R.string.idbi_bank);
                    b11.show();
                }
                if(position==12)
                {
                    AlertDialog.Builder b12=new AlertDialog.Builder(atm.this);
                    b12.setTitle(R.string.b12);
                    b12.setMessage(R.string.ijs_bank);
                    b12.show();
                }
                if(position==13)
                {
                    AlertDialog.Builder b13=new AlertDialog.Builder(atm.this);
                    b13.setTitle(R.string.b13);
                    b13.setMessage(R.string.indian_bank);
                    b13.show();
                }
                if(position==14)
                {
                    AlertDialog.Builder b14=new AlertDialog.Builder(atm.this);
                    b14.setTitle("Indian Overseas Bank");
                    b14.setMessage(R.string.indian_overseas_bank);
                    b14.show();
                }
                if(position==15)
                {
                    AlertDialog.Builder b15=new AlertDialog.Builder(atm.this);
                    b15.setTitle(R.string.b15);
                    b15.setMessage(R.string.induslnd_bank);
                    b15.show();
                }
                if(position==16)
                {
                    AlertDialog.Builder b16=new AlertDialog.Builder(atm.this);
                    b16.setTitle(R.string.b16);
                    b16.setMessage(R.string.ing_vysya_bank);
                    b16.show();
                }
                if(position==17)
                {
                    AlertDialog.Builder b17=new AlertDialog.Builder(atm.this);
                    b17.setTitle(R.string.b17);
                    b17.setMessage(R.string.jalgaon_bank);
                    b17.show();
                }
                if(position==18)
                {
                    AlertDialog.Builder b18=new AlertDialog.Builder(atm.this);
                    b18.setTitle(R.string.b18);
                    b18.setMessage(R.string.jammu_and_kashmir_bank);
                    b18.show();
                }
                if(position==19)
                {
                    AlertDialog.Builder b19=new AlertDialog.Builder(atm.this);
                    b19.setTitle(R.string.b19);
                    b19.setMessage(R.string.karur_vysya_bank);
                    b19.show();
                }
                if(position==20)
                {
                    AlertDialog.Builder b20=new AlertDialog.Builder(atm.this);
                    b20.setTitle(R.string.b20);
                    b20.setMessage(R.string.kotak_mahindra_bank);
                    b20.show();
                }
                if(position==21)
                {
                    AlertDialog.Builder b21=new AlertDialog.Builder(atm.this);
                    b21.setTitle(R.string.b21);
                    b21.setMessage(R.string.oriental_bank_of_commerce);
                    b21.show();
                }
                if(position==22)
                {
                    AlertDialog.Builder b22=new AlertDialog.Builder(atm.this);
                    b22.setTitle(R.string.b22);
                    b22.setMessage(R.string.pmc);
                    b22.show();
                }
                if(position==23)
                {
                    AlertDialog.Builder b23=new AlertDialog.Builder(atm.this);
                    b23.setTitle(R.string.b23);
                    b23.setMessage(R.string.punjab_and_sindh_bank);
                    b23.show();
                }
                if(position==24)
                {
                    AlertDialog.Builder b24=new AlertDialog.Builder(atm.this);
                    b24.setTitle(R.string.b24);
                    b24.setMessage(R.string.punjab_national_bank);
                    b24.show();
                }
                if(position==25)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(atm.this);
                    b0.setTitle(R.string.b25);
                    b0.setMessage(R.string.ratnakar_bank);
                    b0.show();
                }
                if(position==26)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(atm.this);
                    b0.setTitle(R.string.b26);
                    b0.setMessage(R.string.saraswat_bank);
                    b0.show();
                }
                if(position==27)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(atm.this);
                    b0.setTitle(R.string.b27);
                    b0.setMessage(R.string.south_india_bank);
                    b0.show();
                }
                if(position==28)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(atm.this);
                    b0.setTitle(R.string.b28);
                    b0.setMessage(R.string.state_bank_of_bikaner_jaipur);
                    b0.show();
                }
                if(position==29)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(atm.this);
                    b0.setTitle(R.string.b29);
                    b0.setMessage(R.string.state_bank_of_hderabad);
                    b0.show();
                }
                if(position==30)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(atm.this);
                    b0.setTitle(R.string.b30);
                    b0.setMessage(R.string.state_bank_of_india);
                    b0.show();
                }
                if(position==31)
                {
                    AlertDialog.Builder b31=new AlertDialog.Builder(atm.this);
                    b31.setTitle(R.string.b31);
                    b31.setMessage(R.string.state_bank_of_patiala);
                    b31.show();
                }
                if(position==32)
                {
                    AlertDialog.Builder b32=new AlertDialog.Builder(atm.this);
                    b32.setTitle(R.string.b32);
                    b32.setMessage(R.string.syndicate_bank);
                    b32.show();
                }
                if(position==33)
                {
                    AlertDialog.Builder b33=new AlertDialog.Builder(atm.this);
                    b33.setTitle(R.string.b33);
                    b33.setMessage(R.string.mahanagar_co_op_bank);
                    b33.show();
                }
                if(position==34)
                {
                    AlertDialog.Builder b34=new AlertDialog.Builder(atm.this);
                    b34.setTitle(R.string.b34);
                    b34.setMessage(R.string.united_bank_of_india);
                    b34.show();
                }
                if(position==35)
                {
                    AlertDialog.Builder b35=new AlertDialog.Builder(atm.this);
                    b35.setTitle(R.string.b35);
                    b35.setMessage(R.string.vijaya_bank);
                    b35.show();
                }
                if(position==36)
                {
                    AlertDialog.Builder b36=new AlertDialog.Builder(atm.this);
                    b36.setTitle(R.string.b36);
                    b36.setMessage(R.string.yes_bank);
                    b36.show();
                }
            }
        });
    }
}
