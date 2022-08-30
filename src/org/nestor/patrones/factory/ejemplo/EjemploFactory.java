package org.nestor.patrones.factory.ejemplo;

import org.nestor.patrones.factory.PizzaProduct;
import org.nestor.patrones.factory.PizzeriaCaliforniaFactory;
import org.nestor.patrones.factory.PizzeriaNewYorkFactory;
import org.nestor.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory ca = new PizzeriaCaliforniaFactory();

        PizzaProduct pizza = ca.ordenarPizza("queso");
        System.out.println("anyone ordena la pizza "+ pizza.getNombre());

        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("Nestor ask for a pizza " + pizza.getNombre());

        pizza = ca.ordenarPizza("vegetariana");
        System.out.println("Alejandro ask for a pizza " + pizza.getNombre());

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Alejandro ask for a pizza " + pizza.getNombre());
    }
}
