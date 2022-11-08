package com.example.se_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Semester_intent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_intent);



    }


        public void withdrawal(View view) {
            Intent browser_intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/nyziSU2TwfzbYRz37"));
            startActivity(browser_intent);
        }

}