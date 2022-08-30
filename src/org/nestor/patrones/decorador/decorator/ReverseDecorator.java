package org.nestor.patrones.decorador.decorator;

import org.nestor.patrones.decorador.Formateable;

public class ReverseDecorator extends TextoDecorador {
    public ReverseDecorator(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder(texto.darFormato());
        return sb.reverse().toString();
    }
}
