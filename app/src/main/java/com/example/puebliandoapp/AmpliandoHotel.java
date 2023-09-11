package com.example.puebliandoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.puebliandoapp.ImageAdapter;
import com.example.puebliandoapp.R;
import com.example.puebliandoapp.moldes.MoldeHotel;

import java.util.ArrayList;
import java.util.List;

public class AmpliandoHotel extends AppCompatActivity {
    MoldeHotel moldeHotel;
    ImageView fotoAmpliandoHotel;
    TextView nombreAmpliandoHotel;
    TextView precioAmpliandoHotel;
    TextView telefonoAmpliandoHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.puebliandoapp.R.layout.activity_ampliando_hotel);
        fotoAmpliandoHotel = findViewById(R.id.fotoampliandoHotel);
        nombreAmpliandoHotel = findViewById(R.id.nombreampliandoHotel);
        precioAmpliandoHotel = findViewById(R.id.precioampliandoHotel);
        telefonoAmpliandoHotel = findViewById(R.id.telefonoampliandohotel);
        moldeHotel = (MoldeHotel) getIntent().getSerializableExtra("datoshotel");

        // Cargando la info en los componentes gráficos
        fotoAmpliandoHotel.setImageResource(moldeHotel.getFoto());
        nombreAmpliandoHotel.setText(moldeHotel.getNombre());
        precioAmpliandoHotel.setText(moldeHotel.getPrecio());
        telefonoAmpliandoHotel.setText(moldeHotel.getTelefono());

        // 1. Obtén una referencia al ViewPager2 dentro del onCreate.
        ViewPager2 viewPager = findViewById(R.id.viewPager);

        // 2. Crea una lista de recursos de imágenes (IDs) que deseas mostrar en el carrusel.
        List<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.hotel2);
        imageList.add(R.drawable.hotel3);
        imageList.add(R.drawable.hotel4);
        // Agrega más imágenes según sea necesario.

        // 3. Crea un adaptador personalizado (debes haber creado previamente la clase ImageAdapter).
        ImageAdapter adapter = new ImageAdapter(this, imageList);

        // 4. Configura el adaptador en el ViewPager2.
        viewPager.setAdapter(adapter);
    }
}
