package com.nashik.myNashik.dreams;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.nashik.myNashik.dreams.R.id.textView;
import static com.nashik.myNashik.dreams.R.id.textView2;


public class information_policestation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_policestation);
        final TextView heading= (TextView) findViewById(textView);
        final TextView contact_no= (TextView) findViewById(textView2);
        //final TextView address= (TextView) findViewById(R.id.textView4);
        TextView call= (TextView) findViewById(R.id.call);
        TextView share= (TextView) findViewById(R.id.share);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
                heading.setText(bundle.getString("heading"));
                contact_no.setText(bundle.getString("contact_no"));
                //address.setText(bundle.getString("address"));
        }
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+contact_no.getText().toString()));
                startActivity(intent);
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT,"Name :"+heading.getText()+"\nContact No: "+contact_no.getText());
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "The title");
                startActivity(Intent.createChooser(shareIntent, "Share..."));
            }
        });

    }
}
