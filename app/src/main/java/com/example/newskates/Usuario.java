package com.example.newskates;

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String contraseña;

    public Usuario(int id, String nombre, String email, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;

    }
    public Usuario() { }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getcontraseña() { return contraseña; }
    public void setcontraseña(String password) { this.contraseña=password;}
}


