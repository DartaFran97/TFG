package com.example.fencingcoach;

public class Usuario {
    private int id;
    private String name;
    private String contrasena;
    private String categoria;
    private String correo;
    private String arma;
    private String manodominate;
    private boolean alta;

    public Usuario() {
    }

    public Usuario(int id, String name, String contrasena, String categoria, String correo, String arma, String manodominate) {
        this.id = id;
        this.name = name;
        this.contrasena = contrasena;
        this.categoria = categoria;
        this.correo = correo;
        this.arma = arma;
        this.manodominate = manodominate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getManodominate() {
        return manodominate;
    }

    public void setManodominate(String manodominate) {
        this.manodominate = manodominate;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }
}
