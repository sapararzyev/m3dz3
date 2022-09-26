package com.example.m3dz3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarView> {
    private ArrayList<String> car;

    public CarAdapter(ArrayList<String> car) {
        this.car = car;
    }

    @NonNull
    @Override
    public CarView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarView(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false)) ;
    }

    @Override
    public void onBindViewHolder(@NonNull CarView holder, int position) {
    holder.black(car.get(position));
    }

    @Override
    public int getItemCount() {
        return car.size();
    }
}
