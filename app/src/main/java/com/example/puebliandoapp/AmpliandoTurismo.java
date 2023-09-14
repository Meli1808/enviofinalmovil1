package com.example.puebliandoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.puebliandoapp.moldes.MoldeRestaurantes;
import com.example.puebliandoapp.moldes.MoldeTurismo;

public class AmpliandoTurismo extends AppCompatActivity {

    MoldeTurismo moldeTurismo;
    ImageView fotoAmpliandoTur;
    TextView  nombreAmpliandoTur;
    TextView  nombrecontactoAmpliandoTur;
    TextView  telefonoAmpliandoTur;
    TextView  precioAmpliandoTur;
    ImageView fotoAdicionalampliandomuseo;
    TextView comentarioAmpliandomuseo;
    RatingBar valorAmpliandomuseo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_turismo);
        fotoAmpliandoTur=findViewById(R.id.fotoAmpliandomuseo);
        nombreAmpliandoTur=findViewById(R.id.nombreAmpliandomuseo);
        nombrecontactoAmpliandoTur=findViewById(R.id.contactonombreAmpliando);
        telefonoAmpliandoTur=findViewById(R.id.numeroAmpliandomuseo);
        precioAmpliandoTur=findViewById(R.id.precioAmpliandomuseo);
        fotoAdicionalampliandomuseo=findViewById(R.id.fotoAmpliandomuseo2);
        comentarioAmpliandomuseo=findViewById(R.id.comentarioAmpliandomuseo);
        valorAmpliandomuseo=findViewById(R.id.valoracionAmpliandomuseo);
        moldeTurismo=(MoldeTurismo) getIntent().getSerializableExtra("datosTurismo");

        //Cargando la info en los componentes gráficos
        fotoAmpliandoTur.setImageResource(moldeTurismo.getFoto());
        nombreAmpliandoTur.setText(moldeTurismo.getNombre());
        nombrecontactoAmpliandoTur.setText(moldeTurismo.getNombreContacto());
        telefonoAmpliandoTur.setText(moldeTurismo.getTelefono());
        precioAmpliandoTur.setText(moldeTurismo.getPrecio());
        fotoAdicionalampliandomuseo.setImageResource(moldeTurismo.getFotoAdicional());
        comentarioAmpliandomuseo.setText(moldeTurismo.getComentario());
        valorAmpliandomuseo.setRating(moldeTurismo.getValoracion());
    }
}