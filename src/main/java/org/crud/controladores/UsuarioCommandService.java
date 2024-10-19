package org.crud.controladores;

import org.crud.clases.RegistrarUsuarioCommand;
import org.crud.clases.UsuarioBiblioteca;
import org.crud.interfaces.ComandRepositorioInter;

public class UsuarioCommandService {
    private ComandRepositorioInter<UsuarioBiblioteca> comandRepository;

    public UsuarioCommandService(ComandRepositorioInter<UsuarioBiblioteca> repository) {
        this.comandRepository = repository;
    }

    public void manejarRegistrarUsuario(RegistrarUsuarioCommand command) {
        UsuarioBiblioteca usuario = new UsuarioBiblioteca(0, command.getNombre(), command.getDireccion(), command.getTelefono(), command.getCorreoElectronico());
        comandRepository.guardar(usuario);
    }
}