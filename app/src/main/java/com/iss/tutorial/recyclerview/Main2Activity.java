package com.iss.tutorial.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Main2Activity extends AppCompatActivity {
RecyclerView recyclerView2;
RecyclerView.Adapter adapter2;
RecyclerView.LayoutManager layoutManager;
String [] lname={"Kuhikar","parate","gkhfkhfkh","hvfhvkh"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView2=(RecyclerView)findViewById(R.id.recyclerView2);
        adapter2=new RecyclerAdapter2(lname);
        layoutManager=new LinearLayoutManager(this);
        recyclerView2.setLayoutManager(layoutManager);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setAdapter(adapter2);

    }
}
