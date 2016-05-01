package com.example.milena.parejas;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class DescripcionCarlos extends AppCompatActivity {


    public void volver4(View View) {
        RatingBar rabar = (RatingBar) findViewById(R.id.ratingBar4);
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = prefs.edit();
        prefsEditor.putFloat("puntuacion", rabar.getRating());
        prefsEditor.apply();
        Toast.makeText(this, "puntuacion:" + rabar.getRating(), Toast.LENGTH_SHORT).show();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_carlos);


        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        float i = prefs.getFloat("puntuacion", 0);
        RatingBar rabar = (RatingBar) findViewById(R.id.ratingBar4);
        rabar.setRating(i);
    }
}
