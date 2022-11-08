package com.example.se_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class admission_withdrawal extends AppCompatActivity {
Button Semesterintent;
Button ECEintent;
Button EEEintent;
Button MechIntent;
Button BBAintent;
Button BCAIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission_withdrawal);


        Semesterintent=findViewById(R.id.semester_intent);
        Semesterintent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(admission_withdrawal.this,Semester_intent.class);
                startActivity(intent);
            }
        });

//ece intent
        ECEintent=findViewById(R.id.ece_intent);
        ECEintent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(admission_withdrawal.this,Semester_intent.class);
                startActivity(intent);
            }
        });

        //EEE intent
        EEEintent=findViewById(R.id.eee_intent);
        EEEintent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(admission_withdrawal.this,Semester_intent.class);
                startActivity(intent);
            }
        });


        //mech intent
        MechIntent=findViewById(R.id.Mech_intent);
        MechIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(admission_withdrawal.this,Semester_intent.class);
                startActivity(intent);
            }
        });

    //BBA intent
        BBAintent=findViewById(R.id.BBA_intent);
        BBAintent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(admission_withdrawal.this,Semester_intent.class);
                startActivity(intent);
            }
        });

        //BCA intent
        BCAIntent=findViewById(R.id.BCA_intent);
        BCAIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(admission_withdrawal.this,Semester_intent.class);
                startActivity(intent);
            }
        });
    }


}