package facturacion17.pkg05.pkg2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Facturacion17052023 {

    public static Scanner sc = new Scanner(System.in);
    public static final String[] DATOS_CLIENTE = {"Nombre y Apellidos: ", "Dirección: ", "Codigo Postal: ", "Población: ", "Provincia: ", "DNI/NIF: ", "Nº Factura: "};
    public static final double IVA = 0.21;

    public static void main(String[] args) {
        ArrayList<String> DatosF = new ArrayList<String>();
        ArrayList<Integer> cantidades = new ArrayList<Integer>();
        ArrayList<String> descripciones = new ArrayList<String>();
        ArrayList<Double> PreciosUnitarios = new ArrayList<Double>();
        ArrayList<Double> importes_parcial = new ArrayList<Double>();
        double pUnitario, importe;
        int cantidad = 0;
        DatosF = Introducir_datos_Generales(DATOS_CLIENTE, DatosF);
        Visualizar_Datos_Generales(DATOS_CLIENTE, DatosF);
        do {
            System.out.println("Introduce cantidad para esta linea de factura: ");
            cantidad = sc.nextInt();
            if (cantidad > 0) {
                cantidades.add(cantidad);
                sc.nextLine();//LIMPIAMOS BUFFER DEL TECLADO
                System.out.println("Introduce descripción del articulo: ");
                //descripcion=consola.nextLine();
                descripciones.add(sc.nextLine());
                do {
                    System.out.print("Introduce precio unitario: ");
                    pUnitario = sc.nextDouble();
                    if (pUnitario < 0) {
                        System.out.println("ERROR: El precio unitatrio tiene que ser mayor o igual que 0");
                    } else {
                        PreciosUnitarios.add(pUnitario);
                    }
                } while (pUnitario < 0);
                importe = cantidad * pUnitario;
                importes_parcial.add(importe);//importes_parcial.add(cantidad*pUnitario);
            //subtotal=subtotal+importe;
            } else if (cantidad < 0) {
                System.out.println("ERROR: la cantidad tiene que ser mayor que cero");
            }
        } while (cantidad != 0);
        Visualizar_Lineas_Factura(cantidades, descripciones, PreciosUnitarios, importes_parcial);
        Visualizar_totales(importes_parcial);
    }

    public static void Visualizar_Datos_Generales(String[] cabeceras, ArrayList<String> DatosCli) {
        int indice = 0;
        //for (indice=0;indice<DatoCli.size();indice++)
        for (indice = 0; indice < cabeceras.length; indice++) {
            System.out.println(cabeceras[indice] + DatosCli.get(indice));
        }
    }

    public static void Visualizar_datos_generales(String[] cabeceras, ArrayList<String> DatosCli) {
        int indice = 0;
        for (String aux1 : DatosCli) {
            indice = DatosCli.indexOf(aux1);
            System.out.println(cabeceras[indice] + aux1);
        }

        //Metodo 3
        DatosCli.forEach((aux2) -> {
            System.out.println(cabeceras[DatosCli.indexOf(aux2)] + aux2);
        });

    }

    public static ArrayList<String> Introducir_datos_Generales(String[] Cabeceras, ArrayList<String> DatosCli) {
        //ArrayList<String> DatosCli=new ArrayList<String>();
        int indice = 0;
        String aux;
        do {
            System.out.println("Introduce " + DATOS_CLIENTE[indice]);
            aux = sc.nextLine();
            if (!aux.isEmpty()) {
                DatosCli.add(aux);
                indice++;
            }
        } while (!aux.isEmpty() && indice < DATOS_CLIENTE.length);

        return DatosCli;
    }

    public static void Visualizar_Lineas_Factura(ArrayList<Integer> cantidades, ArrayList<String> descripciones, ArrayList<Double> PreciosUnitarios, ArrayList<Double> importes_parcial) {
        for (int indice = 0; indice < cantidades.size(); indice++) {
            System.out.println(cantidades.get(indice) + " \t" + descripciones.get(indice) + "\t" + PreciosUnitarios.get(indice) + "\t" + importes_parcial.get(indice));
        }
    }

    public static double Generar_SubTotal(ArrayList<Double> importes_parcial) {
        double suma = 0;
        for (int indice = 0; indice < importes_parcial.size(); indice++) {
            suma = suma + importes_parcial.get(indice);
        }

        return suma;
    }

    public static void Visualizar_totales(ArrayList<Double> importes_parcial) {
        double subtotal;
        subtotal = Generar_SubTotal(importes_parcial);

        System.out.println("Total bruto factura: " + subtotal);
        System.out.println("Importe de IVA: " + subtotal * IVA);
        System.out.println("Total bruto factura: " + subtotal + (subtotal * IVA));
    }

}
