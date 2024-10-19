package org.crud.repositorios;

import org.crud.clases.UsuarioBiblioteca;
import org.crud.interfaces.ComandRepositorioInter;

import java.util.ArrayList;
import java.util.List;

public class ComandRepositorioImp implements ComandRepositorioInter<UsuarioBiblioteca> {

    private List<UsuarioBiblioteca> usuarios = new ArrayList<>();
    private int idCounter = 1;  // Para generar IDs únicos

    @Override
    public void guardar(UsuarioBiblioteca usuario) {
        usuario = new UsuarioBiblioteca(idCounter++, usuario.getNombre(), usuario.getDireccion(), usuario.getTelefono(), usuario.getCorreoElectronico());
        usuarios.add(usuario);
        System.out.println("Usuario registrado: " + usuario.getNombre());
    }

    public List<UsuarioBiblioteca> getUsuarios() {
        return usuarios;
    }
}