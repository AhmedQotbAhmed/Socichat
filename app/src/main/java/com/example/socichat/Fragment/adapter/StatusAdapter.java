package com.example.socichat.Fragment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.socichat.R;

public class StatusAdapter extends RecyclerView.Adapter<StatusAdapter.HolderView> {
    @NonNull
    @Override
    public HolderView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.status_item_recycler_view,parent,false);
        HolderView holderView= new HolderView(view);
        return holderView;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderView holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class HolderView extends RecyclerView.ViewHolder {

        public HolderView(@NonNull View itemView) {
            super(itemView);
        }
    }
}
