package com.example.finca.model;

public class cultivo {
    private int id;
    private String tipo;
    private double superficie;
    private int riego;

    public cultivo(int id, String tipo, double superficie, int riego) {
        this.id = id;
        this.tipo = tipo;
        this.superficie = superficie;
        this.riego = riego;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getRiego() {
        return riego;
    }

    public void setRiego(int riego) {
        this.riego = riego;
    }
}
