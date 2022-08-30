package org.nestor.patrones.decorator2.decorators;

import org.nestor.patrones.decorator2.Configurable;

public class ConLecheDecorator extends CafeDecorator{
    public ConLecheDecorator(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase()+ 3.7f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes()+ ", Agregamos Leche";
    }
}
