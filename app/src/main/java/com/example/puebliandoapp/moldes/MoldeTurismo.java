package com.example.puebliandoapp.moldes;

import java.io.Serializable;

public class MoldeTurismo implements Serializable {

    private String nombre;
    private String NombreContacto;
    private String telefono;
    private String precio;
    private Integer foto;
    private String comentario;
    private Float valoracion;
    private Integer fotoAdicional;

    public MoldeTurismo() {
    }

    public MoldeTurismo(String nombre, String nombreContacto, String telefono, String precio, Integer foto, String comentario, Float valoracion, Integer fotoAdicional) {
        this.nombre = nombre;
        NombreContacto = nombreContacto;
        this.telefono = telefono;
        this.precio = precio;
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

    public String getNombreContacto() {
        return NombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        NombreContacto = nombreContacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
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
