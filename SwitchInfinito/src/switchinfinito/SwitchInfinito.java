/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchinfinito;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class SwitchInfinito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DECLARACIÓN DE VARIABLES
        Scanner consola = new Scanner(System.in);
        char opcion;
        double lado, resultado, largoR, anchoR, radio;
        boolean salir = false;

// PROCESANDO...
        do {
// SOLICITUD DE DATOS POR CONSOLA
            System.out.println("Selecione una opción:");
            System.out.println("Opción 1: Calcular el área de un cuadrado.");
            System.out.println("Opción 2: Calcular el área de un rectángulo.");
            System.out.println("Opción 3: Calcular el área de un círculo.");
            System.out.println("Opción 4: Calcular el perímetro de un cubo.");
            System.out.println("Opción 0: Salir.");
            opcion = consola.next().charAt(0);
//PROCESANDO
            switch (opcion) {
                case '1':
                    System.out.println("Introduzca el valor de lado:");
                    lado = consola.nextDouble();
                    resultado = Math.pow(lado, 2);
                    System.out.println("El área del cuadrado es: " + resultado); //SALIDA POR PANTALLA
                    break;
                case '2':
                    System.out.println("Introduzca el valor del largo:");
                    largoR = consola.nextDouble();
                    System.out.println("Introduzca el valor del ancho:");
                    anchoR = consola.nextDouble();
                    resultado = largoR * anchoR;
                    System.out.println("El área del rectángulo es: " + resultado); //SALIDA POR PANTALLA
                    break;
                case '3':
                    System.out.println("Introduzca el valor del radio:");
                    radio = consola.nextDouble();
                    resultado = Math.pow(radio, 2) * Math.PI;
                    System.out.println("El área del círculo es: " + resultado);//SALIDA POR PANTALLA
                    break;
                case '4':
                    System.out.println("Introduzca el valor del lado:");
                    lado = consola.nextDouble();
                    resultado = lado * 12;
                    System.out.println("El perímetro del cubo es: " + resultado); // SALIDA POR PANTALLA
                    break;
                case '0':
                    System.out.println("¡Hasta pronto!");
                    salir = true;
                    break;
                default:
                    System.out.println("ERROR. Solo números del 0 al 4.");
            }// FIN DEL SWITCH
        } while (!salir); //Fin DO

// FIN PROCESO
    }

}
