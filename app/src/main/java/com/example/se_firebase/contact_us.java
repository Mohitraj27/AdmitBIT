package com.example.se_firebase;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class contact_us extends AppCompatActivity {
 Button email_bit_intent;
Button extra_intent;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

   email_bit_intent=findViewById(R.id.Email_bit_intent);
   email_bit_intent.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Intent intent=new Intent(contact_us.this,contact_web.class);
           startActivity(intent);
       }


   });
   extra_intent =findViewById(R.id.extra_intent);
   extra_intent.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Intent intent=new Intent(contact_us.this,contact_web.class);
           startActivity(intent);
       }
   });


    }

//https://www.bitmesra.ac.in/Show_Content_Section?cid=4&pid=272
    //https://www.bitmesra.ac.in/Show_Content_Section?cid=4&pid=272


}