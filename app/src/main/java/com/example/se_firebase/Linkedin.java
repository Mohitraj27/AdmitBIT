package com.example.se_firebase;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Linkedin extends AppCompatActivity {
WebView Linkedin_webView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkedin);



        Linkedin_webView=findViewById(R.id.my_linkedinView);
        ProgressDialog progressDialog=ProgressDialog.show(Linkedin.this,"Loading..","Please wait",true);
        progressDialog.setCancelable(false);

        Linkedin_webView.getSettings().setJavaScriptEnabled(true);
        Linkedin_webView.getSettings().setLoadWithOverviewMode(true);
        Linkedin_webView.getSettings().setUseWideViewPort(true);
        Linkedin_webView.setWebViewClient(new WebViewClient()
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
        Linkedin_webView.loadUrl("https://www.linkedin.com/school/b.i.t.-mesra-ranchi/");

    }
}