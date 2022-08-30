package org.nestor.patrones.observer;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio extends Observable{
    private List<String> repo = new ArrayList<>();
    public void crearNewUsuario(String usuario){
        repo.add(usuario);
        notifyObservers(usuario);
    }
}
