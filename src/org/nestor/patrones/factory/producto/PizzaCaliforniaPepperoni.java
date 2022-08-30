package org.nestor.patrones.factory.producto;

import org.nestor.patrones.factory.PizzaProduct;

public class PizzaCaliforniaPepperoni extends PizzaProduct {
    public PizzaCaliforniaPepperoni() {
        super();
        nombre = "Pizza California Pepperoni";
        masa= "Masa a la piedra gruesa";
        salsa ="Salsa Picante";
        ingredientes.add("pepperoni");
        ingredientes.add("extra queso");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("cocinar a 50 grados");
    }

    @Override
    public void cortar() {
        System.out.println("rebanar en piezas triangulares");
    }
}
