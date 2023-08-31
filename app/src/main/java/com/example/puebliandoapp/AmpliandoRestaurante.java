package com.example.puebliandoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.puebliandoapp.moldes.MoldeHotel;
import com.example.puebliandoapp.moldes.MoldeRestaurantes;

public class AmpliandoRestaurante extends AppCompatActivity {

    MoldeRestaurantes moldeRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);

        moldeRestaurantes=(MoldeRestaurantes) getIntent().getSerializableExtra("datosRestaurante");
        Toast.makeText(this, moldeRestaurantes.getNombre(), Toast.LENGTH_LONG).show();
    }
}