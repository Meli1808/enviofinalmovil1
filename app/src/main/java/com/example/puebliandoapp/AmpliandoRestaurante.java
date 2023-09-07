package com.example.puebliandoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.puebliandoapp.moldes.MoldeHotel;
import com.example.puebliandoapp.moldes.MoldeRestaurantes;

import org.w3c.dom.Text;

public class AmpliandoRestaurante extends AppCompatActivity {

    MoldeRestaurantes moldeRestaurantes;
    TextView nombreAmpliandoRes;
    ImageView fotoAmpliandoRes;
    TextView telefonoAmpliandoRes;
    TextView platorecomendadoAmpliandoRes;
    TextView precioAmpliandoRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);
        nombreAmpliandoRes=findViewById(R.id.nombreampliandores);
        fotoAmpliandoRes=findViewById(R.id.fotoampliandores);
        telefonoAmpliandoRes=findViewById(R.id.telefonoampliandores);
        platorecomendadoAmpliandoRes=findViewById(R.id.recomendadoampliandores);
        precioAmpliandoRes=findViewById(R.id.precioampliandores);
        moldeRestaurantes=(MoldeRestaurantes) getIntent().getSerializableExtra("datosRestaurante");

        //Cargando la info en los componentes gráficos
        nombreAmpliandoRes.setText(moldeRestaurantes.getNombre());
        fotoAmpliandoRes.setImageResource(moldeRestaurantes.getFoto());
        telefonoAmpliandoRes.setText(moldeRestaurantes.getTelefono());
        platorecomendadoAmpliandoRes.setText(moldeRestaurantes.getPlatoRecomendado());
        precioAmpliandoRes.setText(moldeRestaurantes.getRangoprecio());


    }
}