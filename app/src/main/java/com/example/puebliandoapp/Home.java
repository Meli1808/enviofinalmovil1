package com.example.puebliandoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Locale;

public class Home extends AppCompatActivity {

    // ZONA DE LOS ATRIBUTOS
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonSitios;
    TextView nombreCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String nombre = getIntent().getStringExtra("nombre");

        botonHoteles = findViewById(R.id.botonhoteles);
        botonRestaurantes = findViewById(R.id.botonrestaurantes);
        botonSitios = findViewById(R.id.botonsitios);
        nombreCliente = findViewById(R.id.Usuario);

        // Uniendo el texto del PUTEXTRA con el TEXTVIEW
        nombreCliente.setText(nombre);

        // DETECTANDO EVENTOS
        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHoteles = new Intent(Home.this, Hoteles.class);
                startActivity(intentHoteles);
            }
        });

        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRestaurantes = new Intent(Home.this, Restaurantes.class);
                startActivity(intentRestaurantes);
            }
        });

        botonSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSitios = new Intent(Home.this, Sitios.class);
                startActivity(intentSitios);
            }
        });
    }

    public void cambiarIdioma(String idioma) {
        // Configurar el lenguaje del teléfono
        Locale lenguaje = new Locale(idioma);
        Locale.setDefault(lenguaje);

        // Configurar globalmente el teléfono
        Configuration configuracionTelefono = getResources().getConfiguration();
        configuracionTelefono.locale = lenguaje;

        // Ejecutar la configuración
        getBaseContext().getResources().updateConfiguration(configuracionTelefono, getBaseContext().getResources().getDisplayMetrics());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemSeleccionado = item.getItemId();

        if (itemSeleccionado == R.id.opcion1) {
            cambiarIdioma("en");
            Intent intentIngles = new Intent(Home.this, Home.class);
            startActivity(intentIngles);
        } else if (itemSeleccionado == R.id.opcion2) {
            // Código para la opción 2
        } else if (itemSeleccionado == R.id.opcion3) {
            // Código para la opción 3
        } else if (itemSeleccionado == R.id.opcion4) {
            Intent intent = new Intent(Home.this, Acerca.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}

