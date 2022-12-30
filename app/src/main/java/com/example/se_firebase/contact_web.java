package com.example.se_firebase;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class contact_web extends AppCompatActivity {
    WebView mycontactwebView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_web);





        mycontactwebView=findViewById(R.id.my_contactwebView);
        ProgressDialog progressDialog=ProgressDialog.show(contact_web.this,"Loading..","Please wait",true);
        progressDialog.setCancelable(false);

        mycontactwebView.getSettings().setJavaScriptEnabled(true);
        mycontactwebView.getSettings().setLoadWithOverviewMode(true);
        mycontactwebView.getSettings().setUseWideViewPort(true);
        mycontactwebView.setWebViewClient(new WebViewClient()
        {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                progressDialog.show();
                view.loadUrl(url);
                return  true;

            }
            @Override
            public void onPageFinished(WebView view,String url)
            {
                progressDialog.dismiss();
            }
        });


        //https://admission.bitmesra.ac.in/NewRegistration.aspx
        mycontactwebView.loadUrl("https://erp.bitmesra.ac.in/iitmsv4eGq0RuNHb0G5WbhLmTKLmTO7YBcJ4RHuXxCNPvuIw=");


    }
}