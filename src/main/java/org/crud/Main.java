package org.crud;

import org.crud.clases.RegistrarUsuarioCommand;
import org.crud.clases.UsuarioBiblioteca;
import org.crud.controladores.UsuarioComandControlador;
import org.crud.controladores.UsuarioCommandService;
import org.crud.controladores.UsuarioQueryControlador;
import org.crud.controladores.UsuarioQueryService;
import org.crud.repositorios.ComandRepositorioImp;
import org.crud.repositorios.UsuarioQueryRepositorioImp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ComandRepositorioImp comandRepository = new ComandRepositorioImp();
        UsuarioCommandService commandService = new UsuarioCommandService(comandRepository);
        UsuarioComandControlador commandController = new UsuarioComandControlador(commandService);


        RegistrarUsuarioCommand registrarUsuario = new RegistrarUsuarioCommand("Pedro", "Calle Falsa 123", "555-1234", "pedro@example.com");
        commandController.registrarUsuario(registrarUsuario);

        UsuarioQueryRepositorioImp queryRepository = new UsuarioQueryRepositorioImp(comandRepository);
        UsuarioQueryService queryService = new UsuarioQueryService(queryRepository);
        UsuarioQueryControlador queryController = new UsuarioQueryControlador(queryService);

        UsuarioBiblioteca usuario = queryController.obtenerUsuarioPorId(1);
        if (usuario != null) {
            System.out.println("usuario encontrado: " + usuario.getNombre() + ", direccion: " + usuario.getDireccion());
        } else {
            System.out.println("usuario no encontrado");
        }
    }
}