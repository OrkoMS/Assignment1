package com.roar71.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button flatUiKitBtn = findViewById(R.id.flat_ui_kit_btn);
        Button lilytopBtn = findViewById(R.id.lilytop_btn);
        Button kitchenAidBtn = findViewById(R.id.kitchen_aid_btn);

        flatUiKitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent firstIntent = new Intent(MainActivity.this, FlatUiKitActivity.class);
                startActivity(firstIntent);
            }
        });

        lilytopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent secondIntent = new Intent(MainActivity.this,
                        LilytopActivity.class);
                startActivity(secondIntent);
            }
        });

        kitchenAidBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent thirdIntent = new Intent(MainActivity.this,
                        KitchenAidActivity.class);
                startActivity(thirdIntent);
            }
        });

    }

}
