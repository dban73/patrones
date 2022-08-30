package org.nestor.patrones.factory.producto;

import org.nestor.patrones.factory.PizzaProduct;

public class PizzaNewYorkItaliana extends PizzaProduct {
    public PizzaNewYorkItaliana() {
        super();
        nombre="Pizza Italiana New York";
        masa="Masa Gruesa";
        salsa= "Salasa de tomate italiano con carne";
        ingredientes.add("Queso Italiano");
        ingredientes.add("Aceituna");
        ingredientes.add("Jamon");
        ingredientes.add("Choricillo");
        ingredientes.add("Mushroom");
    }
    @Override
    public void cocinar() {
        System.out.println("cocinando la pizza por 30 min ");
    }

    @Override
    public void cortar() {
        System.out.println("cortando la pizza en rebanadas rectangulares");
    }
}
