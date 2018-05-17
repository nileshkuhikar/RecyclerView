package com.iss.tutorial.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import static com.iss.tutorial.recyclerview.R.id.recyclerView;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private RecyclerView.Adapter adapter;
private RecyclerView.LayoutManager layoutManager;
String [] nameArray={"Nilesh","Kuhikar","gkhfkhf","hfjhfkh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        adapter=new RecyclerAdapter(nameArray);
        layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }
}
