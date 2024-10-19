package org.crud.repositorios;

import org.crud.clases.UsuarioBiblioteca;
import org.crud.interfaces.QueryRepositorioInter;

public class UsuarioQueryRepositorioImp implements QueryRepositorioInter<UsuarioBiblioteca> {

    private ComandRepositorioImp comandRepository;

    public UsuarioQueryRepositorioImp(ComandRepositorioImp repository) {
        this.comandRepository = repository;
    }

    @Override
    public UsuarioBiblioteca buscarPorId(int id) {
        return comandRepository.getUsuarios().stream()
                .filter(usuario -> usuario.getId() == id)
                .findFirst()
                .orElse(null);
    }
}