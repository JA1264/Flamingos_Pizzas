package com.upchiapas.pizza;

import com.upchiapas.models.CatalogoPizza;
import com.upchiapas.models.ItemCompra;
import com.upchiapas.models.OrdenCompra;
import com.upchiapas.models.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] A = new String[2];
        CatalogoPizza catalogo = new CatalogoPizza();
        String[] nombre = {"4 QUESOS.", "MEXICANA.", "HAWAIANA.", "PEPERONI."};
        String[] arregloAux = new String[2];
        OrdenCompra nombrePedido[] = new OrdenCompra[2];
        ItemCompra cantidadOrden[] = new ItemCompra[2];

        String NoPe1="", aux, TiPi="",aux1;
        int ID2=0,cantiPedi=0,totalOr=0,Position = 5;
        byte canti=0, op=0;

        System.out.println("\n"+"FLAMINGOS PIZZA´S");

        do {
            System.out.println("\n"+"1. MOSTRAR CATALOGO DE ESPECIALIDADES.");
            System.out.println("2. LEVANTAR ORDEN DE COMPRA");
            System.out.println("3. REPORTE DE VENTAS");
            System.out.println("4. SALIR");

            System.out.print("CUAL SERIA LA OPCION: ");
            op = teclado.nextByte();

            switch(op) {
                case 1:
                    System.out.println("");
                    catalogo.nombresPizza(nombre, nombre.length);
                    break;
                case 2:
                    System.out.println("CUANTOS PEDIDOS VA A REALIZAR: ");
                    cantiPedi = teclado.nextInt();

                    for(int i=0; i<nombrePedido.length; i++) {
                        teclado.nextLine();
                        System.out.println("INTRODUCE EL NOMBRE: ");
                        NoPe1 = teclado.nextLine();
                        System.out.println("INTRODUCE EL TIPO DE PIZZA: ");
                        TiPi = teclado.nextLine();
                        System.out.println("INTRODUCE TU ID: ");
                        ID2 = teclado.nextInt();

                        cantidadOrden[i] = new ItemCompra(canti=(byte)i);
                        nombrePedido[i] = new OrdenCompra(NoPe1, ID2, TiPi);
                    }



                    for(int i=0; i<nombrePedido.length; i++)
                        arregloAux[i] += nombrePedido[i].getNombrePedido()+", CON IDENTIFICADOR: "+nombrePedido[i].getId()+", PIDIO UNA PIZZA: "+nombrePedido[i].getTipoPizza();

                    for(int i=0; i<nombrePedido.length; i++)
                        arregloAux[i] = arregloAux[i].substring(4,Position) + arregloAux[i].substring(Position+0);

                    for(int i=0; i<nombrePedido.length; i++)
                        A[i]=arregloAux[i];

                    for(int i=1; i<=A.length; i++)
                        for(int j=0; j<A.length-i; j++)
                            if( A[j].compareTo( A[j+1] ) > 0 ) {
                                aux   = A[j];
                                A[j]  = A[j+1];
                                A[j+1]= aux;
                            }

                    for(int i=0; i<A.length; i++)
                        System.out.println("PEDIDO A NOMBRE DE: "+A[i] +" " );
                    break;
                case 3:
                    for(int i=0; i<cantidadOrden.length; i++)
                        totalOr = cantidadOrden[i].getCantidad();

                    totalOr= totalOr+1;
                    System.out.println("");
                    System.out.println("LA CANTIDAD DE PEDIDOS A REALIZAR SON: "+ totalOr+ " PEDIDOS");
                    break;
            }

        }while(op!=4);
        System.out.println("");
        System.out.println("PROGRAMA FINALIZADO");
    }
}
