package com.example.se_firebase;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class Seat_acceptance extends AppCompatActivity {

    private Object v;
    private EditText FullName,EnrollmentNo;

    private Button Confirm_submit;//Procced_to_pay;


    FirebaseDatabase db=FirebaseDatabase.getInstance();
     DatabaseReference root=db.getReference().child("Seat Acceptance");

    private String seat_upgrade="Unknown";
    private RadioGroup radioGroup1;
    private RadioButton radioButton1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_acceptance);


//        Procced_to_pay=findViewById(R.id.fee_payment_now);
//        Procced_to_pay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(Seat_acceptance.this,Fee_payment.class);
//                startActivity(intent);
//            }
//        });



        FullName=findViewById(R.id.edit_text_first_name);
        EnrollmentNo=findViewById(R.id.edit_enroll_code);

        radioGroup1=(RadioGroup)findViewById(R.id.seat_upgrade);
        RadioButton genderBtn=(RadioButton) findViewById(radioGroup1.getCheckedRadioButtonId());





        Confirm_submit=findViewById(R.id.confirm_submit);
        Confirm_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String name=FullName.getText().toString();
                String enroll=EnrollmentNo.getText().toString();



                int ID=radioGroup1.getCheckedRadioButtonId();
                radioButton1=findViewById(ID);
                seat_upgrade=radioButton1.getText().toString();





                HashMap<String, String> userMap=new HashMap<>();
                userMap.put("name ", name);
                userMap.put("Enrollment_no", enroll);
                userMap.put("Seat_Accepted ",seat_upgrade);



                root.push().setValue(userMap)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                //Toast.makeText(Seat_acceptance.this,"We've received your response.Thank you for choosing BIT Mesra, Best of Luck!! ",Toast.LENGTH_SHORT).show();
                                // setup the alert builder
                                AlertDialog.Builder builder = new AlertDialog.Builder(Seat_acceptance.this);
                                builder.setTitle("Submission Successfull");
                                builder.setMessage("We've received your response.Thank you for choosing BIT Mesra, Best of Luck!!.");
                                // add a button
                                builder.setPositiveButton("Pay Application Fee",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {
                                                Intent intent=new Intent(Seat_acceptance.this,Fee_payment.class);
                                                startActivity(intent);
                                            }
                                        });
                                // create and show the alert dialog
                                AlertDialog dialog = builder.create();
                                dialog.show();



                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Seat_acceptance.this,"Error -"+e.getMessage(),Toast.LENGTH_SHORT).show();
                            }
                        });


            }
        });

    }
}