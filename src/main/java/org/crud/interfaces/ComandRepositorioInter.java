package org.crud.interfaces;

import java.util.List;

public interface ComandRepositorioInter<T> {

    public void guardar(T usuario);
    public List<T> getUsuarios();
}
