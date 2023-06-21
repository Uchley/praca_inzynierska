package com.example.okna;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.RadioGroup;
import android.widget.TextView;

public class srlewe extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    private RadioGroup group_dol, group_plecy;
    private ImageView image_dol, image_plecy;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srlewe);

        image_dol = findViewById(R.id.imagedol);
        image_plecy = findViewById(R.id.imageplecy);

        ImageView backIcon = findViewById(R.id.back_icon);
        ImageView menuIcon = findViewById(R.id.menu_icon);
        TextView toolbarText = findViewById(R.id.toolbar_title);

        group_dol = findViewById(R.id.group_dol);
        group_plecy = findViewById(R.id.group_plecy);

        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                switch (v.getId()) {
                    case R.id.back_icon:
                        i = new Intent(srlewe.this, sr.class);
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
                        i = new Intent(srlewe.this, MainActivity.class);
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
                        PopupMenu popup = new PopupMenu(srlewe.this, v);
                        popup.setOnMenuItemClickListener(srlewe.this);
                        popup.inflate(R.menu.popup_menu);
                        popup.show();
                }
            }
        });

        group_dol.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.d1:
                        image_dol.setImageDrawable(getResources().getDrawable(R.drawable.ruchdl1));
                        break;

                    case R.id.d2:
                        image_dol.setImageDrawable(getResources().getDrawable(R.drawable.ruchdl2));
                        break;

                    case R.id.d3:
                        image_dol.setImageDrawable(getResources().getDrawable(R.drawable.ruchdl3));
                        break;

                    case R.id.d4:
                        image_dol.setImageDrawable(getResources().getDrawable(R.drawable.ruchdl4));
                        break;

                    case R.id.d5:
                        image_dol.setImageDrawable(getResources().getDrawable(R.drawable.ruchdl5));
                        break;

                }
            }
        });

        group_plecy.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.p1:
                        image_plecy.setImageDrawable(getResources().getDrawable(R.drawable.ruchpl1));
                        break;

                    case R.id.p2:
                        image_plecy.setImageDrawable(getResources().getDrawable(R.drawable.ruchpl2));
                        break;

                    case R.id.p3:
                        image_plecy.setImageDrawable(getResources().getDrawable(R.drawable.ruchpl3));
                        break;

                    case R.id.p4:
                        image_plecy.setImageDrawable(getResources().getDrawable(R.drawable.ruchpl4));
                        break;

                    case R.id.p5:
                        image_plecy.setImageDrawable(getResources().getDrawable(R.drawable.ruchpl5));
                        break;

                    case R.id.p6:
                        image_plecy.setImageDrawable(getResources().getDrawable(R.drawable.ruchpl6));
                        break;

                    case R.id.p7:
                        image_plecy.setImageDrawable(getResources().getDrawable(R.drawable.ruchpl7));
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