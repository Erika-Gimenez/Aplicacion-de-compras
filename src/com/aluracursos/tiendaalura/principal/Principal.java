package com.aluracursos.tiendaalura.principal;

import com.aluracursos.tiendaalura.moldes.Producto;
import com.aluracursos.tiendaalura.moldes.TarjetaDeCredito;
import com.aluracursos.tiendaalura.moldes.Tienda;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        /*
        cosas que faltan validacion de datos
        mensaje de que salga con el saldo insuficiente
        mostras el saldo insuficiente

        */

        Scanner leer = new Scanner(System.in);

        double montoLimite = 0;
        double precioDelProducto = 0;
        String nombreDelProducto = "";
        String condicionRespuesta= "";
        String categoria = "";
        boolean seguircomprando= true;

        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t*** BIENVENIDOS A LA TIENDA ALURI ***");

        System.out.println("\nIngresa el monto limite de tu tarjeta: ");
        montoLimite= Double.parseDouble(leer.nextLine());

        TarjetaDeCredito tarjetaMontoLimite = new TarjetaDeCredito(montoLimite);

        Tienda tienda =new Tienda(tarjetaMontoLimite);
        while (seguircomprando){

            categoria = tienda.mostrarMenuCategorias();

            System.out.println("\nIngrese el nombre del producto:");
            nombreDelProducto = leer.nextLine();

            System.out.println("Ingrese el precio del producto:");
            precioDelProducto = Double.parseDouble(leer.nextLine());

            Producto producto = new Producto(nombreDelProducto, precioDelProducto, categoria);
            tienda.agregarProducto(producto);
            System.out.println("\n¡Tu compra a finalizado con exito!");
            System.out.println("---------------------------------------------------");
            System.out.println("\nDesea seguir comprando: SI O NO");
            condicionRespuesta = leer.nextLine();
            if (condicionRespuesta.equalsIgnoreCase("si")){
                seguircomprando = true;
            }else {
                seguircomprando = false;
            }

        }
        System.out.println("\n********************************");
        System.out.println("\n**Tu ticket-Tienda Aluri**\n");
        tienda.mostrarProducto();
        System.out.println("********************************");

        tienda.mostrarSaldo();


    }
}
