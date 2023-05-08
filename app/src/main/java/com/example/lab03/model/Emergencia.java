package com.example.lab03.model;

public class Emergencia {
    private String nombreMascota;
    private String genero;
    private String nombreDuenho;
    private String dni;
    private String descripcion;

    private String ruta;

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombreDuenho() {
        return nombreDuenho;
    }

    public void setNombreDuenho(String nombreDuenho) {
        this.nombreDuenho = nombreDuenho;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Emergencia(String nombreMascota, String genero, String nombreDuenho, String dni, String descripcion) {
        this.nombreMascota = nombreMascota;
        this.genero = genero;
        this.nombreDuenho = nombreDuenho;
        this.dni = dni;
        this.descripcion = descripcion;
    }

    public Emergencia(String nombreMascota, String genero, String nombreDuenho, String dni, String descripcion, String ruta) {
        this.nombreMascota = nombreMascota;
        this.genero = genero;
        this.nombreDuenho = nombreDuenho;
        this.dni = dni;
        this.descripcion = descripcion;
        this.ruta = ruta;
    }
}
