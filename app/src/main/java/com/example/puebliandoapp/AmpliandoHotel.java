package com.example.puebliandoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.puebliandoapp.moldes.MoldeHotel;

public class AmpliandoHotel extends AppCompatActivity {

    MoldeHotel moldeHotel;
    ImageView fotoAmpliandoHotel;
    TextView nombreAmpliandoHotel;
    TextView precioAmpliandoHotel;
    TextView telefonoAmpliandoHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);
        fotoAmpliandoHotel=findViewById(R.id.fotoampliandoHotel);
        nombreAmpliandoHotel=findViewById(R.id.nombreampliandoHotel);
        precioAmpliandoHotel=findViewById(R.id.precioampliandoHotel);
        telefonoAmpliandoHotel=findViewById(R.id.telefonoampliandohotel);
        moldeHotel=(MoldeHotel)getIntent().getSerializableExtra("datoshotel");

        //Cargando la info en los componentes gráficos
        fotoAmpliandoHotel.setImageResource(moldeHotel.getFoto());
        nombreAmpliandoHotel.setText(moldeHotel.getNombre());
        precioAmpliandoHotel.setText(moldeHotel.getPrecio());
        telefonoAmpliandoHotel.setText(moldeHotel.getTelefono());

        }
}