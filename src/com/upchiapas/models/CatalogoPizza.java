package com.upchiapas.models;

public class CatalogoPizza {

    public CatalogoPizza(){
    }

    public void nombresPizza(String[] nombre, int arraylength) {
        String [] nombreRecibo = new String [arraylength];
        for(int i =0; i< nombreRecibo.length; i++) {
            nombreRecibo[i] = nombre[i];
        }

        for(int i =0; i< nombreRecibo.length; i++) {
            System.out.println("Especialidad: "+ nombreRecibo[i]);
        }

    }


}
