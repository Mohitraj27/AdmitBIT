package com.example.se_firebase;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class Document_verfication extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_document_verfication);



    }


    public void adhaar_card(View view) {
        Intent browser_intent=new Intent(Document_verfication.this,Upload_files.class);
        startActivity(browser_intent);
    }


    public void Birth_certficate(View view) {
        Intent browser_intent=new Intent(Document_verfication.this,Birth_certificate.class);
        startActivity(browser_intent);
    }

    public void tweleve_marksheet(View view) {
        Intent browser_intent=new Intent(Document_verfication.this,tweleve_document.class);
        startActivity(browser_intent);

    }


    public void jee_score(View view) {
        Intent browser_intent=new Intent(Document_verfication.this,JEE_Score_card.class);
        startActivity(browser_intent);
    }

    public void ten_marksheet(View view) {
        Intent browser_intent=new Intent(Document_verfication.this,Tenth_marksheet.class);
        startActivity(browser_intent);
    }

    public void SeatAcceptance(View view) {
        Intent browser_intent=new Intent(Document_verfication.this,Seat_accept.class);
        startActivity(browser_intent);
    }
}

