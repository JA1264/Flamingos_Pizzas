package com.upchiapas.models;

public class OrdenCompra {

    private int id;
    private String nombrePedido;
    private String tipoPizza;
    private String vector[];
    //private String ordenarBuena;

    public OrdenCompra() {
        nombrePedido = "";
        id = 0;
        tipoPizza = "";
    }

    public OrdenCompra(String np, int id2, String tp) {
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

    public String getTipoPizza() {
        return tipoPizza;
    }

    public void setTipoPizza(String tipoPizza) {
        this.tipoPizza = tipoPizza;
    }

    public OrdenCompra( String vector[] ) {
        this.vector = vector;
    }

    public void ordenar() {
        for( int i = 0; i<vector.length;i++) {
            for (int j=0; j<vector.length && i != j; j++) {
                if(vector[i].compareToIgnoreCase(vector[j]) < 0) {
                    String aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }
    }

    public void mostrar() {
        for(String a : vector){
            System.out.println(a);
        }

    }

}
