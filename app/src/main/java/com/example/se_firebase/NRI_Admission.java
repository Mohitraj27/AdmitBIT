package com.example.se_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class NRI_Admission<adapter> extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nri_admission);

//spinner select your country
        String[] arraySpinner = new String[] {
                "USA", "Canada", "France", "China", "Australia", "Bhutan", "Nepal","Brazil","Germany","United Kingdom"
        };
        //select your course
        String[] arraySpinner1 = new String[] {
                "Bachelor of Technology", "BBA", "BCA", "Master of Technology", "MCA", "Integrated Msc", "PhD","MBA","CSE in AI/ML "
        };
        //select your campus
        String[] arraySpinner2 = new String[] {
                "BIT Deoghar", "BIT Patna", "BIT Mesra,RANCHI", "BIT Jaipur", "BIT Noida", "BIT Allahabad", "BIT Kolkata"
        };

        Spinner s = (Spinner) findViewById(R.id.Spinner01);
        Spinner s1 = (Spinner) findViewById(R.id.Spinner02);
        Spinner s2 = (Spinner) findViewById(R.id.Spinner03);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner1);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner2);
         adapter1.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        s.setAdapter(adapter);
        s1.setAdapter(adapter1);
        s2.setAdapter(adapter2);
//Spinner select your course

   //

}}

