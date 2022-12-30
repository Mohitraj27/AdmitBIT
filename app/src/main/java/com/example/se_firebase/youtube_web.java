package com.example.se_firebase;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class youtube_web extends AppCompatActivity {
    WebView myyoutubewebView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_web);


        myyoutubewebView=findViewById(R.id.my_youtubewebView);
        ProgressDialog progressDialog=ProgressDialog.show(youtube_web.this,"Loading..","Please wait",true);
        progressDialog.setCancelable(false);

        myyoutubewebView.getSettings().setJavaScriptEnabled(true);
        myyoutubewebView.getSettings().setLoadWithOverviewMode(true);
        myyoutubewebView.getSettings().setUseWideViewPort(true);
        myyoutubewebView.setWebViewClient(new WebViewClient()
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
        myyoutubewebView.loadUrl("https://www.youtube.com/channel/UClKOCa97mxvflz2Jdpg59HQ");

    }
}