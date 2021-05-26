package com.example.clicker;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.SurfaceControl;
import android.view.View;
import android.widget.ImageView;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.app.Service;
import android.os.IBinder;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;






public class MainActivity extends AppCompatActivity {
    static public long countmoney = 0;
    static public long money = 1;
    static public long krist = 0;
    static public Button click, shop, nastr, pluskrst;
    static public ImageButton dostigen;
    static public TextView textmoney, plus1, textkrist;
    static public ImageView shahtor;
    static public int MENU_COMBO_ID = 5;
    SharedPreferences preferences;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        click = (Button) findViewById(R.id.click);
        nastr = (Button) findViewById(R.id.nastr);
        shop = (Button) findViewById(R.id.shop);
        pluskrst = (Button) findViewById(R.id.pluskrist);
        textmoney = (TextView) findViewById(R.id.money);
        textkrist = (TextView) findViewById(R.id.krist);
        plus1 = (TextView) findViewById(R.id.plus1);
        shahtor = (ImageView) findViewById(R.id.shahtor);
        dostigen = (ImageButton) findViewById(R.id.dostigenia);
        load_save();
        Click();

        Animation anim = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.shahtor);
        shahtor.startAnimation(anim);

    }

    void Click(){
        click.setOnClickListener(new View.OnClickListener() {

            long mills = 40L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(
                        getApplicationContext(), R.anim.mycombo);
                plus1.startAnimation(animation);
                if (vibrator.hasVibrator()) {
                    vibrator.vibrate(mills);}
                countmoney += money;
                textmoney.setText(countmoney + "");
                plus1.setText(money + "");
                save();
            }
        });
        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        nastr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bintent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(bintent);
            }
        });


        pluskrst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_plus = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent_plus);
            }
        });

        dostigen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_dost = new Intent(MainActivity.this, Dostig.class);
                startActivity(intent_dost);
            }
        });

    }

    void save(){
        preferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putLong("money", countmoney);
        editor.putLong("prib", money);
        editor.putLong("krist", krist);
        editor.commit();
    }

    void load_save(){
        preferences = getPreferences(MODE_PRIVATE);
        countmoney = preferences.getLong("money", 0);
        money = preferences.getLong("prib", 1);
        krist = preferences.getLong("krist", 0);
        textmoney.setText(countmoney + "");
        textkrist.setText(krist + "");
    }

}





