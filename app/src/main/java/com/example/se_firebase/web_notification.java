package com.example.se_firebase;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class web_notification extends AppCompatActivity {

    WebView mywebView;
    // String urltoload="https://www.bitmesra.ac.in";
//https://www.bitmesra.ac.in/Show_Admission_Page?cid=1&deptid=11&pid=27
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_notification);

   mywebView=findViewById(R.id.my_webView);
        ProgressDialog progressDialog=ProgressDialog.show(web_notification.this,"Loading..","Please wait",true);
        progressDialog.setCancelable(false);

        mywebView.getSettings().setJavaScriptEnabled(true);
        mywebView.getSettings().setLoadWithOverviewMode(true);
        mywebView.getSettings().setUseWideViewPort(true);
        mywebView.setWebViewClient(new WebViewClient()
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
                 mywebView.loadUrl("https://bitmesra.ac.in/Show_Admission_Page?cid=1&deptid=11&pid=27");



    }
}