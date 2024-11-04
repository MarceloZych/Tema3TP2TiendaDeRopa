package com.example.tema3tp2tiendaderopa.model;

import java.util.*;

public class Articulo {
    private String nombre;
    private String talle;
    private List<String> colores;
    private double precio;
    private String marca;
    private int cantidad;

    public Articulo(String nombre, String talle, List<String> colores, double precio, String marca, int cantidad) {
        this.nombre = nombre;
        this.talle = talle;
        this.colores = colores;
        this.precio = precio;
        this.marca = marca;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public List<String> getColores() {
        return colores;
    }

    public void setColores(List<String> colores) {
        this.colores = colores;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
