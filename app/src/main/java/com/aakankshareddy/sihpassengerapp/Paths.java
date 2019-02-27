package com.aakankshareddy.sihpassengerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class Paths extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paths);

        String[] paths = {"path 1", "path 2", "path 3"};

        ListView pathsListView = findViewById(R.id.paths_matrix_list_view);
        ArrayAdapter<String> pathsAdapter = new ArrayAdapter<>(this, R.layout.paths_list_item, paths);
        pathsListView.setAdapter(pathsAdapter);
    }



}
