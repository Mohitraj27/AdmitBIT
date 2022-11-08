package com.example.se_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Counselling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counselling);

        //spinner choice filling
        String[] arraySpinner = new String[] {
                "Round 1", "Round 2", "Round 3", "Round 4", "Spot Round"        };

        Spinner s = (Spinner) findViewById(R.id.Spinner01);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);

        adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        s.setAdapter(adapter);


        //seat acceptance

        //spinner choice filling
        String[] arraySpinner1 = new String[] {
                "Round 1", "Round 2", "Round 3", "Round 4", "Spot Round"        };

        Spinner s1 = (Spinner) findViewById(R.id.Spinner02);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner1);

        adapter1.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        s1.setAdapter(adapter1);


        //seat upgration
        String[] arraySpinner2 = new String[] {
                "Round 1", "Round 2", "Round 3", "Round 4", "Spot Round"        };

        Spinner s2 = (Spinner) findViewById(R.id.Spinner03);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner2);

        adapter2.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        s2.setAdapter(adapter2);


        //fee payment
        String[] arraySpinner3 = new String[] {
                "Round 1", "Round 2", "Round 3", "Round 4", "Spot Round"        };

        Spinner s3 = (Spinner) findViewById(R.id.Spinner04);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner3);

        adapter2.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        s3.setAdapter(adapter3);


    }

    //Choice Filling Counselling
    public void submit_choice_filling(View view) {

            Intent browser_intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScey-VvAmTi2ydNtAtuwB3VI9joJW9s_kISubSN8HOA4X1V9w/viewform"));
            startActivity(browser_intent);
        }

    public void seat_acceptance(View view) {
        Intent browser_intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScey-VvAmTi2ydNtAtuwB3VI9joJW9s_kISubSN8HOA4X1V9w/viewform"));
        startActivity(browser_intent);
    }

    public void submit_upgradtaion(View view) {
        Intent browser_intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScey-VvAmTi2ydNtAtuwB3VI9joJW9s_kISubSN8HOA4X1V9w/viewform"));
        startActivity(browser_intent);
    }

    public void fee_payment(View view) { Intent browser_intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScey-VvAmTi2ydNtAtuwB3VI9joJW9s_kISubSN8HOA4X1V9w/viewform"));
        startActivity(browser_intent);
    }
}
