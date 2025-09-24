package com.example.newskates;

public class Admin extends Usuario{
    private String nivelAcceso;

    public Admin(int id, String nombre, String email, String password, String nivelAcceso) {
        super(id, nombre, email, password);
        this.nivelAcceso = nivelAcceso;
    }

    public String getNivelAcceso() { return nivelAcceso; }
    public void setNivelAcceso(String nivelAcceso) { this.nivelAcceso = nivelAcceso;}

}