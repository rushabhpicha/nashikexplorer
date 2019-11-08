package com.nashik.myNashik.Express;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nashik.myNashik.dreams.R;

import java.util.ArrayList;

class ExpressAdapter extends RecyclerView.Adapter<ExpressAdapter.MyViewHolder>{

    ArrayList<Express> express_arraylist;
    Context context;

    public ExpressAdapter(Context context,ArrayList<Express> express_arraylist) {
        this.express_arraylist = express_arraylist;
        this.context = context;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView heading,subheading;
        public MyViewHolder(View itemView) {
            super(itemView);

            heading= (TextView) itemView.findViewById(R.id.heading);
            subheading= (TextView) itemView.findViewById(R.id.subheading);
        }
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_of_express_main, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        Express express=express_arraylist.get(position);
        holder.heading.setText(express.getTitle());
        holder.subheading.setText(express.getDesc());

        holder.heading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((Express) ExpressAdapter.this.express_arraylist.get(position)).getType().equals("i")) {
                    Intent i=new Intent(context,Express_Station_List.class);
                    i.putExtra("destination","Nashik Road");
                    i.putExtra("type","i");
                    context.startActivity(i);
                }
                else if(((Express) ExpressAdapter.this.express_arraylist.get(position)).getType().equals("a")){
                    Intent i=new Intent(context,ListofExpress.class);

                    i.putExtra("source", "All");
                    i.putExtra("destination","Trains");
                    i.putExtra("type", "a");
                    context.startActivity(i);
                }
                else if(((Express) ExpressAdapter.this.express_arraylist.get(position)).getType().equals("o"))
                {
                    Intent i=new Intent(context,Express_Station_List.class);
                    i.putExtra("source", "Nashik Road");
                    i.putExtra("type", "o");
                    context.startActivity(i);
                }
            }
        });
        holder.subheading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((Express) ExpressAdapter.this.express_arraylist.get(position)).getType().equals("i")) {
                    Intent i=new Intent(context,Express_Station_List.class);
                    i.putExtra("destination","Nasik Road");
                    i.putExtra("type","i");
                    context.startActivity(i);
                }
                else if(((Express) ExpressAdapter.this.express_arraylist.get(position)).getType().equals("a")){
                    Intent i=new Intent(context,ListofExpress.class);

                    i.putExtra("source", "All");
                    i.putExtra("destination","Trains");
                    i.putExtra("type", "a");
                    context.startActivity(i);
                }
                else if(((Express) ExpressAdapter.this.express_arraylist.get(position)).getType().equals("o"))
                {
                    Intent i=new Intent(context,Express_Station_List.class);
                    i.putExtra("source", "Nasik Road");
                    i.putExtra("type", "o");
                    context.startActivity(i);
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return express_arraylist.size();
    }
}
