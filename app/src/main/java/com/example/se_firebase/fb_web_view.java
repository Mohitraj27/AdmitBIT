package com.example.se_firebase;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class fb_web_view extends AppCompatActivity {

    WebView fb_webView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fb_web_view);




        fb_webView=findViewById(R.id.my_fb_web_View);
        ProgressDialog progressDialog=ProgressDialog.show(fb_web_view.this,"Loading..","Please wait",true);
        progressDialog.setCancelable(false);

        fb_webView.getSettings().setJavaScriptEnabled(true);
        fb_webView.getSettings().setLoadWithOverviewMode(true);
        fb_webView.getSettings().setUseWideViewPort(true);
        fb_webView.setWebViewClient(new WebViewClient()
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
        fb_webView.loadUrl("https://www.facebook.com/BITMesraRanchi");

    }
}