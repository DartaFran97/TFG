package com.example.fencincoachapp;



import java.io.File;
import java.util.Calendar;
import java.util.List;

public class Sesion {

    private int id;
    private List<Usuario> asistentes;
    private List<Usuario> responsables;
    private int capacidadUsuarios;
    private Calendar fecha_sesion;
    private File archivo;


    public Sesion() {
    }

    public Sesion(int id, List<Usuario> asistentes, List<Usuario> responsables, int capacidadUsuarios, Calendar fecha_sesion, File archivo) {
        this.id = id;
        this.asistentes = asistentes;
        this.responsables = responsables;
        this.capacidadUsuarios = capacidadUsuarios;
        this.fecha_sesion = fecha_sesion;
        this.archivo = archivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Usuario> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(List<Usuario> asistentes) {
        this.asistentes = asistentes;
    }

    public List<Usuario> getResponsables() {
        return responsables;
    }

    public void setResponsables(List<Usuario> responsables) {
        this.responsables = responsables;
    }

    public int getCapacidadUsuarios() {
        return capacidadUsuarios;
    }

    public void setCapacidadUsuarios(int capacidadUsuarios) {
        this.capacidadUsuarios = capacidadUsuarios;
    }

    public Calendar getFecha_sesion() {
        return fecha_sesion;
    }

    public void setFecha_sesion(Calendar fecha_sesion) {
        this.fecha_sesion = fecha_sesion;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
}
