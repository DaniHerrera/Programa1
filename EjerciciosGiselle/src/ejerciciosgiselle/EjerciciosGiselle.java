/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosgiselle;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class EjerciciosGiselle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] n = {8, 45, 6, 7, 43};

        muestraArray(n);
        calcularCuadrados(n);
        
        Scanner sc = new Scanner(System.in);
        double x = 0, valor, derivada;
        
        System.out.println("Ingrese un valor de x ");
        x = sc.nextDouble();
        
        valor = resolverEcuación(x);
        System.out.println("valor es "+ valor);
        derivada = calcularDerivada(x);
        
    }

    public static void muestraArray(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + "");
        }
        System.out.println("");
    }

    public static void calcularCuadrados(int x[]) {
        int[] y = {0, 0, 0, 0, 0};
        for (int i = 0; i < x.length; i++) {
            y[i] = x[i] * x[i];
        }
        muestraArray(y);
    }

    private static double resolverEcuación(double x) {
        //f(x) = x^3+4x^2-10;
        return (x*x*x) + (4*x*x) -10;
    }

    private static double calcularDerivada(double x) {
        //f'(x) = 3x^2+8x
        return (3*x*x) + (8*x);
    }
    
    //en un array de valores de 0 a 9 substituiremos los valores

}
