package org.nestor.patrones.decorador.decorator;

import org.nestor.patrones.decorador.Formateable;

abstract public class TextoDecorador implements Formateable {
    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}
