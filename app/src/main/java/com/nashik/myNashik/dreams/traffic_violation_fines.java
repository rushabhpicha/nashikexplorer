package com.nashik.myNashik.dreams;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class traffic_violation_fines extends AppCompatActivity {

    ListView listView;
    String name[]={"Driving without a valid driving license","Age Limit-Under the age of 16 years driving motor vehicle",
    "Driving two-wheeler without registration and without driving license","Using vehicle without registration,other than " +
            "two-wheeler.","Not carrying document insurance,registration,fitness certificate-For Transport Vehicles",
    "Using vehicle violating pollution norms","Not having 'L' sign on the learner's vehicle","Using vehicle without insurance",
    "Letting or permitting to drive the un-insured vehicle","Not producing driving license on demand by police officer" +
            "in uniform","Helmetless Riding","Using Mobile Phone","Without Seat Belt","No Parking/Footpath","Drunk Driving",
    "No Entry/One Way","Fancy Number Plate","Violation of Speed","Dangerous or rash driving","Carrying more than two person" +
            " on a two-wheeler(Triple Seat)"};
    String fine1[]={"Rs 500/-","Rs 500/-","Rs 1000/-","Rs 2000/-","Rs 300/-","Rs 1000/-","Rs 300/-","Rs 300/-","Rs 300/-",
    "Rs 3000/-","Rs 500/-","Rs 200/-","Rs 200/-","Rs 200/-","Rs 2000/-","Rs 200/-","Rs 1000/-","Rs 1000/-","Rs 500/-","Rs 300/-"};
    String act[]={"3{1}181","4{1}/181","4{1}/181","39/192","158/177","190/{2}","3{C}/177","146/196","146/196",
    "130/177","129/177","250{A}/177","138{2}/177","15" +
            "{RRR}/177","185","17{RRR}/177","236/177","112/183",
    "184","128/177"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic_violation_fines);
       listView= (ListView) findViewById(R.id.linlay);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(traffic_violation_fines.this);
                    b0.setTitle("Driving Without a valid license");
                    b0.setMessage("Fine     500/- \nAct       "+act[0]);
                    b0.show();
                }
                if(position==1)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(traffic_violation_fines.this);
                    b0.setTitle("Age Limit-Under the age of 16 years driving motor vehicle");
                    b0.setMessage("Fine     500/- \nAct       "+act[1]);
                    b0.show();
                }
                if(position==2)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(traffic_violation_fines.this);
                    b0.setTitle("Driving two-wheeler without registration and without driving license");
                    b0.setMessage("Fine     1000/- \nAct       "+act[2]);
                    b0.show();
                }
                if(position==3)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(traffic_violation_fines.this);
                    b0.setTitle(name[3]);
                    b0.setMessage("Fine     2000/- \nAct       "+act[3]);
                    b0.show();
                }
                if(position==4)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(traffic_violation_fines.this);
                    b0.setTitle(name[4]);
                    b0.setMessage("Fine     300/- \nAct       "+act[4]);
                    b0.show();
                }
                if(position==5)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(traffic_violation_fines.this);
                    b0.setTitle(name[5]);
                    b0.setMessage("Fine     1000/- \nAct       "+act[5]);
                    b0.show();
                }
                if(position==6)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(traffic_violation_fines.this);
                    b0.setTitle(name[6]);
                    b0.setMessage("Fine     300/- \nAct       "+act[6]);
                    b0.show();
                }
                if(position==7)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(traffic_violation_fines.this);
                    b0.setTitle(name[7]);
                    b0.setMessage("Fine     300/- \nAct       "+act[7]);
                    b0.show();
                }
                if(position==8)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(traffic_violation_fines.this);
                    b0.setTitle(name[8]);
                    b0.setMessage("Fine     300/- \nAct       "+act[8]);
                    b0.show();
                }
                if(position==9)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(traffic_violation_fines.this);
                    b0.setTitle(name[9]);
                    b0.setMessage("Fine     3000/- \nAct       "+act[9]);
                    b0.show();
                }
                if(position==10)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(traffic_violation_fines.this);
                    b0.setTitle(name[10]);
                    b0.setMessage("Fine     500/- \nAct       "+act[10]);
                    b0.show();
                }
                if(position==11)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(traffic_violation_fines.this);
                    b0.setTitle(name[11]);
                    b0.setMessage("Fine     200/- \nAct       "+act[11]);
                    b0.show();
                }
                if(position==12)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(traffic_violation_fines.this);
                    b0.setTitle(name[12]);
                    b0.setMessage("Fine     200/- \nAct       "+act[12]);
                    b0.show();
                }
                if(position==13)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(traffic_violation_fines.this);
                    b0.setTitle(name[13]);
                    b0.setMessage("Fine     200/- \nAct       "+act[13]);
                    b0.show();
                }
                if(position==14)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(traffic_violation_fines.this);
                    b0.setTitle(name[14]);
                    b0.setMessage("Fine     2000/- \nAct       "+act[14]);
                    b0.show();
                }
                if(position==15)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(traffic_violation_fines.this);
                    b0.setTitle(name[15]);
                    b0.setMessage("Fine     200/- \nAct       "+act[15]);
                    b0.show();
                }
                if(position==16)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(traffic_violation_fines.this);
                    b0.setTitle(name[16]);
                    b0.setMessage("Fine     1000/- \nAct       "+act[16]);
                    b0.show();
                }if(position==17)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(traffic_violation_fines.this);
                    b0.setTitle(name[17]);
                    b0.setMessage("Fine     1000/- \nAct       "+act[17]);
                    b0.show();
                }
                if(position==18)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(traffic_violation_fines.this);
                    b0.setTitle(name[18]);
                    b0.setMessage("Fine     500/- \nAct       "+act[18]);
                    b0.show();
                }
                if(position==19)
                {
                    AlertDialog.Builder b0=new AlertDialog.Builder(traffic_violation_fines.this);
                    b0.setTitle(name[19]);
                    b0.setMessage("Fine     300/- \nAct       "+act[19]);
                    b0.show();
                }
            }
        });
    }
    class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return name.length;
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
            view = getLayoutInflater().inflate(R.layout.layout_trafficfines, null);
            final TextView textView = (TextView) view.findViewById(R.id.textView_picnic);
            TextView fine = (TextView) view.findViewById(R.id.fine);
            TextView act = (TextView) view.findViewById(R.id.act);
//            ImageView emergency_share = (ImageView) view.findViewById(R.id.emergency_share);
//            ImageView calling1= (ImageView) view.findViewById(R.id.calling);
//            emergency_share.setImageResource(share[position]);
//            calling1.setImageResource(calling[position]);

            Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/Crimson-Roman.ttf");
            textView.setTypeface(typeface1);
            textView.setText(name[position]);
            return view;
        }
    }

}
