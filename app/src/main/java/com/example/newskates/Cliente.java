package com.example.newskates;

public class Cliente extends Usuario {

    private String direccion;
    private String telefono;

    public Cliente(int id, String nombre, String email, String contraseña, String direccion, String telefono) {
        super(id,nombre, email, contraseña);
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono=telefono;}
}