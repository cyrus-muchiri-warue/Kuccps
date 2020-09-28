package com.example.kuccps.UI;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kuccps.MODEL_OBJECT.CourseFieldModel;
import com.example.kuccps.R;
import com.example.kuccps.ADAPTERS.courseRecyclerviewAdapter;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ArtcourseFragment extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.artfragment,container,false);
        RecyclerView recyclerView=view.findViewById(R.id.recyclerview);
        ArrayList<CourseFieldModel> models;
        models=new ArrayList<>();
        models.add(new CourseFieldModel("bcs education","meru university","basic",23));
        models.add(new CourseFieldModel("bcs education","meru university","basic",23));
        models.add(new CourseFieldModel("bcs education","meru university","basic",23));
        models.add(new CourseFieldModel("bcs education","meru university","basic",23));
        models.add(new CourseFieldModel("bcs education","meru university","basic",23));
        models.add(new CourseFieldModel("bcs education","meru university","basic",23));
        courseRecyclerviewAdapter adapter=new courseRecyclerviewAdapter(getContext(),models);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        super.dump(prefix, fd, writer, args);
    }
}
