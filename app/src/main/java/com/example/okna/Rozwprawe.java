package com.example.okna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Rozwprawe extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    private RadioGroup group_klamka, group_dol;
    private ImageView image_dol, image_klamka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rozwprawe);

        image_dol = findViewById(R.id.imagedol);
        image_klamka = findViewById(R.id.imageklamka);

        ImageView backIcon = findViewById(R.id.back_icon);
        ImageView menuIcon = findViewById(R.id.menu_icon);
        TextView toolbarText = findViewById(R.id.toolbar_title);

        group_klamka = findViewById(R.id.group_klamka);
        group_dol = findViewById(R.id.group_dol);

        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                switch (v.getId()) {
                    case R.id.back_icon:
                        i = new Intent(Rozwprawe.this, Rozw.class);
                        startActivity(i);
                        break;
                }
            }
        });

        toolbarText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                switch (v.getId()) {
                    case R.id.toolbar_title:
                        i = new Intent(Rozwprawe.this, MainActivity.class);
                        startActivity(i);
                        break;
                }
            }
        });

        menuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                switch (v.getId()) {
                    case R.id.menu_icon:
                        PopupMenu popup = new PopupMenu(Rozwprawe.this, v);
                        popup.setOnMenuItemClickListener(Rozwprawe.this);
                        popup.inflate(R.menu.popup_menu);
                        popup.show();
                }
            }
        });

        group_klamka.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.kl1:
                        image_klamka.setImageDrawable(getResources().getDrawable(R.drawable.k433rozw));
                        break;

                    case R.id.kl2:
                        image_klamka.setImageDrawable(getResources().getDrawable(R.drawable.k533rozw));
                        break;

                    case R.id.kl3:
                        image_klamka.setImageDrawable(getResources().getDrawable(R.drawable.k583rozw));
                        break;

                    case R.id.kl4:
                        image_klamka.setImageDrawable(getResources().getDrawable(R.drawable.k1020czerwrozw));
                        break;

                    case R.id.kl5:
                        image_klamka.setImageDrawable(getResources().getDrawable(R.drawable.k1020czarrozw));
                        break;

                }
            }
        });

        group_dol.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.d1:
                        image_dol.setImageDrawable(getResources().getDrawable(R.drawable.dolrozw1));
                        break;

                    case R.id.d2:
                        image_dol.setImageDrawable(getResources().getDrawable(R.drawable.dolrozw2));
                        break;

                    case R.id.d3:
                        image_dol.setImageDrawable(getResources().getDrawable(R.drawable.dolrozw3));
                        break;

                    case R.id.d4:
                        image_dol.setImageDrawable(getResources().getDrawable(R.drawable.dol5rozw));
                        break;

                }
            }
        });

    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        Intent i;

        switch(item.getItemId()) {
            case R.id.nav_ru:
                i = new Intent(this, RU.class);
                startActivity(i);
                return true;

            case R.id.nav_r:
                i = new Intent(this, Rozw.class);
                startActivity(i);
                return true;

            case R.id.nav_sr:
                i = new Intent(this, sr.class);
                startActivity(i);
                return true;
            default:
                return false;
        }
    }
}
