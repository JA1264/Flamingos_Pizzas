package com.upchiapas.models;

public class OrdenCompra {

    private int id;
    private String nombrePedido;
    private int tipoPizza;

    public OrdenCompra() {
        nombrePedido = "";
        id = 0;
        tipoPizza = 0;
    }

    public OrdenCompra(String np, int id2, int tp) {
        nombrePedido = np;
        id = id2;
        tipoPizza = tp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePedido() {
        return nombrePedido;
    }

    public void setNombrePedido(String nombrePedido) {
        this.nombrePedido = nombrePedido;
    }

    public int getTipoPizza() {
        return tipoPizza;
    }

    public void setTipoPizza(int tipoPizza) {
        this.tipoPizza = tipoPizza;
    }

}
