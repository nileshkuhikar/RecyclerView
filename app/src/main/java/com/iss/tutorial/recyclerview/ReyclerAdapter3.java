package com.iss.tutorial.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ReyclerAdapter3 extends RecyclerView.Adapter<ReyclerAdapter3.RecyclerViewHolder3> {
     private String [] name;

    public ReyclerAdapter3(String[] name) {
        this.name = name;
    }

    @Override
    public RecyclerViewHolder3 onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_layout,parent,false);
        RecyclerViewHolder3 recyclerViewHolder3=new RecyclerViewHolder3(view);
        return recyclerViewHolder3;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder3 holder, int position) {
holder.tvName.setText(name[position]);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }
    public static class RecyclerViewHolder3 extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvName;
        public RecyclerViewHolder3(View itemView) {
            super(itemView);
            tvName=(TextView)itemView.findViewById(R.id.tvName);
        }

        @Override
        public void onClick(View view) {
            tvName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(), "Clicked", Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}
