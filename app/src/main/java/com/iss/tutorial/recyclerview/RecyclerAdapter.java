package com.iss.tutorial.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
   private String [] name;

    public RecyclerAdapter(String[] name) {
        this.name = name;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder=new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }



    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
holder.tvName.setText(name[position]);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }
    public static class RecyclerViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener {
        TextView tvName;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
              tvName=(TextView)itemView.findViewById(R.id.tvName);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Clicked", Toast.LENGTH_SHORT).show();
        }
    }
}
