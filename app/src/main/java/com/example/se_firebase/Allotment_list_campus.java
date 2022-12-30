package com.example.se_firebase;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

//import com.firebase.ui.database.FirebaseRecyclerOptions;

public class Allotment_list_campus extends AppCompatActivity {

ListView myListView;
List<Students> studentsList;
DatabaseReference root;
//    RecyclerView recView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allotment_list_campus);

//            recView=(RecyclerView) findViewById(R.id.recview);
//            recView.setLayoutManager(new LinearLayoutManager(this))

//        FirebaseRecyclerOptions<model> options =
//                new FirebaseRecyclerOptions.Builder<model>()
//                        .setQuery(query, model.class)
//                        .build();
//
//    }

        myListView=findViewById(R.id.mylistView);
        studentsList=new ArrayList<>();

        root= FirebaseDatabase.getInstance().getReference("Seat Acceptance");
        root.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                studentsList.clear();

                for(DataSnapshot studentDatasnap: snapshot.getChildren()){
                    Students students=studentDatasnap.getValue(Students.class);
               studentsList.add(students);
                }

                ListAdapter adapter=new ListAdapter(Allotment_list_campus.this,studentsList);
                myListView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }}