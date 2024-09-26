package com.aluracursos.tiendaalura.moldes;

import java.util.Comparator;

public class ItemCompararPrecio implements Comparator <Item> {
    @Override
    public int compare(Item item1, Item item2) {
        return Double.compare(item1.getPrecio(), item2.getPrecio());
    }
}
