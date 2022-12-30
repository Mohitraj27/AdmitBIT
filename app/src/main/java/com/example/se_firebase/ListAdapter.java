package com.example.se_firebase;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.List;

public class ListAdapter extends ArrayAdapter {

    private Activity mContext;
    List<Students> studentsList;
    public ListAdapter(Activity mContext, List<Students> studentsList ){
 super(mContext,R.layout.list_item,studentsList);
 this.mContext=mContext;
 this.studentsList=studentsList;
    }

    @NonNull
@Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)

    {
        LayoutInflater inflater=mContext.getLayoutInflater();
        View listItemView=inflater.inflate(R.layout.list_item,null,true);

        TextView tv_name=listItemView.findViewById(R.id.tv_name);
        TextView tvenroll_no=listItemView.findViewById(R.id.enrollment_no);
        TextView seat_accepted=listItemView.findViewById(R.id.seat_accepted);

        Students students=studentsList.get(position);

        tv_name.setText(students.getname());
        tvenroll_no.setText(students.getEnroll());
        seat_accepted.setText(students.getSeat_accepted());


        return  listItemView;
    }
}
