package com.example.se_firebase;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class voiceFlow_chatbit extends AppCompatActivity {
    WebView chatbot_view;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voice_flow_chatbit);



        chatbot_view=findViewById(R.id.chat_bot_view);
        ProgressDialog progressDialog=ProgressDialog.show(voiceFlow_chatbit.this,"Loading..","Please wait",true);
        progressDialog.setCancelable(false);

        chatbot_view.getSettings().setJavaScriptEnabled(true);
        chatbot_view.getSettings().setLoadWithOverviewMode(true);
        chatbot_view.getSettings().setUseWideViewPort(true);
        chatbot_view.setWebViewClient(new WebViewClient()
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
        chatbot_view.loadUrl("https://creator.voiceflow.com/prototype/63b12b1b397f9074e3683f0f");

    }
}