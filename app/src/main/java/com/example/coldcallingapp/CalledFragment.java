package com.example.coldcallingapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class CalledFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_called, container, false);
        ListView called_list = v.findViewById(R.id.listview_called);
        ArrayList<String> called = ((GlobalClass) getActivity().getApplication()).getCalled();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                getActivity().getApplicationContext(),
                R.layout.activity_listview,
                called
        );
        called_list.setAdapter(arrayAdapter);
        return v;
    }
}
