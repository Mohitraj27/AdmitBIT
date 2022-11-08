package com.example.se_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class contact_us extends AppCompatActivity {
private Button Gmail_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
    }


    public void email_1_intent(View view) {
        Intent browser_intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bitmesra.ac.in/Show_Content_Section?cid=4&pid=272"));
        startActivity(browser_intent);
    }

    public void Email_bit_intent(View view) {
        Intent browser_intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bitmesra.ac.in/Show_Content_Section?cid=4&pid=272"));
        startActivity(browser_intent);
    }
}