package org.nestor.patrones.factory.producto;

import org.nestor.patrones.factory.PizzaProduct;

public class PizzaCaliforniaQueso extends PizzaProduct {
    public PizzaCaliforniaQueso() {
        super();
        nombre = "Pizza CAlifonia Queso";
        masa = "Masa a la piedra delgada";
        salsa= "salsa de tomate rucula";
        ingredientes.add("extra Queso Mozarella");
        ingredientes.add("Cebolla");
        ingredientes.add("Queso azul");
    }

    @Override
    public void cocinar() {
        System.out.println("cocinar 59 min a 80 grados");
    }

    @Override
    public void cortar() {
        System.out.println("rebanadas redondas");
    }
}
