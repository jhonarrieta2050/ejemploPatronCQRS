package org.crud.interfaces;

public interface QueryRepositorioInter<T> {
    T buscarPorId(int id);
}