package com.example.puebliandoapp.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.puebliandoapp.R;
import com.example.puebliandoapp.moldes.MoldeHotel;

import java.util.ArrayList;

public class adaptadorhoteles extends RecyclerView.Adapter<adaptadorhoteles.viewHolder> {

    //TODO ADAPTADOR TIENE UNA LISTA DE ELEMENTOS
    public ArrayList<MoldeHotel> listaHoteles;

    //Creamos un constructor vacìo
    public adaptadorhoteles() {
    }

    //Creamos un constructor lleno
    public adaptadorhoteles(ArrayList<MoldeHotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    @NonNull
    @Override
    public adaptadorhoteles.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Esta porciòn de còdigo permite crear N copias del molde gràfico.
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null,false);
        return new parent(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull adaptadorhoteles.viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
