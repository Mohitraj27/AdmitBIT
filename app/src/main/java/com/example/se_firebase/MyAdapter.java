package com.example.se_firebase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    ArrayList<Model> mList;
    Context context;

public MyAdapter(Context context,ArrayList<Model> mList){
    this.mList=mList;
    this.context=context;
}

    @androidx.annotation.NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@androidx.annotation.NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
   return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@androidx.annotation.NonNull MyViewHolder holder, int position) {

    Model model =mList.get(position);
    holder.name.setText(model.getName());
    holder.Email.setText(model.getEmail());
    holder.marks.setText(model.getMarks());
    holder.Adress.setText(model.getAddress());

    }

    @Override
    public int getItemCount() {
    return mList.size();
    }

    public static  class MyViewHolder extends RecyclerView.ViewHolder{

    TextView name,Email,marks,Adress;


    public MyViewHolder(@NonNull View itemView){
    super(itemView);

    name= itemView.findViewById(R.id.edit_text_full_name);
    Email=itemView.findViewById(R.id.email_id);
    marks=itemView.findViewById(R.id.enter_nri_marks);
    Adress=itemView.findViewById(R.id.Adreess);
    }
}


}
