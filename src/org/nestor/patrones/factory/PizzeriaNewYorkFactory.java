package org.nestor.patrones.factory;

import org.nestor.patrones.factory.producto.PizzaNewYorkItaliana;
import org.nestor.patrones.factory.producto.PizzaNewYorkPepperoni;
import org.nestor.patrones.factory.producto.PizzaNewYorkVegetarian;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{

    @Override
    PizzaProduct crearPizza(String tipo) {
        PizzaProduct producto = null;
        switch (tipo){
            case "vegetariana":
                producto = new PizzaNewYorkVegetarian();
                break;
            case "pepperoni":
                producto = new PizzaNewYorkPepperoni();
                break;
            case "italiana":
                producto = new PizzaNewYorkItaliana();
                break;
        }
        return producto;
    }
}
