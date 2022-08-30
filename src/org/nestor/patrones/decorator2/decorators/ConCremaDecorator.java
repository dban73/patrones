package org.nestor.patrones.decorator2.decorators;

import org.nestor.patrones.decorator2.Configurable;

public class ConCremaDecorator extends CafeDecorator{
    public ConCremaDecorator(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase()+ 2.5f ;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes()+"Crema";
    }
}
