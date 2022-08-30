package org.nestor.patrones.factory.producto;

import org.nestor.patrones.factory.PizzaProduct;

public class PizzaCaliforniaVegetariana extends PizzaProduct {

    public PizzaCaliforniaVegetariana() {
        super();
        nombre ="Pizza California Vegetariana";
        masa = "masa delgada";
        salsa = "Salsa light";
        ingredientes.add("Queso Mozarella");
        ingredientes.add("Aceituna");
        ingredientes.add("Espinacas");
        ingredientes.add("Cebolla");
        ingredientes.add("Berenjena");
    }

    @Override
    public void cocinar() {
        System.out.println("cocinar 20 min a 180");
    }

    @Override
    public void cortar() {
        System.out.println("revanar en rodajas");
    }
}
