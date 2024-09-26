package com.aluracursos.tiendaalura.moldes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tienda {

    private List<Item> productosComprados;
    private TarjetaDeCredito tarjeta;



    public Tienda( TarjetaDeCredito tarjeta) {
        this.productosComprados = new ArrayList<>();
        this.tarjeta = tarjeta;
    }

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    public List<Item> getProductosComprados() {
        return productosComprados;
    }

    public String mostrarMenuCategorias() {
        System.out.println("\nElija una categoría:");
        System.out.println("1. Alimento");
        System.out.println("2. Moda");
        System.out.println("3. Electrodoméstico");
        System.out.print("Seleccione una opción: ");

        Scanner leer = new Scanner(System.in);
        int opcion = Integer.parseInt(leer.nextLine());

        switch (opcion) {
            case 1:
                return "Alimento";
            case 2:
                return "Moda";
            case 3:
                return "Electrodoméstico";
            default:
                return "Categoría desconocida";
        }
    }

    public void agregarProducto(Item producto){
        if(tarjeta.restarSaldo(producto.getPrecio())){
            productosComprados.add(producto);
            ordenarListaProducto();
        }else{
            System.out.println("Saldo insuficiente, no se pudo realizar la compra");
        }
    }

    public void mostrarProducto(){
        for (Item items : productosComprados ){
            System.out.println(items);
        }
    }

    public void ordenarListaProducto(){

        Collections.sort(productosComprados,new ItemCompararPrecio());

    }

    public void mostrarSaldo(){
        System.out.println("\nSu saldo actual es: " + tarjeta.getSaldo() + "$");
    }


}
