package com.example.puebliandoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
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
    ImageView fotoAdicionalampliandoRes;
    TextView comentarioAmpliandoRes;
    RatingBar valorAmpliandoRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);

        nombreAmpliandoRes=findViewById(R.id.nombreampliandores);
        fotoAmpliandoRes=findViewById(R.id.fotoampliandores);
        telefonoAmpliandoRes=findViewById(R.id.telefonoampliandores);
        platorecomendadoAmpliandoRes=findViewById(R.id.recomendadoampliandores);
        precioAmpliandoRes=findViewById(R.id.precioampliandores);
        valorAmpliandoRes=findViewById(R.id.valoracionAmpliandores);
        comentarioAmpliandoRes=findViewById(R.id.comentarioAmpliandores);
        fotoAdicionalampliandoRes=findViewById(R.id.fotoampliandores2);
        moldeRestaurantes=(MoldeRestaurantes) getIntent().getSerializableExtra("datosRestaurante");

        //Cargando la info en los componentes gráficos
        nombreAmpliandoRes.setText(moldeRestaurantes.getNombre());
        fotoAmpliandoRes.setImageResource(moldeRestaurantes.getFoto());
        telefonoAmpliandoRes.setText(moldeRestaurantes.getTelefono());
        platorecomendadoAmpliandoRes.setText(moldeRestaurantes.getPlatoRecomendado());
        precioAmpliandoRes.setText(moldeRestaurantes.getRangoprecio());
        valorAmpliandoRes.setRating(moldeRestaurantes.getValoracion());
        comentarioAmpliandoRes.setText(moldeRestaurantes.getComentario());
        fotoAdicionalampliandoRes.setImageResource(moldeRestaurantes.getFotoAdicional());

    }
}
