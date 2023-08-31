package com.example.puebliandoapp.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.puebliandoapp.AmpliandoRestaurante;
import com.example.puebliandoapp.AmpliandoTurismo;
import com.example.puebliandoapp.R;
import com.example.puebliandoapp.moldes.MoldeTurismo;

import java.util.ArrayList;

public class AdaptadorSitios extends RecyclerView.Adapter<AdaptadorSitios.viewHolder> {

    //TODO ADAPTADOR TIENE UNA LISTA DE ELEMENTOS
    public ArrayList<MoldeTurismo> listaSitios;

    //Creamos un constructor vacìo
    public AdaptadorSitios() {
    }

    //Creamos un constructor lleno
    public AdaptadorSitios(ArrayList<MoldeTurismo> listaSitios) {
        this.listaSitios = listaSitios;
    }

    @NonNull
    @Override
    public AdaptadorSitios.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Esta porciòn de còdigo permite crear N copias del molde gràfico.
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldesitios,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorSitios.viewHolder holder, int position) {
        holder.actualizarDatos(listaSitios.get(position));
    }

    @Override
    public int getItemCount() {
        return listaSitios.size();
    }

    public  class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoSitio;
        TextView nombreSitio;
        TextView nombreContactoSitio;
        TextView precioSitio;
        TextView telefonoSitio;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoSitio=itemView.findViewById(R.id.fotolistamuseo);
            nombreSitio=itemView.findViewById(R.id.nombrelistamuseo);
            nombreContactoSitio=itemView.findViewById(R.id.contactonombrelista);
            precioSitio=itemView.findViewById(R.id.preciolistamuseo);
            telefonoSitio=itemView.findViewById(R.id.numerolistamuseo);
        }

        public void actualizarDatos(MoldeTurismo moldeTurismo) {
            fotoSitio.setImageResource(moldeTurismo.getFoto());
            nombreSitio.setText(moldeTurismo.getNombre());
            nombreContactoSitio.setText(moldeTurismo.getNombreContacto());
            precioSitio.setText(moldeTurismo.getPrecio());
            telefonoSitio.setText(moldeTurismo.getTelefono());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), AmpliandoTurismo.class);
                    intent.putExtra("datosTurismo", moldeTurismo);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}

