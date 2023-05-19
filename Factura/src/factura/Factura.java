package factura;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Factura {

    public static void main(String[] args) {
        // DECLARACIÓN DE VARIABLES
        Scanner consola = new Scanner(System.in);

        ArrayList<String> DatosF = new ArrayList<String>();
        ArrayList<Integer> cantidades = new ArrayList<Integer>();
        ArrayList<String> descripciones = new ArrayList<String>();
        ArrayList<Double> PreciosUnitarios = new ArrayList<Double>();
        ArrayList<Double> importes_parcial = new ArrayList<Double>();

        final double IVA = 0.21;//DECLARACION DE LA CONSTANTE

        //String descripcion;
        double pUnitario, importe, subtotal = 0.0, totalF = 0.0;
        int indice;
        int cantidad = 0;
        String aux = null;

        //SoLICITUD DE DATOS POR CONSOLA
        //INTRODUCIR DATOS PARA FACTURAR
        do {
            System.out.println("Introduce datos factura: ");
            aux = consola.nextLine();
            if (!aux.isEmpty()) {
                DatosF.add(aux);
            }

        } while (!aux.isEmpty());

        //VISUALIZAR DATOS DEL ARRAY
        //Metodo1
        for (indice = 0; indice < DatosF.size(); indice++) {
            aux = DatosF.get(indice);
            System.out.println(aux); //System.out.println(DatosF.get(indice));
        }
        //Metodo 2
        for (String aux1 : DatosF) {
            System.out.println(aux1);
        }

        //Metodo 3
        DatosF.forEach((aux2) -> {
            System.out.println(aux2);
        });

        do {
            System.out.println("Introduce cantidad para esta linea de factura: ");
            cantidad = consola.nextInt();
            if (cantidad > 0) {
                cantidades.add(cantidad);
                consola.nextLine();//LIMPIAMOS BUFFER DEL TECLADO
                System.out.println("Introduce descripción del articulo: ");
                //descripcion=consola.nextLine();
                descripciones.add(consola.nextLine());

                do {
                    System.out.print("Introduce precio unitario: ");
                    pUnitario = consola.nextDouble();
                    if (pUnitario < 0) {
                        System.out.println("ERROR: El precio unitatrio tiene que ser mayor o igual que 0");
                    } else {
                        PreciosUnitarios.add(pUnitario);
                    }
                } while (pUnitario < 0);

                importe = cantidad * pUnitario;
                importes_parcial.add(importe);//importes_parcial.add(cantidad*pUnitario);

                subtotal = subtotal + importe;

            } else if (cantidad < 0) {
                System.out.println("ERROR: la cantidad tiene que ser mayor que cero");
            }

        } while (cantidad != 0);

        totalF = subtotal + (subtotal * IVA);//totalF=subtotal*(1+IVA)

        //VISUALIZACION DE DATOS
        for (indice = 0; indice < cantidades.size(); indice++) {
            System.out.println(cantidades.get(indice) + " \t" + descripciones.get(indice) + "\t" + PreciosUnitarios.get(indice) + "\t" + importes_parcial.get(indice));
        }
        System.out.println("Total bruto factura: " + subtotal);
        System.out.println("Importe de IVA: " + subtotal * IVA);
        System.out.println("Total bruto factura: " + totalF);

    }
}
