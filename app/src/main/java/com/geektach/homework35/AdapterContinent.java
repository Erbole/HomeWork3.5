package com.geektach.homework35;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterContinent extends RecyclerView.Adapter<AdapterContinent.ViewHolder>{
    private OnClick onClick;
    ArrayList<Model> modelArrayList;

    public void setOnClick(OnClick onClick) {
        this.onClick = onClick;
    }

    public AdapterContinent(ArrayList<Model> modelArrayList, OnClick onClick) {
        this.modelArrayList = modelArrayList;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_continent, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(modelArrayList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick.click(modelArrayList.get(position));
                Log.d("Ray", "adasdas");
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nameFlags;
        private ImageView imageFlags;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameFlags = itemView.findViewById(R.id.tv_names);
            imageFlags = itemView.findViewById(R.id.image);
        }

        public void bind(Model model) {
            nameFlags.setText(model.getNames());
            imageFlags.setImageResource(model.getFlags());
        }
    }

}
