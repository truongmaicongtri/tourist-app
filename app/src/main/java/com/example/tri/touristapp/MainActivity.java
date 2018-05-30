package com.example.tri.touristapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerViewAdapter;

    private List<String> touristSites = Arrays.asList("State","City Hall","Art Museum","Central Park","Tower"
            ,"State","City, Hall","Art Museum","Central Park","Tower","State","City Hall","Art Museum",
            "Central Park","Tower","State","City Hall","Art Museum","Central Park","Tower","State","City, Hall","Art Museum"
            ,"State","City Hall","Art Museum","Central Park","Tower","State","City, Hall","Art Museum");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerViewAdapter = new TouristRecyclerAdapter(touristSites);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
