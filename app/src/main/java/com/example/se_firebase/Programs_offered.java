package com.example.se_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Programs_offered extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs_offered);
    }
    public void CSE_Download(View view) {
        Intent browser_intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bitmesra.ac.in/Show_Department_Section?cid=4&deptid=107"));
        startActivity(browser_intent);
    }

    public void ECE_download(View view) {
        Intent browser_intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://bitmesra.ac.in/Show_Department_Section?cid=1&deptid=72"));
        startActivity(browser_intent);
    }

    public void EEE_download(View view) {
        Intent browser_intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bitmesra.ac.in/Show_Department_Section?cid=1&deptid=71"));
        startActivity(browser_intent);
    }

    public void MECH_brochure(View view) {
        Intent browser_intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bitmesra.ac.in/Show_Department_Section?cid=1&deptid=74"));
        startActivity(browser_intent);
    }

    public void BBA_download(View view) {
        Intent browser_intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bitmesra.ac.in/UploadedDocuments/deanugpg/files/BBA%20Course%20Structure%2011%20July.pdf"));
        startActivity(browser_intent);
    }
}