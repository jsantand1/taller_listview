package com.example.delli3.taller_clase;

public class Guardar_Celular {
    private String marca;
    private String color;
    private double precio;

    public Guardar_Celular(String marca, String color, double precio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void guardar(){Dato.guardar(this);}
}
