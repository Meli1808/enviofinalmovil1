package com.example.puebliandoapp.moldes;

public class MoldeTurismo {

    private String nombre;
    private String NombreContacto;
    private String telefono;
    private String precio;
    private Integer foto;

    public MoldeTurismo() {
    }

    public MoldeTurismo(String nombre, String nombreContacto, String telefono, String precio, Integer foto) {
        this.nombre = nombre;
        NombreContacto = nombreContacto;
        this.telefono = telefono;
        this.precio = precio;
        this.foto = foto;
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
}
