package com.example.se_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class fill_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_form);

    }
    public void Fill_form(View view) {
        Intent browser_intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/BzKuzZu4NfyeNJFt8"));
        startActivity(browser_intent);
    }
}