package com.example.se_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Allotment_list extends AppCompatActivity {
Button BitDeoghar;
    Button BitPatna;
    Button BitJaipur;
    Button BITMesra;



@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allotment_list);



        BitDeoghar=findViewById(R.id.bit_deoghar_campus);
        BitDeoghar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Allotment_list.this,Allotment_list_campus.class);
                startActivity(intent);
            }
        });


    BitPatna=findViewById(R.id.bit_patna_campus);
    BitPatna.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(Allotment_list.this,Allotment_list_campus.class);
            startActivity(intent);
        }
    });

    BitJaipur=findViewById(R.id.bit_jaipur_campus);
    BitJaipur.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(Allotment_list.this,Allotment_list_campus.class);
            startActivity(intent);
        }
    });


    BITMesra=findViewById(R.id.bit_Ranchi_campus);
    BITMesra.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(Allotment_list.this,Allotment_list_campus.class);
            startActivity(intent);
        }
    });
    }




    }
