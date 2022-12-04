package com.example.se_firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class Seat_upgradation extends AppCompatActivity {

    private Object v;
    private EditText FullName,EnrollmentNo;

    private Button Submit_request;

    private FirebaseDatabase db=FirebaseDatabase.getInstance();
    private DatabaseReference root=db.getReference().child("Seat Upgradation");

    private String seat_upgrade="Unknown";
    private RadioGroup radioGroup1;
    private RadioButton radioButton1;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_upgradation);





        FullName=findViewById(R.id.edit_text_first_name);
        EnrollmentNo=findViewById(R.id.edit_enroll_code);

        radioGroup1=(RadioGroup)findViewById(R.id.seat_upgrade);
        RadioButton genderBtn=(RadioButton) findViewById(radioGroup1.getCheckedRadioButtonId());



        Submit_request=findViewById(R.id.Submit_request_btn);
        Submit_request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String name=FullName.getText().toString();
                String enroll=EnrollmentNo.getText().toString();



                int ID=radioGroup1.getCheckedRadioButtonId();
                radioButton1=findViewById(ID);
                seat_upgrade=radioButton1.getText().toString();





                HashMap<String, String> userMap=new HashMap<>();
                userMap.put("Full Name of Candidate ", name);
                userMap.put("Enrollment Number of the Candidate", enroll);
                userMap.put("Seat Upgrade Request to",seat_upgrade);



                root.push().setValue(userMap)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                Toast.makeText(Seat_upgradation.this,"We have received your seat Upgradation Request!!",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Seat_upgradation.this,"Error -"+e.getMessage(),Toast.LENGTH_SHORT).show();
                            }
                        });


            }
       });

    }
}