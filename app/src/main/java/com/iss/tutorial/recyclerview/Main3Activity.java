package com.iss.tutorial.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Main3Activity extends AppCompatActivity {
RecyclerView recyclerView;
RecyclerView.Adapter adapter;
RecyclerView.LayoutManager layoutManager;
String [] name={"1","2","3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView3);
        adapter=new ReyclerAdapter3(name);
        layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
