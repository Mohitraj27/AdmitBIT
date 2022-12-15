package com.example.se_firebase;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
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

public class fill_form extends AppCompatActivity {



    private Object v;
    private EditText FullName,Email_id,entrance_marks,contact_no,address;

    private Button Confirm_submit;//Procced_to_pay;


    private FirebaseDatabase db=FirebaseDatabase.getInstance();
    private DatabaseReference root=db.getReference().child("Application Form");

    private String radio_button_course="Unknown";
    private RadioGroup radioGroup12;
    private RadioButton radioButton12;


    private String radio_button_ge="Unknown";
    private RadioGroup radioGroup1;
    private RadioButton radioButton1;

    TextView Submit_doc;


    @SuppressLint("MissingInflatedId")


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_form);




        Submit_doc=(TextView) findViewById(R.id.submit_doc);
        Submit_doc.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        Intent intent=new Intent(fill_form.this,Document_verfication.class);
        startActivity(intent);
         }});






        FullName=findViewById(R.id.edit_text_full_name);
        Email_id=findViewById(R.id.email_id);
        entrance_marks=findViewById(R.id.enter_entrance_marks);
        contact_no=findViewById(R.id.input_phone_no);
        address=findViewById(R.id.Adreess);

        radioGroup12=(RadioGroup)findViewById(R.id.radio_button_course);
        RadioButton course_button=(RadioButton) findViewById(radioGroup12.getCheckedRadioButtonId());



        radioGroup1=(RadioGroup)findViewById(R.id.radio_button_gender);
        RadioButton genderBtn=(RadioButton) findViewById(radioGroup1.getCheckedRadioButtonId());





        Confirm_submit=findViewById(R.id.fil_form);
        Confirm_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String name=FullName.getText().toString();
                String email_id=Email_id.getText().toString();
                String Address=address.getText().toString();
                String entrance=entrance_marks.getText().toString();
                String Contact=contact_no.getText().toString();

//for Course Selection

                int ID1=radioGroup12.getCheckedRadioButtonId();
                radioButton12=findViewById(ID1);
                radio_button_course=radioButton12.getText().toString();


//for Gender
                int ID=radioGroup1.getCheckedRadioButtonId();
                radioButton1=findViewById(ID);
                radio_button_ge=radioButton1.getText().toString();





                HashMap<String, String> userMap=new HashMap<>();
                userMap.put("name ", name);
                userMap.put("Email Id", email_id);
                userMap.put("Gender ",radio_button_ge);
                userMap.put("Entrance Score",entrance);
                userMap.put("Residential Address", Address);
                userMap.put("Contact",Contact);
                userMap.put("Course Selected",radio_button_course);


                root.push().setValue(userMap)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
//                                Toast.makeText(fill_form.this,"Your application has been submitted successfully!!, Don't forget to Pay the the Application Fee ",Toast.LENGTH_SHORT).show();
//
                                // setup the alert builder
                                AlertDialog.Builder builder = new AlertDialog.Builder(fill_form.this);
                                builder.setTitle("Submission Successfull");
                                builder.setMessage("Your application has been submitted successfully!!.");
                                // add a button
                                builder.setPositiveButton("Pay Application Fee",
                                        new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Intent intent=new Intent(fill_form.this,Fee_payment.class);
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
                                Toast.makeText(fill_form.this,"Error -"+e.getMessage(),Toast.LENGTH_SHORT).show();
                            }
                        });


            }
        });
    }

}