package com.example.clicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    Button click2, shop2, nastr2, suda;
    static public TextView textmoney;
    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        click2 = (Button) findViewById(R.id.click);
        nastr2 = (Button) findViewById(R.id.nastr);
        shop2 = (Button) findViewById(R.id.shop);
        suda = (Button) findViewById(R.id.suda);
        textmoney = (TextView) findViewById(R.id.money);
        Click();


    }

    void Click(){
        click2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.countmoney += MainActivity.money * 10;
                textmoney.setText(MainActivity.countmoney + "");
            }
        });
        shop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rintent = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(rintent);
            }
        });

        nastr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aintent = new Intent(MainActivity4.this, MainActivity3.class);
                startActivity(aintent);
            }
        });

        suda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_suda = new Intent(MainActivity4.this, MainActivity.class);
                startActivity(intent_suda);
            }
        });

    }

}