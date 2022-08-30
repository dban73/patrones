package org.nestor.patrones.factory;
import java.util.ArrayList;
import java.util.List;

abstract  public class PizzaProduct {
    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public PizzaProduct() {
        this.ingredientes = new ArrayList<>();
    }
    public void prepared(){
        System.out.println("!----------------praparado-----------------------!"+ nombre);
        System.out.println("--Selaccionar masa--"+ masa);
        System.out.println("--Agregando Salsa--"+ salsa);
        System.out.println("--Agregando ingredientes--");
        this.ingredientes.forEach(System.out::println);
    }
    abstract public void cocinar();
    abstract public void cortar();

    public void empaquetar(){
        System.out.println("Poniento la pizza en una caja de empaque");
    }

    @Override
    public String toString() {
        return "PizzaProduct{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }

    public String getNombre() {
        return nombre;
    }
}
