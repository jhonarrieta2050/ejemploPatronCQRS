package org.crud.clases;

public class UsuarioBiblioteca {
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correoElectronico;

    public UsuarioBiblioteca(int id, String nombre, String direccion, String telefono, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }


    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
}