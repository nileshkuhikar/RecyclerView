package com.iss.tutorial.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

class RecyclerAdapter4 extends android.support.v7.widget.RecyclerView.Adapter<RecyclerAdapter4.RecyclerViewHolder4> {
    String [] name;

    public RecyclerAdapter4(String[] name) {
        this.name = name;
    }

    @Override
    public RecyclerViewHolder4 onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_layout4,parent,false);
        RecyclerViewHolder4 recyclerViewHolder4=new RecyclerViewHolder4(view);
        return recyclerViewHolder4;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder4 holder, int position) {
holder.txName.setText(name[position]);
    }

    @Override
    public int getItemCount() {
        return  name.length;
    }
    public static  class RecyclerViewHolder4 extends RecyclerView.ViewHolder {
        TextView txName;
        public RecyclerViewHolder4(View itemView) {
            super(itemView);
            txName=(TextView) itemView.findViewById(R.id.tvName4);

        }
    }
}
