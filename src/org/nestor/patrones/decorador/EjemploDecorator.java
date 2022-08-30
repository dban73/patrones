package org.nestor.patrones.decorador;

import org.nestor.patrones.decorador.decorator.MayusculasDecorator;
import org.nestor.patrones.decorador.decorator.RemplazarEspacioDecorator;
import org.nestor.patrones.decorador.decorator.ReverseDecorator;
import org.nestor.patrones.decorador.decorator.SubrayadoDecorator;

public class EjemploDecorator {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Nestor");
        MayusculasDecorator mayuscula = new MayusculasDecorator(texto);
        ReverseDecorator reverse = new ReverseDecorator(mayuscula);
        SubrayadoDecorator subrayadoDecorator = new SubrayadoDecorator(reverse);
        RemplazarEspacioDecorator remplazarEspacioDecorator = new RemplazarEspacioDecorator(subrayadoDecorator);

        System.out.println(remplazarEspacioDecorator.darFormato());

    }
}
