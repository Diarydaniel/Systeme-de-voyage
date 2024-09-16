package com.example.taxiapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class AxeActivity extends AppCompatActivity {

    private String[] axesSud = {"Ambatolampy", "Antsirabe", "Ambositra", "Fianarantsoa", "Ihosy", "Ankaramena", "Toliara"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_axe);

        ListView listView = findViewById(R.id.list_axes);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, axesSud);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedVille = axesSud[position];
                Intent intent = new Intent(AxeActivity.this, VilleDetailsActivity.class);
                intent.putExtra("ville", selectedVille);
                startActivity(intent);
            }
        });
    }
}
