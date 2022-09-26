package com.example.m3dz3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        ArrayList names = new ArrayList();
        names.add("mersedes");
        names.add("BMW");
        names.add("AUDI");
        names.add("vaz");
        names.add("gaz");
        names.add("tesla");
        names.add("volvo");
        names.add("devo");
        names.add("porshe");
        names.add("Jaguar");
        names.add("honda");
        names.add("Mitsubishi");
        CarAdapter adapter = new CarAdapter(names);
        recyclerView.setAdapter(adapter);
    }
}