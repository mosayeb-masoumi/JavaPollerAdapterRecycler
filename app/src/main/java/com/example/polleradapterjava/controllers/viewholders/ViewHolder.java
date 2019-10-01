package com.example.polleradapterjava.controllers.viewholders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.polleradapterjava.models.Model;
import com.example.polleradapterjava.R;

public class ViewHolder extends RecyclerView.ViewHolder {

    TextView txtname,txtlastname;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        txtname = itemView.findViewById(R.id.row_txtname);
        txtlastname=itemView.findViewById(R.id.row_txtlastname);

    }

    public void bindData(Model data) {

        txtname.setText(data.name);
        txtlastname.setText(data.lastname);
    }

    public void setOnClickListener(Model data, int position) {

        Toast.makeText(itemView.getContext(), ""+data.name + " "+
                data.getLastname()+" " + position, Toast.LENGTH_SHORT).show();
    }
}
