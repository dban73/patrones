package org.nestor.patrones.decorator2;

import org.nestor.patrones.decorator2.decorators.ConChocolateDecorator;
import org.nestor.patrones.decorator2.decorators.ConCremaDecorator;
import org.nestor.patrones.decorator2.decorators.ConLecheDecorator;

public class EjemploDecoratorCafe {
    public static void main(String[] args) {
        Configurable cafe = new Cafe(7,"Cafe Mocha");

        ConCremaDecorator conCremaDecorator = new ConCremaDecorator(cafe);
        ConLecheDecorator conLecheDecorator = new ConLecheDecorator(conCremaDecorator);
        ConChocolateDecorator conChocolateDecorator = new ConChocolateDecorator(conLecheDecorator);

        System.out.println("Precio del cafe mocha es: "+ conChocolateDecorator.getPrecioBase());
        System.out.println("Los ingredientes son: "+ conChocolateDecorator.getIngredientes());

        Configurable cafe2 = new Cafe(5,"Cafe Xpress");

        ConCremaDecorator conCremaDecorator1 = new ConCremaDecorator(cafe2);

        System.out.println("Precio del cafe: "+ conCremaDecorator1.getPrecioBase());
        System.out.println("ingredientes: "+ conCremaDecorator1.getIngredientes());

        Configurable capuchino = new Cafe(3,"CAfe Cappuchino");
        System.out.println("Precio cafe: "+ capuchino.getPrecioBase());
        System.out.println("INgredientes: " + capuchino.getIngredientes());
    }
}
