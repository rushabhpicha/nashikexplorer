package com.nashik.myNashik.Express;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.nashik.myNashik.dreams.BuildConfig;
import com.nashik.myNashik.dreams.R;

import java.util.ArrayList;

class SQLiteListAdapter_express extends ArrayAdapter<Array_Express>{

    ArrayList<Array_Express> data = new ArrayList();
    int layoutResourceId;
    Context mContext;

    public  SQLiteListAdapter_express(Context context, int layoutResourceId, ArrayList<Array_Express> data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.mContext = context;
        this.data = data;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View child, ViewGroup parent) {

        final Holder holder;

        LayoutInflater layoutInflater;

        if (child == null) {
            layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            child = layoutInflater.inflate(R.layout.layout_of_list, null);

            holder = new Holder();

            holder.name = (TextView) child.findViewById(R.id.train_name);
            holder.number = (TextView) child.findViewById(R.id.train_no);
            holder.journey = (TextView) child.findViewById(R.id.journey);


            child.setTag(holder);

        } else {

            holder = (Holder) child.getTag();
        }
        final Array_Express user = (Array_Express) this.data.get(position);
        holder.name.setText(user.getname());
        holder.number.setText(user.getnumber());
        holder.journey.setText(BuildConfig.FLAVOR + user.getSource() + "-" + user.getDestination());

        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent full_schedule=new Intent(mContext,Express_schedule.class);

                full_schedule.putExtra("name",holder.name.getText().toString());
                full_schedule.putExtra("number",holder.number.getText().toString());
                full_schedule.putExtra("source",user.getSource());
                full_schedule.putExtra("destination",user.getDestination());

                mContext.startActivity(full_schedule);
            }
        });

        holder.number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent full_schedule=new Intent(mContext,Express_schedule.class);

                full_schedule.putExtra("name",holder.name.getText().toString());
                full_schedule.putExtra("number",holder.number.getText().toString());
                full_schedule.putExtra("source",user.getSource());
                full_schedule.putExtra("destination",user.getDestination());

                mContext.startActivity(full_schedule);

            }
        });

        holder.journey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent full_schedule=new Intent(mContext,Express_schedule.class);

                full_schedule.putExtra("name",holder.name.getText().toString());
                full_schedule.putExtra("number",holder.number.getText().toString());
                full_schedule.putExtra("source",user.getSource());
                full_schedule.putExtra("destination",user.getDestination());

                mContext.startActivity(full_schedule);
            }
        });

        return child;
    }
    public class Holder {
        TextView name;
        TextView number;
        TextView journey;
    }

}
