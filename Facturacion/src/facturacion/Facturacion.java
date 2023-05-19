package facturacion;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Examen práctico 19/05/2023
 * @author dani
 */
public class Facturacion {

    public static Scanner sc = new Scanner(System.in);
    public static final String[] DATOS_CLIENTE = {"Nombre y apellidos", "Direccion", "Codigo Postal", "Poblacion", "DNI", "NºFactura", "Fecha"};
    public static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.##");
    
    public static void main(String[] args) {

        // DECLARACIÓN DE VARIABLES
        ArrayList<String> datosFactura = new ArrayList<String>();
        ArrayList<Integer> cantidades = new ArrayList<Integer>();
        ArrayList<String> descripciones = new ArrayList<String>();
        ArrayList<Double> preciosUnitarios = new ArrayList<Double>();
        ArrayList<Double> importesParcial = new ArrayList<Double>();

        //VISUALIZACION E INTRODUCCIÓN DE DATOS
        datosFactura = introducirDatosGenerales(DATOS_CLIENTE);
        introducirArticulos(cantidades, descripciones, preciosUnitarios, importesParcial);
        visualizarDatosGenerales(datosFactura, DATOS_CLIENTE);
        visualizarLiniasFactura(cantidades, descripciones, preciosUnitarios, importesParcial);
        
    }
    
    private static void introducirArticulos(
            ArrayList<Integer> cantidades,
            ArrayList<String> descripciones,
            ArrayList<Double> preciosUnitarios,
            ArrayList<Double> importesParcial) {
        int cantidad = 0;
        double pUnitario, importe, subtotal = 0.0, totalF = 0.0;

        do {
            System.out.println("Introduce cantidad para esta linea de factura: ");
            cantidad = sc.nextInt();
            if (cantidad > 0) {
                cantidades.add(cantidad);
                sc.nextLine();
                System.out.println("Introduce descripción del articulo: ");
          
                descripciones.add(sc.nextLine());

                do {
                    System.out.print("Introduce precio unitario: ");
                    pUnitario = sc.nextDouble();
                    if (pUnitario < 0) {
                        System.out.println("ERROR: El precio unitatrio tiene que ser mayor o igual que 0");
                    } else {
                        preciosUnitarios.add(pUnitario);
                    }
                } while (pUnitario < 0);
                importe = cantidad * pUnitario;
                importesParcial.add(importe);
                subtotal = subtotal + importe;

            } else if (cantidad < 0) {
                System.out.println("ERROR: la cantidad tiene que ser mayor que cero");
            }

        } while (cantidad != 0);

    }

    public static void visualizarLiniasFactura(
            ArrayList<Integer> cantidades,
            ArrayList<String> descripciones,
            ArrayList<Double> preciosUnitarios,
            ArrayList<Double> importesParcial) {

        double subtotal = 0.0, totalFactura = 0.0;
        double IVA = 0.21;

        for (int indice = 0; indice < cantidades.size(); indice++) {
            System.out.println(cantidades.get(indice) + " \t" + descripciones.get(indice) + "\t" + DECIMAL_FORMAT.format(preciosUnitarios.get(indice)) + "\t" + DECIMAL_FORMAT.format(importesParcial.get(indice)));
            importesParcial.add(cantidades.get(indice) * preciosUnitarios.get(indice));
            subtotal = subtotal + importesParcial.get(indice);
        }

        totalFactura = subtotal + (subtotal * IVA);

        System.out.println("Total bruto factura: " + DECIMAL_FORMAT.format(subtotal));
        System.out.println("Importe de IVA: " + DECIMAL_FORMAT.format(subtotal * IVA));
        System.out.println("Total bruto factura: " + DECIMAL_FORMAT.format(totalFactura));

    }

    public static void visualizarDatosGenerales(ArrayList<String> DatosCli, String[] Cabeceras) {

        int indice = 0;

        for (indice = 0; indice < Cabeceras.length; indice++) {
            System.out.println(Cabeceras[indice] +": "+ DatosCli.get(indice));
        }

    }

    public static ArrayList<String> introducirDatosGenerales(String[] Cabeceras) {
        ArrayList<String> datosCli = new ArrayList<String>();

        int indice = 0;
        String aux;
        do {
            System.out.println("Introduce " + DATOS_CLIENTE[indice]);

            aux = sc.nextLine();

            if (!aux.isEmpty()) {
                datosCli.add(aux);
                indice++;
            }

        } while (!aux.isEmpty() && indice < DATOS_CLIENTE.length);

        return datosCli;
    }

  
    public static double generarSubTotal(ArrayList<Double> importeParcial) {
        double suma = 0;

        for (int indice = 0; indice < importeParcial.size(); indice++) {
            suma += importeParcial.get(indice);
        }
        return suma;
    }

}
