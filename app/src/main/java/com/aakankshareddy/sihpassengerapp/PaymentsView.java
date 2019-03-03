package com.aakankshareddy.sihpassengerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.FractionRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PaymentsView extends AppCompatActivity {
    private Button PayTM, Freecharge, Mobi, Credit, Sodexo, Net, Cash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments_view);
        PayTM = (Button) findViewById(R.id.paytm);
        Mobi = (Button) findViewById(R.id.mobi);
        Freecharge = (Button) findViewById(R.id.freecharge);
        Credit = (Button) findViewById(R.id.credit);
        Sodexo = (Button) findViewById(R.id.sodexo);
        Net = (Button) findViewById(R.id.netbanking);
        Cash = (Button) findViewById(R.id.cash);

       /* Mobi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(
                        PaymentsView.this,
                        PaymentSuccessful.class);
                startActivity(i);
            }

        });
        Freecharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(
                        PaymentsView.this,
                        PaymentSuccessful.class);
                startActivity(i);
            }

        });
        Net.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(
                        PaymentsView.this,
                        PaymentSuccessful.class);
                startActivity(i);
            }

        });
        Cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(
                        PaymentsView.this,
                        PaymentSuccessful.class);
                startActivity(i);
            }

        });
        Credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(
                        PaymentsView.this,
                        PaymentSuccessful.class);
                startActivity(i);
            }

        });
        Sodexo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(
                        PaymentsView.this,
                        PaymentSuccessful.class);
                startActivity(i);
            }

        });
        PayTM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(
                        PaymentsView.this,
                        PaymentSuccessful.class);
                startActivity(i);
            }

        });
*/
    }
}
