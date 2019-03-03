package com.aakankshareddy.sihpassengerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

public class qrcode extends AppCompatActivity {
    private Button Proceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);
        Proceed = (Button) findViewById(R.id.proceedfromqr);
        Proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(
                        qrcode.this,
                        PaymentSuccessful.class);
                startActivity(i);
            }

        });
    }

}