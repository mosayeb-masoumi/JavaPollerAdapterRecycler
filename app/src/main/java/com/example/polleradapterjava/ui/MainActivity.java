package com.example.polleradapterjava.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.polleradapterjava.R;
import com.example.polleradapterjava.controllers.adapters.Adapter;
import com.example.polleradapterjava.models.Model;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Adapter adapter;
    RecyclerView recyclerView;
    ArrayList<Model> users = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        adapter = new Adapter(users,getApplicationContext());
        recyclerView.setAdapter(adapter);

        sendData();


    }

    private void sendData() {
        users.add(new Model("hassan", "hassani"));
        users.add(new Model("reza", "rezai"));
        users.add(new Model("hassan", "hassani"));
        users.add(new Model("nima", "ali"));
        users.add(new Model("hassan", "hassani"));
        users.add(new Model("reza", "rezai"));
        users.add(new Model("hassan", "hassani"));
        users.add(new Model("nima", "ali"));
    }
}
