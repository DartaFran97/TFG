package com.example.fencincoachapp;

public class Asalto {

    private Usuario tiradorLocal;
    private Usuario tiradorVisitante;
    private Usuario vencedor;

    private int tocadosLocal;
    private int tocadosVisitantes;

    public Asalto() {
    }

    public Usuario getTiradorLocal() {
        return tiradorLocal;
    }

    public void setTiradorLocal(Usuario tiradorLocal) {
        this.tiradorLocal = tiradorLocal;
    }

    public Usuario getTiradorVisitante() {
        return tiradorVisitante;
    }

    public void setTiradorVisitante(Usuario tiradorVisitante) {
        this.tiradorVisitante = tiradorVisitante;
    }

    public Usuario getVencedor() {
        return vencedor;
    }

    public void setVencedor(Usuario vencedor) {
        this.vencedor = vencedor;
    }

    public int getTocadosLocal() {
        return tocadosLocal;
    }

    public void setTocadosLocal(int tocadosLocal) {
        this.tocadosLocal = tocadosLocal;
    }

    public int getTocadosVisitantes() {
        return tocadosVisitantes;
    }

    public void setTocadosVisitantes(int tocadosVisitantes) {
        this.tocadosVisitantes = tocadosVisitantes;
    }
}
