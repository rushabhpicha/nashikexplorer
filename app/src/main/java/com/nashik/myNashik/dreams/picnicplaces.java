package com.nashik.myNashik.dreams;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class picnicplaces extends AppCompatActivity {
    Button show_data, dikhao;
    picnic_database mydb;
    ListView list;
    String city, place_naam, near_to, distance, description;
    ArrayAdapter<String> arrayadapter;
    ArrayList<String> arraylist = new ArrayList<String>();


    WebView webview;
    ProgressBar pbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picnicplaces);

        webview = (WebView)findViewById(R.id.webView1);
        pbar = (ProgressBar)findViewById(R.id.progressBar1);
        webview.setWebViewClient(new picnicplaces.WebViewClient());
        webview.loadUrl("http://www.maharashtratourism.net/cities/nashik/around-nashik.html");
        final WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        // set javascript and zoom and some other settings
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setAppCacheEnabled(true);
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webview.getSettings().setAllowFileAccess(true);
        webview.getSettings().setAllowContentAccess(true);
        webview.setScrollbarFadingEnabled(false);
        // enable all plugins (flash)
        webSettings.setPluginState(WebSettings.PluginState.ON);
    }

    public class WebViewClient extends android.webkit.WebViewClient
    {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {

            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            // TODO Auto-generated method stub
            view.loadUrl(url);
            return true;
        }
        @Override
        public void onPageFinished(WebView view, String url) {

            // TODO Auto-generated method stub

            super.onPageFinished(view, url);
            pbar.setVisibility(View.GONE);
        }
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (webview.canGoBack()) {
                        webview.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }
}






//        mydb = new picnic_database(this);
//
//        list = (ListView) findViewById(R.id.listView);
//
//        mydb.insertData("aurangabadpicnic", "Bibi Ka Maqbara", "Aurangabad", "5 KM", "The Bibi Ka Maqbara is a tomb located in Aurangabad, Maharashtra, India. It was built by Azam Shah, son of Aurangzeb, in 1678 in memory of his mother,  Rabia-ud-Daurani. It bears a striking resemblance to the famous Taj Mahal");
//
//        final Cursor res = mydb.getAllData();
//        if (res.moveToFirst()) {
//            do {
//                city = res.getString(1);
//                place_naam = res.getString(2);
//                near_to = res.getString(3);
//                distance = res.getString(4);
//                description = res.getString(5);
//                arraylist.add(place_naam);
//            } while (res.moveToNext());//accessing data upto last row from table
//        }
//        arrayadapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1, arraylist);
//        list.setAdapter(arrayadapter);
//
//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent i = new Intent(picnicplaces.this, Description_of_picnicplaces.class);
//                i.putExtra("city", city);
//                i.putExtra("place_naam", place_naam);
//                i.putExtra("near_to", near_to);
//                i.putExtra("distance", distance);
//                i.putExtra("description", description);
//                startActivity(i);
//            }
//        });
//
////        dikhao.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                if (res.getCount() == 0) {
////                    showMessage("Error ", "No Data Found");
////                }
////                StringBuffer buffer = new StringBuffer("");
////                while (res.moveToNext()) {
////                    buffer.append("Id:- " + res.getString(0) + "\n");
////                    buffer.append("Place Name:- " + res.getString(1) + "\n");
////                    buffer.append("Place type:- " + res.getString(2) + "\n\n");
////                    buffer.append("Place type:- " + res.getString(3) + "\n\n");
////                    buffer.append("Place type:- " + res.getString(4) + "\n\n");
////                    buffer.append("Place type:- " + res.getString(5) + "\n\n");
////                }
////                showMessage("Data", buffer.toString());
////            }
////        });


//    public void showMessage(String title, String message) {
//        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
//        dialog.setCancelable(true);
//        dialog.setTitle(title);
//        dialog.setMessage(message);
//        dialog.show();
//    }

