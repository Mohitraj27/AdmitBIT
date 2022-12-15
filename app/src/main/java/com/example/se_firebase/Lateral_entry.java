package com.example.se_firebase;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Lateral_entry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lateral_entry);



        //Select your Category
        String[] arraySpinner3 = new String[]
                {
                        "General", "OBC", "SC", "ST"
                };

        //select your Department
        String[] arraySpinner1 = new String[] {
                "Computer Science and Engineering", "Electrical and Electronics Engineering", "Electronics and Communication Engineering", "Mechanical Engineering", "Civil Engineering", "Information Technology", "Production Engineering"
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

        adapter3.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);

        adapter1.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);

        s1.setAdapter(adapter1);
        s2.setAdapter(adapter2);
        s3.setAdapter(adapter3);
    }
}