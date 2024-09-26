package com.aluracursos.tiendaalura.moldes;

public class Item {

    private String nombreItem;
    private double precio;

    public Item(String nombre, double precio) {
        this.nombreItem = nombre;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreItem;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "\nproducto: " + nombreItem +
                "- precio: " + precio + "$";
    }
}
