package com.example.polleradapterjava.controllers.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.polleradapterjava.models.Model;
import com.example.polleradapterjava.R;
import com.example.polleradapterjava.controllers.viewholders.ViewHolder;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    public List<Model> users;
    public Context context;

    public Adapter(List<Model> users, Context context) {
        this.users = users;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        final Model data = users.get(position);
        holder.bindData(data);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.setOnClickListener(data, position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
