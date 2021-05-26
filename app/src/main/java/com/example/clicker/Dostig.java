package com.example.clicker;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Dostig extends AppCompatActivity {

    Button tenk, onem, tenm, oneb;
    ImageView imageView24, imageView25, imageView26, imageView27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dostig);
        tenk = (Button)findViewById(R.id.tentis);
        onem = (Button)findViewById(R.id.onem);
        tenm = (Button)findViewById(R.id.tenm);
        oneb = (Button)findViewById(R.id.oneb);

        if(!tenk.isPressed()) tenk.setEnabled(false);

        tenk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.countmoney >= 10000) {
                    MainActivity.krist += 1;
                    MainActivity.textkrist.setText(MainActivity.krist + "");
                    tenk.setEnabled(false);

                }
            }
        });

        onem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.countmoney >= 1000000) {
                    MainActivity.krist += 2;
                    MainActivity.textkrist.setText(MainActivity.krist + "");
                }
            }
        });

        tenm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.countmoney >= 10000000) {
                    MainActivity.krist += 5;
                    MainActivity.textkrist.setText(MainActivity.krist + "");
                }
            }
        });

        oneb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.countmoney >= 1000000000) {
                    MainActivity.krist += 50;
                    MainActivity.textkrist.setText(MainActivity.krist + "");
                }
            }
        });

    }
}