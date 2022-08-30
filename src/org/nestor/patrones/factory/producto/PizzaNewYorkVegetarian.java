package org.nestor.patrones.factory.producto;

import org.nestor.patrones.factory.PizzaProduct;

public class PizzaNewYorkVegetarian extends PizzaProduct {

    public PizzaNewYorkVegetarian() {
        super();
        nombre = "pizza vegetarian New York";
        masa = "Masa integral vegana";
        salsa = "salsa de tomate";
        ingredientes.add("Queso Vegano");
        ingredientes.add("Tomate");
        ingredientes.add("aceituna");
        ingredientes.add("Espinacas");
        ingredientes.add("Berenjenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 imin");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas");
    }

}
