package com.example.se_firebase;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class insta_web extends AppCompatActivity {
    WebView myinstawebView;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insta_web);



        myinstawebView=findViewById(R.id.insta_web);
        ProgressDialog progressDialog=ProgressDialog.show(insta_web.this,"Loading..","Please wait",true);
        progressDialog.setCancelable(false);

        myinstawebView.getSettings().setJavaScriptEnabled(true);
        myinstawebView.getSettings().setLoadWithOverviewMode(true);
        myinstawebView.getSettings().setUseWideViewPort(true);
        myinstawebView.setWebViewClient(new WebViewClient()
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
        myinstawebView.loadUrl("https://www.instagram.com/bit.mediacell/");

    }
}