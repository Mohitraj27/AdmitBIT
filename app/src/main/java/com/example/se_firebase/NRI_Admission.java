package com.example.se_firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;

import java.util.HashMap;

public class NRI_Admission<adapter> extends AppCompatActivity  {


    private EditText FullName,EmailId,Marks,Address;
    private  RadioButton Gender;
    private Button Submit_nri_form,show_button;
    private Spinner Course;
    private FirebaseDatabase db=FirebaseDatabase.getInstance();
    private DatabaseReference root=db.getReference().child("NRI Candidates");

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nri_admission);

        //Firebase storing user data
        FullName=findViewById(R.id.edit_text_full_name);
        EmailId=findViewById(R.id.email_id);
        Marks=findViewById(R.id.enter_nri_marks);
         Course=findViewById(R.id.Spinner02);
        //Gender=findViewById(R.id.radio_button);
        Address=findViewById(R.id.Adreess);

        show_button=findViewById(R.id.show_nri_button2);

        Submit_nri_form=findViewById(R.id.submit_nri_button);


        Submit_nri_form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {





                String name=FullName.getText().toString();
                String email=EmailId.getText().toString();
                String marks=Marks.getText().toString();
                String Adress=Address.getText().toString();



                HashMap<String, String> userMap=new HashMap<>();
                userMap.put("Full Name of Candidate ", name);
                userMap.put("Email id of Candidate", email);
                userMap.put("Marks of the Candidate", marks);
                userMap.put("Residential Address",Adress);



             root.push().setValue(userMap)
                     .addOnCompleteListener(new OnCompleteListener<Void>() {
                 @Override
                 public void onComplete(@NonNull Task<Void> task) {
                     Toast.makeText(NRI_Admission.this,"Your Application has been Submitted Successfully!!",Toast.LENGTH_SHORT).show();
                 }
             })
              .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(NRI_Admission.this,"Error -"+e.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                });


                show_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(NRI_Admission.this,show_nri_admission_data.class));
                    }
                });

            }
        });














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

