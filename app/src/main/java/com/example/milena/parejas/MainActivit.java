package com.example.milena.parejas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivit extends AppCompatActivity {

    public void click(View View){
        Intent i = new Intent(this, com.example.milena.parejas.Personas.class);
        //i.putExtra("direccion", et1.getText().toString());
        startActivity(i);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
