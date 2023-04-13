
package ecsegundogrado;

import java.util.Scanner;

public class EcSegundoGrado {

  
    public static void main(String[] args) {
        
        System.out.println("x^2 - 5x + 6"); // dos soluciones
        double resultados[] = ecuacion2Grado(1, -5, 6);

        if (resultados == null) {
            System.out.println("No tiene solucion");
        } else {
            for (int i = 0; i < resultados.length; i++) {
                System.out.println(resultados[i]);
            }
        }

        System.out.println("x^2 - 2x + 1"); // una solucion
        resultados = ecuacion2Grado(1, -2, 1);

        if (resultados == null) {
            System.out.println("No tiene solucion");
        } else {
            for (int i = 0; i < resultados.length; i++) {
                System.out.println(resultados[i]);
            }
        }

        System.out.println("x^2 - x + 1"); // sin solucion
        resultados = ecuacion2Grado(1, 1, 1);

        if (resultados == null) {
            System.out.println("No tiene solucion");
        } else {
            for (int i = 0; i < resultados.length; i++) {
                System.out.println(resultados[i]);
            }
        }
        
        int a,b,c;
        double x1,x2,d;
        
        Scanner consola = new Scanner(System.in);

        System.out.println("Introduce un numero entero para el coeficiente a");
        a = consola.nextInt();

        System.out.println("Ingrese el valor de b");
        b = consola.nextInt();

        System.out.println("Ingrese el valor de c");
        c = consola.nextInt();
        
        resultados = ecuacion2Grado(a, b, c);

        if (resultados == null) {
            System.out.println("No tiene solucion");
        } else {
            for (int i = 0; i < resultados.length; i++) {
                System.out.println(resultados[i]);
            }
        }
        
        
    }

    public static double[] ecuacion2Grado(int a, int b, int c) {
        
        double discriminante = (Math.pow(b, 2) - (4 * a * c));
        
        if (discriminante >= 0) {

            double soluciones[];

            // Una solucion
            if (discriminante == 0) {

                soluciones = new double[1];

                soluciones[0] = ((-b) - (4 * a * c)) / (2 * a);

                // Dos soluciones
            } else {

                soluciones = new double[2];

                soluciones[0] = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

                soluciones[1] = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

            }

            return soluciones;
            
        } else {
            // Sin solucion
            return null;
        }
    }

}
