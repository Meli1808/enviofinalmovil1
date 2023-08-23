package com.example.puebliandoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.OnNewIntentProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Restaurantes extends AppCompatActivity {

    Button botonVerMas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        botonVerMas=findViewById(R.id.botonrestaurantes);

        botonVerMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurantes.this,ListaRestaurantes.class);
                startActivity(intent);
            }
        });
    }
}