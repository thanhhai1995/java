package com.example.demoretrofit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RetofitAdapter extends RecyclerView.Adapter<RetofitAdapter.MyViewHolder> {
    ArrayList<Data> arrayList;

    public void setArrayList(ArrayList<Data> arrayList) {
        this.arrayList = arrayList;
    }

    public RetofitAdapter(ArrayList<Data> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_data,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {
        Data data =arrayList.get(position);
        Picasso.with(holder.itemView.getContext()).load(arrayList.get(position).avatar_url).into(holder.imageView);
        holder.textView.setText(String.valueOf(data.id));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        public MyViewHolder( View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tV1);
            imageView = itemView.findViewById(R.id.image);
        }
    }
}
