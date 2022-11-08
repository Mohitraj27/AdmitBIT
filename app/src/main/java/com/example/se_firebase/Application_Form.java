package com.example.se_firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Spinner;
import android.widget.TextView;

public class Application_Form extends AppCompatActivity {



    CalendarView calendar;
    TextView dateView;


    Button BitDeoghar;

    Button BitPatna;
    Button BitJaipur;

    Button BITMesra;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_form);






        BitDeoghar=findViewById(R.id.bit_deoghar_campus);
        BitDeoghar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Application_Form.this,fill_form.class);
                startActivity(intent);
            }
        });


        BitPatna=findViewById(R.id.bit_patna_campus);
        BitPatna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Application_Form.this,fill_form.class);
                startActivity(intent);
            }
        });

        BitJaipur=findViewById(R.id.bit_jaipur_campus);
        BitJaipur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Application_Form.this,fill_form.class);
                startActivity(intent);
            }
        });


        BITMesra=findViewById(R.id.bit_Ranchi_campus);
        BITMesra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Application_Form.this,fill_form.class);
                startActivity(intent);
            }
        });













/*
        calendar = findViewById(R.id.calender);
        dateView = findViewById(R.id.dateView);
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String Date = dayOfMonth + "-" + (month + 1) + "-" + year;
                dateView.setText(Date);
            }
        });


        //Select your Category
        String[] arraySpinner3 = new String[]
                {
                        "General", "OBC", "SC", "ST"
                };

        //select your course
        String[] arraySpinner1 = new String[] {
                "Bachelor of Technology", "BBA", "BCA", "Master of Technology", "MCA", "Integrated Msc", "PhD","MBA","CSE in AI/ML "
        };
        //select your campus
        String[] arraySpinner2 = new String[] {
                "BIT Deoghar", "BIT Patna", "BIT Mesra,RANCHI", "BIT Jaipur", "BIT Noida", "BIT Allahabad", "BIT Kolkata"
        };
        Spinner s3 = (Spinner) findViewById(R.id.Spinner01);


        Spinner s1 = (Spinner) findViewById(R.id.Spinner02);
        Spinner s2 = (Spinner) findViewById(R.id.Spinner03);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner1);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner2);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner3);
        adapter1.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        adapter3.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);

        s1.setAdapter(adapter1);
        s2.setAdapter(adapter2);
        s3.setAdapter(adapter3);
        */

    }
}