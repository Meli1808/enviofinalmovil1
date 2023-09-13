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
        //valorAmpliandoRes=findViewById(R.id.valorampliando);

        moldeRestaurantes=(MoldeRestaurantes) getIntent().getSerializableExtra("datosRestaurante");

        //Cargando la info en los componentes gráficos
        nombreAmpliandoRes.setText(moldeRestaurantes.getNombre());
        fotoAmpliandoRes.setImageResource(moldeRestaurantes.getFoto());
        telefonoAmpliandoRes.setText(moldeRestaurantes.getTelefono());
        platorecomendadoAmpliandoRes.setText(moldeRestaurantes.getPlatoRecomendado());
        precioAmpliandoRes.setText(moldeRestaurantes.getRangoprecio());
        valorAmpliandoRes.setRating(moldeRestaurantes.getValoracion());


    }
}

/*<RatingBar
        android:id="@+id/valorampliando"
                android:layout_width="231dp"
                android:layout_height="50dp"
                android:progressTint="@color/goldenrod"
                android:rating="2"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="0.083"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent"
                app:layout_constraintVertical_bias="0.114" />*/