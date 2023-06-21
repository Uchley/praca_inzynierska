package com.example.okna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

public class Rozw extends AppCompatActivity implements View.OnClickListener, PopupMenu.OnMenuItemClickListener{

    public CardView ca1, ca2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rozw);

        ca1 = (CardView) findViewById(R.id.rozprawe);
        ca2 = (CardView) findViewById(R.id.rozlewe);

        ImageView backIcon = findViewById(R.id.back_icon);
        ImageView menuIcon = findViewById(R.id.menu_icon);
        TextView toolbarText = findViewById(R.id.toolbar_title);


        ca1.setOnClickListener(this);
        ca2.setOnClickListener(this);

        backIcon.setOnClickListener(this);
        menuIcon.setOnClickListener(this);
        toolbarText.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()) {
            case R.id.rozprawe:
                i = new Intent(this, Rozwprawe.class);
                startActivity(i);
                break;

            case R.id.rozlewe:
                i = new Intent(this, Rozwlewe.class);
                startActivity(i);
                break;

            case R.id.toolbar_title:
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;

            case R.id.back_icon:
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;

            case R.id.menu_icon:
                PopupMenu popup = new PopupMenu(this, v);
                popup.setOnMenuItemClickListener(this);
                popup.inflate(R.menu.popup_menu);
                popup.show();

        }

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