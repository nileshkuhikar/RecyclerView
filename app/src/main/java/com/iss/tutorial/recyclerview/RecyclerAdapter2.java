package com.iss.tutorial.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

class RecyclerAdapter2 extends RecyclerView.Adapter<RecyclerAdapter2.RecyclerViewHolder2> {
    String[] lname;

    public RecyclerAdapter2(String[] lname) {
    this.lname=lname;
    }

    @Override
    public RecyclerViewHolder2 onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_layout2,parent,false);
        RecyclerViewHolder2 recyclerViewHolder2=new RecyclerViewHolder2(view);
        return recyclerViewHolder2;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder2 holder, int position) {

        holder.txLname.setText(lname[position]);
    }

    @Override
    public int getItemCount() {
        return lname.length;
    }
    public static  class RecyclerViewHolder2 extends  RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txLname;
        public RecyclerViewHolder2(View itemView) {
            super(itemView);
           txLname=(TextView)itemView.findViewById(R.id.tvLname);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Clicked", Toast.LENGTH_SHORT).show();
        }
    }
}
