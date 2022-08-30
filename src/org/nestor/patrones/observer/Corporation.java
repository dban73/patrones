package org.nestor.patrones.observer;

public class Corporation extends Observable{
    private String nombre;
    private Double precio;

    public Corporation(String nombre,Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
    public void modificaPrecio(Double precio){
        this.precio = precio;
        notifyObservers();
    }

    @Override
    public String toString() {
        return getNombre() + " Nuevo precio $" +
                getPrecio();
    }
}
