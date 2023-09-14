package com.example.puebliandoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.puebliandoapp.adaptadores.AdaptadorHoteles;
import com.example.puebliandoapp.moldes.MoldeHotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<MoldeHotel> listaHoteles=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView=findViewById(R.id.listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorHoteles adaptadorHoteles=new AdaptadorHoteles(listaHoteles);
        recyclerView.setAdapter(adaptadorHoteles);

    }
    public void llenarListaConDatos(){
        listaHoteles.add(new MoldeHotel("Hotel casa Benigno", "$80000 COP", "3107099476",R.drawable.hotel1, "''La estadía estuvo muy tranquila, confortable, el clima es un poco extremista, el resto bien.''", 4f, R.drawable.hotel11));
        listaHoteles.add(new MoldeHotel("Hotel caña de azùcar", "$150000 COP", "3225457893",R.drawable.hotel2, "''Mi estancia en este hotel fue excepcional. El personal fue amable y servicial, la habitación estaba impecable y la ubicación era perfecta para explorar la ciudad.''", 5f, R.drawable.hotel22));
        listaHoteles.add(new MoldeHotel("Hotel flor de durazno", "$180000 COP", "3152635846",R.drawable.hotel3,"''El hotel tenía algunas ventajas, como una bonita piscina, pero también tuvo sus inconvenientes. La habitación estaba limpia pero un poco ruidosa debido a la ubicación.''", 3.5f, R.drawable.hotel33 ));
        listaHoteles.add(new MoldeHotel("Hotel la campera", "$200000 COP", "3053425935",R.drawable.hotel4, "''Mi experiencia en este hotel fue decepcionante. La habitación estaba sucia y necesitaba mantenimiento. El personal era poco profesional y poco atento. No volvería a hospedarme aquí.''", 1.5f, R.drawable.hotel44));
        listaHoteles.add(new MoldeHotel("Hotel villa vieja", "$350000 COP", "3286471200",R.drawable.hotel5, "''El hotel tenía algunas ventajas, como una bonita piscina, pero también tuvo sus inconvenientes. La habitación estaba limpia pero un poco ruidosa debido a la ubicación.''", 3f, R.drawable.hotel55));
        listaHoteles.add(new MoldeHotel("Hotel campestre", "$110000 COP", "3117891003",R.drawable.hotel6, "''Excelente servicio, habitaciones cómodas y una ubicación perfecta para explorar la ciudad. ¡Altamente recomendado!''", 4.5f, R.drawable.hotel66));
    }
}