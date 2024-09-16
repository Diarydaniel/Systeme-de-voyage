package com.example.taxiapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonFasanKarana = findViewById(R.id.button_fasan_karana);
        Button buttonMaki = findViewById(R.id.button_maki);

        buttonFasanKarana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AxeActivity.class);
                intent.putExtra("gare", "Fasan’ny karana");
                startActivity(intent);
            }
        });

        buttonMaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AxeActivity.class);
                intent.putExtra("gare", "Maki Andohatapenaka");
                startActivity(intent);
            }
        });
    }
}
