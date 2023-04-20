package examen20.pkg04.pkg2023;

import java.util.Scanner;

public class Examen20042023 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("Menú de opciones:");
            System.out.println("1.- Calcular el área de un cuadrado.");
            System.out.println("2.- Calcular el área de un rectángulo.");
            System.out.println("3.- Calcular el área de un círculo.");
            System.out.println("4.- Calcular el perímetro de un cubo.");
            System.out.println("0.- Salir del programa.");
            System.out.print("Ingrese una opción: ");
            try {
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 0:
                            System.out.println("Saliendo del programa...");
                    break;
                    case 1:
                        try {
                            System.out.print("Ingrese el lado del cuadrado: (double)");
                            double lado = Double.parseDouble(sc.nextLine());
                            double areaCuadrado = lado * lado;
                            System.out.println("El área del cuadrado es: " + areaCuadrado);
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Ingrese un double. Volvemos a seleccionar en el menú de opciones");
                        }
                    break;
                    case 2:
                        try {
                            System.out.print("Ingrese la base del rectángulo: (double)");
                            double base = Double.parseDouble(sc.nextLine());
                            System.out.print("Ingrese la altura del rectángulo: (double)");
                            double altura = Double.parseDouble(sc.nextLine());
                            double areaRectangulo = base * altura;
                            System.out.println("El área del rectángulo es: " + areaRectangulo);
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Ingrese un double. Volvemos a seleccionar en el menú de opciones");
                        }
                    break;
                    case 3:
                        try {
                            System.out.print("Ingrese el radio del círculo: (double)");
                            double radio = Double.parseDouble(sc.nextLine());
                            double areaCirculo = Math.PI * Math.pow(radio, 2);
                            System.out.println("El área del círculo es: " + areaCirculo);
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Ingrese un double. Volvemos a seleccionar en el menú de opciones");
                        }
                    break;
                    case 4:
                        try {
                            System.out.print("Ingrese la longitud de un lado del cubo: (double)");
                            double longitud = Double.parseDouble(sc.nextLine());
                            double perimetroCubo = 12 * longitud;
                            System.out.println("El perímetro del cubo es: " + perimetroCubo);
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Ingrese un double. Volvemos a seleccionar en el menú de opciones");
                        }
                    break;
                    default:
                            System.out.println("Opción no válida. Por favor, elija otra.");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese una opción válida.");
            }

        }

        sc.close();

    }

}
