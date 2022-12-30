package com.example.se_firebase;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class cutoff_analysis extends AppCompatActivity {
    WebView mycutoffwebView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cutoff_analysis);


        mycutoffwebView=findViewById(R.id.my_cutoffwebView);
        ProgressDialog progressDialog=ProgressDialog.show(cutoff_analysis.this,"Loading..","Please wait",true);
        progressDialog.setCancelable(false);

        mycutoffwebView.getSettings().setJavaScriptEnabled(true);
        mycutoffwebView.getSettings().setLoadWithOverviewMode(true);
        mycutoffwebView.getSettings().setUseWideViewPort(true);
        mycutoffwebView.setWebViewClient(new WebViewClient()
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
        mycutoffwebView.loadUrl("https://josaa.admissions.nic.in/applicant/seatmatrix/OpeningClosingRankArchieve.aspx");

    }
}