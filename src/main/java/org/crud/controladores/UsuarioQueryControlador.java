package org.crud.controladores;

import org.crud.clases.UsuarioBiblioteca;

public class UsuarioQueryControlador {
    private UsuarioQueryService usuarioQueryService;

    public UsuarioQueryControlador(UsuarioQueryService queryService) {
        this.usuarioQueryService = queryService;
    }

    public UsuarioBiblioteca obtenerUsuarioPorId(int id) {
        return usuarioQueryService.obtenerUsuarioPorId(id);
    }
}