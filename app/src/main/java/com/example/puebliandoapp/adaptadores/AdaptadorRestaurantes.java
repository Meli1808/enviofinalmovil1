package com.example.puebliandoapp.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.puebliandoapp.R;
import com.example.puebliandoapp.moldes.MoldeRestaurantes;

import java.util.ArrayList;

public class adaptadorestaurantes extends RecyclerView.Adapter<adaptadorestaurantes.viewHolder> {

    //TODO ADAPTADOR TIENE UNA LISTA DE ELEMENTOS
    public ArrayList<MoldeRestaurantes> listaRestaurantes;

    //Creamos un constructor vacìo
    public adaptadorestaurantes() {
    }

    //Creamos un constructor lleno
    public adaptadorestaurantes(ArrayList<MoldeRestaurantes> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public adaptadorestaurantes.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Esta porciòn de còdigo permite crear N copias del molde gràfico.
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull adaptadorestaurantes.viewHolder holder, int position) {
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
        TextView platorecomendadoRestaurante;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoRestaurante=itemView.findViewById(R.id.fotolistares);
            nombreRestaurante=itemView.findViewById(R.id.nombrelistares);
            precioRestaurante=itemView.findViewById(R.id.preciolistares);
            contactoRestaurante=itemView.findViewById(R.id.contactolistares);
            platorecomendadoRestaurante=itemView.findViewById(R.id.)
        }

        public void actualizarDatos(MoldeRestaurantes moldeRestaurantes) {
            fotoRestaurante.setImageResource(moldeRestaurantes.getFoto());
            nombreRestaurante.setText(moldeRestaurantes.getNombre());
            precioRestaurante.setText(moldeRestaurantes.getRangoprecio());
            contactoRestaurante.setText(moldeRestaurantes.getTelefono());
        }
    }
}
