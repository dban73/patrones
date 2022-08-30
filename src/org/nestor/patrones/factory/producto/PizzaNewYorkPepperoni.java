package org.nestor.patrones.factory.producto;

import org.nestor.patrones.factory.PizzaProduct;

public class PizzaNewYorkPepperoni extends PizzaProduct {
    public PizzaNewYorkPepperoni() {
        super();
        nombre = "Pizza pepperoni New York";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso Mozarella");
        ingredientes.add("Extra peperonni");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("cocinando por 40 min");
    }

    @Override
    public void cortar() {
        System.out.println("Cortar rebanadas triangulares");
    }
}
