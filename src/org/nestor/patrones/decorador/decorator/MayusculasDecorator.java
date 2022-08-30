package org.nestor.patrones.decorador.decorator;

import org.nestor.patrones.decorador.Formateable;

public class MayusculasDecorator extends TextoDecorador{
    public MayusculasDecorator(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
