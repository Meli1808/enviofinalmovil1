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

    public void cambiarIdioma(String idioma){

        //configurar el lenguaje del telefono
        Locale lenguaje=new Locale(idioma);
        Locale.setDefault(lenguaje);

        //Configuramos globalmente el telefono
        Configuration configuracionTelefono=getResources().getConfiguration();
        configuracionTelefono.locale=lenguaje;

        //Ejecutamos la configuracion
        getBaseContext().getResources().updateConfiguration(configuracionTelefono,getBaseContext().getResources().getDisplayMetrics());

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int itemSeleccionado = item.getItemId();


        if (itemSeleccionado == R.id.opcion1) {
            this.cambiarIdioma("en");
            Intent intentIngles = new Intent(Home.this, Home.class);
            startActivity(intentIngles);

        } else if (itemSeleccionado == R.id.opcion2) {
            this.cambiarIdioma("es");
            Intent intentEspanol = new Intent(Home.this, Home.class);
            startActivity(intentEspanol);
        } else if (itemSeleccionado == R.id.opcion4) {
            Intent intent = new Intent(Home.this, Acerca.class);
            startActivity(intent);


        }
        return super.onOptionsItemSelected(item);
    }

}

