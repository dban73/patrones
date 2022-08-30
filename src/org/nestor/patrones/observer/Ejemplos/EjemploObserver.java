package org.nestor.patrones.observer.Ejemplos;

import org.nestor.patrones.composite.Componente;
import org.nestor.patrones.observer.Corporation;

public class EjemploObserver {
    public static void main(String[] args) {
        Corporation google = new Corporation("Google", 1500.00);
        google.addObserver((observable,obj) -> {
            System.out.println("John: " + observable);
        });
        google.addObserver((observable, obj) -> {
            System.out.println("Andres: " + observable);
        });
        google.addObserver((observable, obj) -> {
            System.out.println("Maria: " + observable);
        });
        google.modificaPrecio(2000.15);
    }
}
