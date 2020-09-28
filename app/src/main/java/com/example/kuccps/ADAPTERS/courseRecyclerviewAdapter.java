package com.example.kuccps.ADAPTERS;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kuccps.MODEL_OBJECT.CourseFieldModel;
import com.example.kuccps.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class courseRecyclerviewAdapter extends RecyclerView.Adapter<courseRecyclerviewAdapter.MylecturerHolder> {
    Context context;
    ArrayList<CourseFieldModel>courseFieldModels;

    public courseRecyclerviewAdapter(Context context, ArrayList<CourseFieldModel> courseFieldModels) {
        this.context = context;
        this.courseFieldModels = courseFieldModels;
    }

    @NonNull
    @Override
    public MylecturerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.artcourse,parent,false);
        return new MylecturerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MylecturerHolder holder, int position) {
        holder.title.setText("COURSE TITLE :"+courseFieldModels.get(position).getTitle());
        holder.university.setText("UNIVERSITY :"+courseFieldModels.get(position).getUniversity());
        holder.description.setText("DESCRIPTION :"+courseFieldModels.get(position).getDescription());
        holder.capacity.setText("CAPACITY REMAINING :"+courseFieldModels.get(position).getCapacity());


    }

    @Override
    public int getItemCount() {
        return courseFieldModels.size();
    }

    class  MylecturerHolder extends RecyclerView.ViewHolder{
       TextView title,university,description,capacity;

       public MylecturerHolder(@NonNull View itemView) {
           super(itemView);
           title=itemView.findViewById(R.id.courseTitle);
           university=itemView.findViewById(R.id.university);
           description=itemView.findViewById(R.id.description);
           capacity=itemView.findViewById(R.id.capacity);

       }
   }
}
