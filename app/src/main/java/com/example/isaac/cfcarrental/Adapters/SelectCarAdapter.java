package com.example.isaac.cfcarrental.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class SelectCarAdapter extends RecyclerView.Adapter<SelectCarAdapter.SelectCarViewHolder> {


    @NonNull
    @Override
    public SelectCarViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull SelectCarViewHolder selectCarViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class SelectCarViewHolder extends RecyclerView.ViewHolder{
        public SelectCarViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
