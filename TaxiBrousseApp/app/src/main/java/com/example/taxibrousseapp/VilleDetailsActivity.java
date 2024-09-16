package com.example.taxiapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class VilleDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ville_details);

        TextView textVille = findViewById(R.id.text_ville);
        TextView textPrix = findViewById(R.id.text_prix);
        TextView textHoraires = findViewById(R.id.text_horaires);
        TextView textDistance = findViewById(R.id.text_distance);

        String ville = getIntent().getStringExtra("ville");

        if (ville != null) {
            textVille.setText("Ville: " + ville);
            switch (ville) {
                case "Antsirabe":
                    textPrix.setText("Prix: 20 000 Ar");
                    textHoraires.setText("Horaires: 7h, 9h, 13h, 16h");
                    textDistance.setText("Distance: 170 Km");
                    break;
                case "Fianarantsoa":
                    textPrix.setText("Prix: 38 000 Ar");
                    textHoraires.setText("Horaires: 7h 30mn, 17h 30mn");
                    textDistance.setText("Distance: 406 Km");
                    break;
                case "Ihosy":
                    textPrix.setText("Prix: 50 000 Ar");
                    textHoraires.setText("Horaires: 7h 30mn, 17h 30mn");
                    textDistance.setText("Distance: 406 Km");
                    break;
            }
        }
    }
}
