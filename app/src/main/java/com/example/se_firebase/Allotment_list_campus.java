package com.example.se_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Allotment_list_campus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allotment_list_campus);
    }

    public void CheckList(View view) {
        Intent browser_intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bitmesra.ac.in/"));
        startActivity(browser_intent);
    }
}