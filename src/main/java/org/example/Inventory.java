package org.example;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;                   // private List <int> numero;

    public Inventory(){  // constructor             public Inventory {
        items = new ArrayList<>(); //           // numeros = new ArrayList<>();
    }
    public void addItem(Item item){            // public void addNumeros (int numero).
        items.add(item);                       // numeros.add(numero)
    }

    public void removeItem(Item item) throws ItemNotFoundException{
        if(!items.contains(item)){
            throw new ItemNotFoundException( "Item not Found! ");
        }
        items.remove(item);  // se o item estiver na lista será removido por esse metodo.
    }
}
