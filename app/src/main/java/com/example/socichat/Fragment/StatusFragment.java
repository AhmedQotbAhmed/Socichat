package com.example.socichat.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socichat.Fragment.adapter.StatusAdapter;
import com.example.socichat.R;


public class StatusFragment extends Fragment {

    RecyclerView recyclerView_un;
    RecyclerView recyclerView_read;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_status, container, false);
 final StatusAdapter statusAdapter= new StatusAdapter();

        recyclerView_read=view.findViewById(R.id.recyclerView_status_read);
        recyclerView_read.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView_read.setAdapter(statusAdapter);

        recyclerView_un=view.findViewById(R.id.recyclerView_status_un);
        recyclerView_un.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView_un.setAdapter(statusAdapter);



        return view;
    }
}