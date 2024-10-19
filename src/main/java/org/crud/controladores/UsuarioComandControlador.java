package org.crud.controladores;

import org.crud.clases.RegistrarUsuarioCommand;

public class UsuarioComandControlador {
    private UsuarioCommandService usuarioCommandService;

    public UsuarioComandControlador(UsuarioCommandService commandService) {
        this.usuarioCommandService = commandService;
    }

    public void registrarUsuario(RegistrarUsuarioCommand command) {
        usuarioCommandService.manejarRegistrarUsuario(command);
    }
}