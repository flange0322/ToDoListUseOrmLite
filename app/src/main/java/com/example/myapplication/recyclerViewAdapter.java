package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class recyclerViewAdapter extends RecyclerView.Adapter {

    ArrayList<workContent> data_List;

    public recyclerViewAdapter(ArrayList<workContent> data){
        data_List = data;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item, null);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ItemHolder)holder).titleView.setText(data_List.get(position).getTitle());
        ((ItemHolder)holder).workView.setText(data_List.get(position).getWork());
    }

    @Override
    public int getItemCount() {
        return data_List.size();
    }


    public class ItemHolder extends RecyclerView.ViewHolder{
        TextView titleView;
        TextView workView;
        public ItemHolder(View itemView){
            super(itemView);
            titleView = itemView.findViewById(R.id.titleView);
            workView = itemView.findViewById(R.id.workView);
        }
    }
}
