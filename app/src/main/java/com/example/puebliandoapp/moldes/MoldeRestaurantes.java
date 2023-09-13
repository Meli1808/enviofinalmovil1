package com.example.puebliandoapp.moldes;

import java.io.Serializable;

public class MoldeRestaurantes implements Serializable {

    private String nombre;
    private String rangoprecio;
    private String telefono;
    private String platoRecomendado;
    private Integer foto;
    private String comentario;
    private Float valoracion;
    private Integer fotoAdicional;

    public MoldeRestaurantes() {
    }

    public MoldeRestaurantes(String nombre, String rangoprecio, String telefono, String platoRecomendado, Integer foto, String comentario, Float valoracion, Integer fotoAdicional) {
        this.nombre = nombre;
        this.rangoprecio = rangoprecio;
        this.telefono = telefono;
        this.platoRecomendado = platoRecomendado;
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

    public String getRangoprecio() {
        return rangoprecio;
    }

    public void setRangoprecio(String rangoprecio) {
        this.rangoprecio = rangoprecio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPlatoRecomendado() {
        return platoRecomendado;
    }

    public void setPlatoRecomendado(String platoRecomendado) {
        this.platoRecomendado = platoRecomendado;
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