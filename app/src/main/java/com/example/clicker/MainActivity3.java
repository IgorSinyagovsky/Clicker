package com.example.clicker;

import android.media.MediaPlayer;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    MediaPlayer mPlayer;
    Button sbros;
    Switch yazik, mzk;
    static public TextView bomg;

    @Override
    protected void onCreate(Bundle savedInstanseState) {
        super.onCreate(savedInstanseState);
        setContentView(R.layout.activity_main3);
        bomg = (TextView) findViewById(R.id.bomg);
        sbros = (Button) findViewById(R.id.sbros);
        yazik = (Switch) findViewById(R.id.yazik);
        mzk = (Switch) findViewById(R.id.mzk);
        sbros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MainActivity.countmoney < 1000){
                    bomg.setText("НЕ ХВАТАЕТ МОНЕТ!");
                    break;}
                if (MainActivity.countmoney >= 1000) {
                    MainActivity.countmoney *= 0;
                    MainActivity.money = 1;
                    MainActivity.krist *= 0;
                    MainActivity.textmoney.setText(MainActivity.countmoney + "");
                    MainActivity.textkrist.setText(MainActivity.krist + "");
                }
                }
        });

        yazik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((Switch) v).isChecked();
                if (checked){
                      yazik.setText("Язык: Русский");
                      sbros.setText("Сброс");
                      MainActivity.click.setText("клик");
                      MainActivity.shop.setText("магазин");
                      MainActivity.shop.setTextSize(16);
                      MainActivity.nastr.setText("настройки");
                }
                else{
                    yazik.setText("Language: English");
                    sbros.setText("Reset");
                    MainActivity.click.setText("click");
                    MainActivity.shop.setText("shop");
                    MainActivity.shop.setTextSize(20);
                    MainActivity.nastr.setText("settings");
                }
            }
        });

        mPlayer= MediaPlayer.create(this, R.raw.muzlo);
        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mPlayer.stop();
            }
        });

        mzk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((Switch) v).isChecked();
                if (checked){
                    mPlayer.start();
                    mzk.setText("Music: On");
                }
                else{
                    mPlayer.pause();
                    mzk.setText("Music: Off");
                }
            }
        });

    }

}