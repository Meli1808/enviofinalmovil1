package com.example.puebliandoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.puebliandoapp.adaptadores.AdaptadorHoteles;
import com.example.puebliandoapp.adaptadores.AdaptadorRestaurante;
import com.example.puebliandoapp.moldes.MoldeRestaurantes;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    ArrayList<MoldeRestaurantes> listaRestaurantes=new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);
        recyclerView=findViewById(R.id.listadinamicarestaurantes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorRestaurante adaptadorRestaurante=new AdaptadorRestaurante(listaRestaurantes);
        recyclerView.setAdapter(adaptadorRestaurante);

        // Realiza la consulta a Firebase
        db.collection("Restaurantes")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                String nombreRes = document.getString("Nombre");
                                Toast.makeText(ListaRestaurantes.this,nombreRes, Toast.LENGTH_SHORT).show();
                                String precioRes= document.getString("Precio");
                                Toast.makeText(ListaRestaurantes.this,precioRes, Toast.LENGTH_SHORT).show();
                                String telefonoRes= document.getString("Teléfono");
                                Toast.makeText(ListaRestaurantes.this,telefonoRes, Toast.LENGTH_SHORT).show();
                                String fotoRes= document.getString("Foto");
                                Toast.makeText(ListaRestaurantes.this,fotoRes, Toast.LENGTH_SHORT).show();
                                String platocasaRes= document.getString("Plato de la casa");
                                Toast.makeText(ListaRestaurantes.this,platocasaRes, Toast.LENGTH_SHORT).show();
                                // Aquí puedes crear un objeto MoldeRestaurante con los datos y agregarlo a la lista
                                // Ejemplo:
                            }
                            AdaptadorRestaurante adaptadorRestaurante = new AdaptadorRestaurante(listaRestaurantes);
                            recyclerView.setAdapter(adaptadorRestaurante);
                        } else {

                        }
                    }
                });
    }
    public void llenarListaConDatos(){
        listaRestaurantes.add(new MoldeRestaurantes("Restaurante Hacienda Venecia", "$40.500 - $101.300 COP", "3107099476", "Sancocho de Gallina", R.drawable.restaurante1, "''El restaurante me encantó, buena ubicación, las zonas verdes espectaculares, tiene piscina y el servicio al cliente es lo máximo.''", 5f, R.drawable.restaurante11));
        listaRestaurantes.add(new MoldeRestaurantes("Restaurante Parrilla Bar", "$45.000 - $80.000 COP", "3225457893", "Cubos de Atùn",R.drawable.restaurante2, "''Me gustó mucho la comida, un poco demoradas las entregas pero el lugar muy agradable, mucha naturaleza.''", 4.5f, R.drawable.restaurante22));
        listaRestaurantes.add(new MoldeRestaurantes("Restaurante El Condado", "$90.000 - $150.000 COP", "3152635846", "Rack de Cordero", R.drawable.restaurante3, "''Hay mucha discriminación en es restaurante, la comida es de buena calidad pero la humildad cero, poca compasión.''" , 2f , R.drawable.restaurante33));
        listaRestaurantes.add(new MoldeRestaurantes("Restaurante Les Armures", "$60.000 - $120.000 COP", "3053425935", "Paella de Mariscos", R.drawable.restaurante4, "''Muy sofisticado, elegante, buena iluminación, platos exquisitos pero podría visitarlo 1 vez al año.''", 4f, R.drawable.restaurante44));
        listaRestaurantes.add(new MoldeRestaurantes("Restaurantes El faro", "$110.000 - $320.000 COP", "3286471200", "Pollo a la Parmesana", R.drawable.restaurante5, "''Muy amables, atentos, la fachada es impresionante, cordialidad a mil, muy recomendado.''", 5f, R.drawable.restaurante55));
        listaRestaurantes.add(new MoldeRestaurantes("Restaurantes Chat Bottè", "$130.000 - $280.000 COP", "3117891003", "Carne Angus Beef", R.drawable.restaurante6, "En mi caso soy vegana y todos sus platos contienen carne, me gustaría que evaluaran más las opciones del menú.", 3f, R.drawable.restaurante66));
    }
}