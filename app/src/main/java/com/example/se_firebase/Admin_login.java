package com.example.se_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Admin_login extends AppCompatActivity {
Button admin_login_intent;
Button admin_signup_intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);



        //admin login intent
        admin_login_intent=findViewById(R.id.btnLogin);
        admin_login_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Admin_login.this,Admin_signUp.class);
                startActivity(intent);
            }
        });

        //admin signup intent
        //admin login intent
        admin_signup_intent=findViewById(R.id.tvRegisterHere);
        admin_signup_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Admin_login.this,Admin_signUp.class);
                startActivity(intent);
            }
        });
    }
}