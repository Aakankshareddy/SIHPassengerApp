package com.aakankshareddy.sihpassengerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Paths extends AppCompatActivity {
    private LinearLayout linearLayout;
    private TextView departTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paths);
        linearLayout = findViewById(R.id.paths_ll);
        departTV = findViewById(R.id.depart_time);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(
                        Paths.this,
                        PathDetail.class);
                startActivity(i);
            }

        });
    }

    public void onClickBtn(View view) {
        linearLayout.setVisibility(View.VISIBLE);
        departTV.setVisibility(View.VISIBLE);
    }
}
