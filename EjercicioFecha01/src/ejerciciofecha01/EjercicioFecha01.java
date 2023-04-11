package ejerciciofecha01;

import java.time.LocalDate;
import java.util.Scanner;

public class EjercicioFecha01 {

    public static void main(String[] args) {

        int mes;
        String mesTexto;
        Scanner consola = new Scanner(System.in);

        // SOLICITUD DE DATOS POR CONSOLA
        System.out.println("Ingrese el mes (en número):");

        mes = consola.nextInt();

        switch (mes) {

            case 1:
                mesTexto = "Enero";
                break;
            case 2:
                mesTexto = "Febrero";
                break;
            case 3:
                mesTexto = "Marzo";
                break;
            case 4:
                mesTexto = "Abril";
                break;
            case 5:
                mesTexto = "Mayo";
                break;
            case 6:
                mesTexto = "Junio";
                break;
            case 7:
                mesTexto = "Julio";
                break;
            case 8:
                mesTexto = "Agosto";
                break;
            case 9:
                mesTexto = "Septiembre";
                break;
            case 10:
                mesTexto = "Octubre";
                break;
            case 11:
                mesTexto = "Noviembre";
                break;
            case 12:
                mesTexto = "Diciembre";
                break;

            default:
                mesTexto = "incorrecto";

        }
        
        System.out.println("El mes introducido es " + mesTexto);
    }
}
