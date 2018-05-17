package com.iss.tutorial.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Main4Activity extends AppCompatActivity {
RecyclerView recyclerView4;
RecyclerView.Adapter adapter4;
RecyclerView.LayoutManager layoutManager4;
String [] name={"9","8","7"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        recyclerView4=(RecyclerView)findViewById(R.id.recyclerView4);
        adapter4=new RecyclerAdapter4(name);
        layoutManager4= new LinearLayoutManager(this);
        recyclerView4.setLayoutManager(layoutManager4);
        recyclerView4.setHasFixedSize(true);
        recyclerView4.setAdapter(adapter4);
    }
}
