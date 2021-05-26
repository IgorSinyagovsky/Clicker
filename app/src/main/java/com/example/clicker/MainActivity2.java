package com.example.clicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button laptop, laplow, laplap, sledmir, tenen, xtoo;
    static public TextView bomgx2, shopmoney;


    @Override
    protected void onCreate(Bundle savedInstanseState) {
        super.onCreate(savedInstanseState);
        setContentView(R.layout.activity_main2);
        sledmir = (Button) findViewById(R.id.sledmir);
        bomgx2 = (TextView) findViewById(R.id.bomgx2);
        shopmoney = (TextView) findViewById(R.id.shopmoney);
        laptop = (Button)findViewById(R.id.laptop);
        tenen = (Button) findViewById(R.id.tenkrist);
        xtoo = (Button) findViewById(R.id.xtoo);

        shopmoney.setText(MainActivity.countmoney + "");

        laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MainActivity.countmoney < 10){
                    bomgx2.setText("НЕ ХВАТАЕТ МОНЕТ!");
                    break;}
                if (MainActivity.countmoney >= 10) {
                    MainActivity.money += 1;
                    MainActivity.countmoney -= 10;
                    MainActivity.textmoney.setText(MainActivity.countmoney + "");
                    shopmoney.setText(MainActivity.countmoney + "");

                }
            }
        });
        laplow = (Button)findViewById(R.id.laplow);
        laplow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MainActivity.countmoney < 100){
                    bomgx2.setText("НЕ ХВАТАЕТ МОНЕТ!");
                    break;}
                if (MainActivity.countmoney >= 100) {
                    MainActivity.money += 10;
                    MainActivity.countmoney -= 100;
                    MainActivity.textmoney.setText(MainActivity.countmoney + "");
                    shopmoney.setText(MainActivity.countmoney + "");
                }
            }
        });

        laplap = (Button)findViewById(R.id.pers);
        laplap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MainActivity.countmoney < 10000){
                    bomgx2.setText("НЕ ХВАТАЕТ МОНЕТ!");
                    break;}
                if (MainActivity.countmoney >= 10000) {
                    MainActivity.money += 100;
                    MainActivity.countmoney -= 10000;
                    MainActivity.textmoney.setText(MainActivity.countmoney + "");
                    shopmoney.setText(MainActivity.countmoney + "");
                }
            }
        });

        sledmir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MainActivity.countmoney < 1000000){
                    bomgx2.setText("НЕ ХВАТАЕТ МОНЕТ!");
                    break;}
                if (MainActivity.countmoney >= 1000000){
                    Intent vintent = new Intent(MainActivity2.this, MainActivity4.class);
                    startActivity(vintent);
                }
            }
        });

        tenen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.countmoney >= 100000){
                    MainActivity.krist += 1;
                    MainActivity.countmoney *= 0;
                    MainActivity.money = 1;
                    MainActivity.textmoney.setText(MainActivity.countmoney + "");
                    shopmoney.setText(MainActivity.countmoney + "");
                    MainActivity.textkrist.setText(MainActivity.krist + "");
                }
            }
        });

        xtoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.krist >= 10){
                    MainActivity.money *= 10;
                    MainActivity.krist -= 10;
                    MainActivity.textkrist.setText(MainActivity.krist + "");
                }
            }
        });

    }

}