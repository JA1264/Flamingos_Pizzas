import com.upchiapas.models.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        CatalogoPizza catalogo = new CatalogoPizza();
        String[] nombre = {"4 QUESOS", "MEXICANA", "HAWAIANA", "PEPERONI"};
        OrdenCompra nombrePedido[] = new OrdenCompra[2];
        ItemCompra cantidadOrden[] = new ItemCompra[2];

        String nombrePedido1="";
        int vid=0;
        int TPizza=0;
        int CaPe=0;
        int TotalOr=0;

        byte Cant=0;
        byte OP=0;

        System.out.println("");
        System.out.println("FLAMINGOS PIZZA´S");

        do {

            System.out.println("");
            System.out.println("1. MOSTRAR CATALOGO DE ESPECIALIDADES.");
            System.out.println("2. LEVANTAR ORDEN");
            System.out.println("3. REPORTE DE LA VENTAS");
            System.out.println("4. SALIR");

            System.out.print("SELECCIONE SU OPCION: ");
            OP = teclado.nextByte();

            switch(OP) {
                case 1:
                    System.out.println("");
                    catalogo.nombresPizza(nombre, nombre.length);
                    break;
                case 2:
                    System.out.println("CUANTOS PEDIDOS VA A RELIZAR: ");
                    CaPe = teclado.nextInt();

                    for(int i=0; i<nombrePedido.length; i++) {
                        teclado.nextLine();
                        System.out.println("INTRODUZCA SU NOMBRE: ");
                        nombrePedido1 = teclado.nextLine();
                        System.out.println("INTRODUCE TU ID: ");
                        vid = teclado.nextInt();
                        System.out.println("INTRODUCE EL TIPO DE PIZZA: ");
                            TPizza = teclado.nextInt();
                        byte candidad = (byte) i;
                        cantidadOrden[i] = new ItemCompra(Cant=(byte)i);
                        nombrePedido[i] = new OrdenCompra(nombrePedido1, vid, TPizza);
                    }

                    for(int i=0; i<nombrePedido.length; i++) {
                        System.out.println(nombrePedido[i].getNombrePedido()+" "+nombrePedido[i].getId()+" "+nombrePedido[i].getTipoPizza());
                    }
                    break;
                case 3:
                    for(int i=0; i<cantidadOrden.length; i++) {
                        TotalOr = cantidadOrden[i].getCantidad();
                    }
                    TotalOr= TotalOr+1;
                    System.out.println("");
                    System.out.println("LA CANTIDAD DE PEDIDOS REALIZADOS SON: "+ TotalOr+ " PEDIDOS");
                    break;
            }
        }while(OP!=4);
        System.out.println("");
        System.out.println("TERMINO DEL PROGRAMA");
    }

}
