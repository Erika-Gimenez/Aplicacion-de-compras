package com.aluracursos.tiendaalura.moldes;

public class Producto extends Item{

    private String categoria;

    public Producto(String nombre, double precio , String categoria) {
        super(nombre, precio);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Categoria: " + categoria +  super.toString();
    }
}
