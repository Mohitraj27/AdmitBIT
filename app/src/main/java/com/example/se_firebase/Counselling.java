package com.example.se_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Counselling extends AppCompatActivity {


    private Button Seat_acceptance,Choice_filling,seat_upgrdation,fee_payment,getChoice_filling;
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



        Choice_filling=findViewById(R.id.submit_choice_filling);
        Choice_filling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Counselling.this,Counselliing_form.class);
                startActivity(intent);
            }
        });


        fee_payment=findViewById(R.id.fee_payment);
        fee_payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Counselling.this,Fee_payment.class);
                startActivity(intent);
            }
        });


        seat_upgrdation=findViewById(R.id.submit_upgradtaion);
        seat_upgrdation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Counselling.this,Seat_upgradation.class);
                startActivity(intent);
            }
        });


    }


}
