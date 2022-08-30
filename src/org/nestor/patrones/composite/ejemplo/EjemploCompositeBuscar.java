package org.nestor.patrones.composite.ejemplo;

import org.nestor.patrones.composite.Archivo;
import org.nestor.patrones.composite.Directorio;

public class EjemploCompositeBuscar {
    public static void main(String[] args) {
        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("Patron-Composite.docx"));
        Directorio stream = new Directorio("Api Stream");
        stream.addComponente(new Archivo("stream-map.docx"));

        java.addComponente(stream);

        doc.addComponente(java);
        doc.addComponente(new Archivo("cv-docx"));
        doc.addComponente(new Archivo("logo-jpge"));

        boolean encontrado = doc.buscar("patron-composite.docx");
        System.out.println("Encontrado \"patron-composite.docx\": " + encontrado);

        encontrado = doc.buscar(("api Stream"));
        System.out.println("Encontradp api Stream: "+ encontrado);
       // System.out.println(doc.mostrar(0));
        encontrado =doc.buscar("cv.doc");
        System.out.println("Encontrado cv-docx "+ encontrado);
    }
}
