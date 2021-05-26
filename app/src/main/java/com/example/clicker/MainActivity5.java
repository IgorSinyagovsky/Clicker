package com.example.clicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    Button laptop2, laplow2, laplap2;
    static public TextView bomgx3;

    @Override
    protected void onCreate(Bundle savedInstanseState) {
        super.onCreate(savedInstanseState);
        setContentView(R.layout.activity_main2);
        bomgx3 = (TextView) findViewById(R.id.bomgx3);
        laptop2 = (Button)findViewById(R.id.laptop2);
        laptop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MainActivity.countmoney < 100){
                    bomgx3.setText("НЕ ХВАТАЕТ МОНЕТ!");
                    break;}
                if (MainActivity.countmoney >= 100) {
                    MainActivity.money += 10;
                    MainActivity.countmoney -= 100;
                    MainActivity.textmoney.setText(MainActivity.countmoney + "");

                }
            }
        });
        laplow2 = (Button)findViewById(R.id.laplow2);
        laplow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MainActivity.countmoney < 10000){
                    bomgx3.setText("НЕ ХВАТАЕТ МОНЕТ!");
                    break;}
                if (MainActivity.countmoney >= 10000) {
                    MainActivity.money += 100;
                    MainActivity.countmoney -= 10000;
                    MainActivity.textmoney.setText(MainActivity.countmoney + "");
                }
            }
        });

        laplap2 = (Button)findViewById(R.id.pers2);
        laplap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MainActivity.countmoney < 10000000){
                    bomgx3.setText("НЕ ХВАТАЕТ МОНЕТ!");
                    break;}
                if (MainActivity.countmoney >= 10000000) {
                    MainActivity.money += 100000;
                    MainActivity.countmoney -= 10000000;
                    MainActivity.textmoney.setText(MainActivity.countmoney + "");
                }
            }
        });



    }
}