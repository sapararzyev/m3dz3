package com.example.m3dz3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class CarView extends RecyclerView.ViewHolder {
 private TextView textView;


    public CarView(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tv_Animal);
    }

    public void black(String Car ){
        textView.setText(Car);
    }
}
