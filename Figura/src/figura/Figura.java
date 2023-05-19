/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figura;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class Figura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String figura;
        double radio, lado, base, altura, resultado = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Elija el nombre de una figura: circulo, cuadrado o triangulo");
            figura = sc.nextLine();

            switch (figura) {
                case "circulo":
                    System.out.println("Introduce el radio: ");
                    radio = sc.nextDouble();
                    resultado = areaCirculo(radio);
                    break;

                case "cuadrado":
                    System.out.println("Introduce el lado");
                    lado = sc.nextDouble();
                    resultado = areaCuadrado(lado);
                    break;

                case "triangulo":
                    System.out.println("Introduce la base");
                    base = sc.nextDouble();
                    System.out.println("Introduce la altura");
                    altura = sc.nextDouble();
                    resultado = areaTriangulo(base, altura);
                    break;

                default:
                    System.out.println("Elija una opción correcta");
            }
        } while (!figura.equals("circulo") && !figura.equals("cuadrado") && !figura.equals("triangulo"));

        mostrarResultado(resultado);
// System.out.println("El area es: " + resultado);
    }

    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double areaCuadrado(double lado) {
        return lado * lado;
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static void mostrarResultado(double resultado) {
        System.out.println("El area de la figura es: " + resultado);
    }

}
