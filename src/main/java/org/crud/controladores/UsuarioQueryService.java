package org.crud.controladores;

import org.crud.clases.UsuarioBiblioteca;
import org.crud.interfaces.QueryRepositorioInter;

public class UsuarioQueryService {
    private QueryRepositorioInter<UsuarioBiblioteca> queryRepository;

    public UsuarioQueryService(QueryRepositorioInter<UsuarioBiblioteca> repository) {
        this.queryRepository = repository;
    }

    public UsuarioBiblioteca obtenerUsuarioPorId(int id) {
        return queryRepository.buscarPorId(id);
    }
}