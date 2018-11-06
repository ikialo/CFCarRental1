package com.example.isaac.cfcarrental.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.isaac.cfcarrental.R;

import java.util.List;

public class SelectCarAdapter extends RecyclerView.Adapter<SelectCarAdapter.SelectCarViewHolder> {


    private Context mContext;
    private List<SelectCarHolder> mList;

    public SelectCarAdapter(Context mContext, List<SelectCarHolder> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @NonNull
    @Override
    public SelectCarViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.select_car_holder, viewGroup, false);
        return new SelectCarViewHolder(v);
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
