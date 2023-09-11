package com.example.puebliandoapp.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.puebliandoapp.ImageAdapter;
import com.example.puebliandoapp.AmpliandoRestaurante;
import com.example.puebliandoapp.R;
import com.example.puebliandoapp.moldes.MoldeRestaurantes;

import java.util.ArrayList;

public class AdaptadorRestaurante extends RecyclerView.Adapter<AdaptadorRestaurante.viewHolder> {

    //TODO ADAPTADOR TIENE UNA LISTA DE ELEMENTOS
    public ArrayList<MoldeRestaurantes> listaRestaurantes;

    //Creamos un constructor vacìo
    public AdaptadorRestaurante() {
    }

    //Creamos un constructor lleno
    public AdaptadorRestaurante(ArrayList<MoldeRestaurantes> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public AdaptadorRestaurante.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Esta porciòn de còdigo permite crear N copias del molde gràfico.
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRestaurante.viewHolder holder, int position) {
        holder.actualizarDatos(listaRestaurantes.get(position));
    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public  class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoRestaurante;
        TextView nombreRestaurante;
        TextView precioRestaurante;
        TextView contactoRestaurante;
        TextView platoRecomendadoRestaurantes;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoRestaurante=itemView.findViewById(R.id.fotolistares);
            nombreRestaurante=itemView.findViewById(R.id.nombrelistares);
            precioRestaurante=itemView.findViewById(R.id.preciolistares);
            contactoRestaurante=itemView.findViewById(R.id.telefonolistares);
            platoRecomendadoRestaurantes=itemView.findViewById(R.id.recomendadolistares);
        }

        public void actualizarDatos(MoldeRestaurantes moldeRestaurantes) {
            fotoRestaurante.setImageResource(moldeRestaurantes.getFoto());
            nombreRestaurante.setText(moldeRestaurantes.getNombre());
            precioRestaurante.setText(moldeRestaurantes.getRangoprecio());
            contactoRestaurante.setText(moldeRestaurantes.getTelefono());
            platoRecomendadoRestaurantes.setText(moldeRestaurantes.getPlatoRecomendado());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), AmpliandoRestaurante.class);
                    intent.putExtra("datosRestaurante", moldeRestaurantes);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}

