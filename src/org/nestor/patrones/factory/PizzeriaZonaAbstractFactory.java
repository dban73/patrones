package org.nestor.patrones.factory;

abstract public class PizzeriaZonaAbstractFactory {
    public PizzaProduct ordenarPizza(String tipo){
        PizzaProduct pizza = crearPizza(tipo);
        System.out.println("Fabricando la Pizza " + pizza.getNombre() + "-----");
        pizza.prepared();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }
    abstract PizzaProduct crearPizza(String tipo);
}
