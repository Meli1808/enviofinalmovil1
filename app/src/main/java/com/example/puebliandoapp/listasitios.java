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
        ListaSitios.add(new MoldeTurismo("Casa Museo Hacienda Belen", "Guillermo Valencia Zamora","3654789512", "$30.000 COP",R.drawable.haciendabelen));
        ListaSitios.add(new MoldeTurismo("Reloj Floral de Ginebra", "Juana Piedrahita Mazo", "3225950033", "$80.000 COP",R.drawable.sitio2));
        ListaSitios.add(new MoldeTurismo("Palacio de las Naciones", "Sebastian unajirafa", "3187613243", "$180.0000 COP",R.drawable.sitio3));
        ListaSitios.add(new MoldeTurismo("Jet d´Eau", "Jose Gallego Mesa", "3918430926", "$120.000 COP",R.drawable.sitio4));
        ListaSitios.add(new MoldeTurismo("Museo de Arte e Historia", "Lina Guerrero Diamante", "3085276189", "$40.000 COP",R.drawable.sitio5));
    }
}