package com.example.puebliandoapp.moldes;

import android.content.ServiceConnection;

import java.io.Serializable;

import kotlin.jvm.internal.SerializedIr;

public class MoldeHotel implements Serializable {

    private String nombre;
    private String precio;
    private String telefono;
    private Integer foto;
    private String comentario;
    private Float valoracion;
    private Integer fotoAdicional;

    public MoldeHotel() { //Constructor vacio
    }

    public MoldeHotel(String nombre, String precio, String telefono, Integer foto, String comentario, Float valoracion, Integer fotoAdicional) {
        this.nombre = nombre;
        this.precio = precio;
        this.telefono = telefono;
        this.foto = foto;
        this.comentario = comentario;
        this.valoracion = valoracion;
        this.fotoAdicional = fotoAdicional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Float getValoracion() {
        return valoracion;
    }

    public void setValoracion(Float valoracion) {
        this.valoracion = valoracion;
    }

    public Integer getFotoAdicional() {
        return fotoAdicional;
    }

    public void setFotoAdicional(Integer fotoAdicional) {
        this.fotoAdicional = fotoAdicional;
    }
}
