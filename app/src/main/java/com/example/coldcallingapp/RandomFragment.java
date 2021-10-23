package com.example.coldcallingapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RandomFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Student[] students = ((GlobalClass) getActivity().getApplication()).getStudents();
        View v = inflater.inflate(R.layout.fragment_random, container, false);
        ImageView image = v.findViewById(R.id.student_image);
        TextView student_name = v.findViewById(R.id.text_student_name);
        Context context = image.getContext();
        Button randomButton = v.findViewById(R.id.random_button);
        randomButton.setOnClickListener(view -> {
            Student temp = students[(int)(Math.random()*students.length)];
            while (temp.getTimesCalled() == 2 && System.currentTimeMillis() - temp.getLastCalled() < 2400000)
                temp = students[(int)(Math.random()*students.length)];
            Glide.with(context).load(context.getResources().getIdentifier(temp.getFileName(),"drawable",context.getPackageName())).into(image);
            student_name.setText(temp.toString());
            if (temp.getTimesCalled() == 1) temp.setTimesCalled(2);
            else {
                temp.setTimesCalled(1);
                temp.setLastCalled(System.currentTimeMillis());
            }
            ((GlobalClass) getActivity().getApplication()).getUncalled().remove(temp);
            Date now = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("K:mm");
            temp.setTotalCalled(temp.getTotalCalled() + 1);
            ((GlobalClass) getActivity().getApplication()).getCalled().add(0,(sdf.format(now) + " - " + temp + " - Times Called: " + temp.getTotalCalled()));
        });

        return v;
    }
}
