package com.example.se_firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Counselliing_form extends AppCompatActivity {


    private Object v;
    private EditText FullName,EmailId,Marks,first_choice,second_choice,third_choice,fourth_choice,fifth_choice;
    private EditText editTextDoA;
    private Button Submit_choice;
  // private Spinner Course;

    private String gender="Unknown";
    private RadioGroup radioGroup;
    private RadioButton radioButton;


    private FirebaseDatabase db=FirebaseDatabase.getInstance();
    private DatabaseReference root=db.getReference().child("Choice Filling Details");



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counselliing_form);







        //Firebase storing user data
        FullName=findViewById(R.id.edit_text_full_name);
        EmailId=findViewById(R.id.email_id);
        Marks=findViewById(R.id.enter_your_marks);

        first_choice=findViewById(R.id.first_choice_branch);
        second_choice=findViewById(R.id.second_choice_branch);
        third_choice=findViewById(R.id.Third_choice_of_branch);
        fourth_choice=findViewById(R.id.fourth_choice_branch);
        fifth_choice=findViewById(R.id.fifth_choice_branch);

        editTextDoA=findViewById(R.id.datatime);
        final Calendar calendar= Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);
        editTextDoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog dialog=new DatePickerDialog(Counselliing_form.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                        month=month+1;
                        String date= dayOfMonth+"/"+month+"/"+year;
                        editTextDoA.setText(date);
                    }
                },year, month,day);
                dialog.show();
            }
        });
        radioGroup=(RadioGroup)findViewById(R.id.radio_button);
        RadioButton genderBtn=(RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());





        Submit_choice=findViewById(R.id.submit_choice_filling);
        Submit_choice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String name=FullName.getText().toString();
                String email=EmailId.getText().toString();
                String marks=Marks.getText().toString();
                String firstchoice=first_choice.getText().toString();
                String secondchoice=second_choice.getText().toString();
                String thirdchoice=third_choice.getText().toString();
                String fourthchoice=fourth_choice.getText().toString();
                String fifthchoice=fifth_choice.getText().toString();
               // String Adress=Address.getText().toString();

                String DoA=editTextDoA.getText().toString().trim();




                int ID=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(ID);
                gender=radioButton.getText().toString();



                HashMap<String, String> userMap=new HashMap<>();
                userMap.put("Full Name of Candidate ", name);
                userMap.put("Email id of Candidate", email);
                userMap.put("Marks of the Candidate", marks);
                userMap.put("First Choice of Branch", firstchoice);
                userMap.put("Second Choice of Branch", secondchoice);

                userMap.put("Third Choice of Branch", thirdchoice);

                userMap.put("Fourth Choice of Branch", fourthchoice);

                userMap.put("Fifth Choice of Branch", fifthchoice);

                userMap.put("Date Of Birth", DoA);
                userMap.put("Gender",gender);




                root.push().setValue(userMap)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                Toast.makeText(Counselliing_form.this,"Your Choice Filling has been Submitted Successfully!!",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Counselliing_form.this,"Error -"+e.getMessage(),Toast.LENGTH_SHORT).show();
                            }
                        });




            }
        });


    }





}