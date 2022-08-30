package org.nestor.patrones.singleton;

public class EjemploSingleton {
    public static void main(String[] args) {
        ConeccionDBSingleton conecctiondb = null;
        for (int i = 0; i < 10; i++) {
            conecctiondb = ConeccionDBSingleton.getInstancia();
            System.out.println("Con = " + conecctiondb);
        }
        ConeccionDBSingleton con2 = ConeccionDBSingleton.getInstancia();
        ConeccionDBSingleton con3 = ConeccionDBSingleton.getInstancia();
        boolean b1 = ((conecctiondb == con2) && (con2 == con3) && (conecctiondb == con3));
        System.out.println("b1 = " + b1);
    }
}
