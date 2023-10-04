package com.example.puebliandoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.puebliandoapp.adaptadores.AdaptadorHoteles;
import com.example.puebliandoapp.moldes.MoldeHotel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<MoldeHotel> listaHoteles=new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView = findViewById(R.id.listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        // Realiza la consulta a Firebase
        db.collection("hoteles")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                String nombreHotel = document.getString("Nombre");
                                String precioHotel = document.getString("Precio");
                                String TelefonoHotel = document.getString("Teléfono");
                                String FotoHotel = document.getString("Foto");
                                String DescripcionHotel = document.getString("Descripción");
                                // Aquí puedes crear un objeto MoldeHotel con los datos y agregarlo a la lista
                                // Ejemplo:
                            }
                            // Una vez que hayas agregado todos los hoteles a listaHoteles, configura el adaptador
                            AdaptadorHoteles adaptadorHotel = new AdaptadorHoteles(listaHoteles);
                            recyclerView.setAdapter(adaptadorHotel);
                        } else {
                            Toast.makeText(ListaHoteles.this, "Error al obtener datos", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}