package com.example.puebliandoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.puebliandoapp.adaptadores.AdaptadorSitios;
import com.example.puebliandoapp.moldes.MoldeTurismo;

import java.util.ArrayList;

public class listasitios extends AppCompatActivity {

    ArrayList<MoldeTurismo> ListaSitios=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listasitios);
        recyclerView=findViewById(R.id.listadinamicasitios);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorSitios adaptadorSitios=new AdaptadorSitios(ListaSitios);
        recyclerView.setAdapter(adaptadorSitios);

    }
    public void llenarListaConDatos(){
        ListaSitios.add(new MoldeTurismo("Casa Museo Hacienda Belen", "Guillermo Valencia Zamora","3654789512", "$30.000 COP",R.drawable.haciendabelen, "''El lugar es encantador, hay una naturaleza espectacular, el guía super atento, aprendí mucho en este visita.''", 5f, R.drawable.haciendabelen11));
        ListaSitios.add(new MoldeTurismo("Reloj Floral de Ginebra", "Juana Piedrahita Mazo", "3225950033", "$80.000 COP",R.drawable.sitio2, "''Es un tesoro suizo que combina ingeniería precisa con belleza natural, el recorrido estuvo genial, se nota el trabajo duro.''", 5f, R.drawable.sitio22));
        ListaSitios.add(new MoldeTurismo("Palacio de las Naciones", "Sebastian unajirafa", "3187613243", "$180.0000 COP",R.drawable.sitio3, "''Me gustó la exhibición, un poco aburrida, hay buenas obras, pero siento que todo fue muy rápido.''", 3.5f, R.drawable.sitio33));
        ListaSitios.add(new MoldeTurismo("Jet d´Eau", "Jose Gallego Mesa", "3918430926", "$120.000 COP",R.drawable.sitio4, "''Fue una experiencia increíble, aunque tuve bastante miedo, siento que deben mejorar un poco los implementos.''", 4f, R.drawable.sitio44));
        ListaSitios.add(new MoldeTurismo("Museo de Arte e Historia", "Lina Guerrero Diamante", "3085276189", "$40.000 COP",R.drawable.sitio5, "''Me encanta que permanezca viva nuestra historia, tiene mucha seguridad, aunque los recursos del museo no me fascinaron del todo.''", 2f, R.drawable.sitio55));
    }
}