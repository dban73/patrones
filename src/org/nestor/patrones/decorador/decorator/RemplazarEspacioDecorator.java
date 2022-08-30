package org.nestor.patrones.decorador.decorator;

import org.nestor.patrones.decorador.Formateable;

public class RemplazarEspacioDecorator extends TextoDecorador{

    public RemplazarEspacioDecorator(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ","_");
    }
}
