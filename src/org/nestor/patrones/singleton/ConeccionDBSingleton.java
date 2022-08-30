package org.nestor.patrones.singleton;

public class ConeccionDBSingleton {
    private static ConeccionDBSingleton instancia;

    private ConeccionDBSingleton(){
        System.out.println("Conectandose a la base de datos");
    }

    public static ConeccionDBSingleton getInstancia(){
        if (instancia == null ){
            instancia = new ConeccionDBSingleton();
        }
        return instancia;
    }
}
