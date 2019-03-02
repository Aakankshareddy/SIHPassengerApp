package com.aakankshareddy.sihpassengerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import cdflynn.android.library.checkview.CheckView;

public class PaymentSuccessful extends AppCompatActivity {
    private CheckView mCheckView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_successful);
        mCheckView = (CheckView) findViewById(R.id.check);
        mCheckView.check();



    }
}