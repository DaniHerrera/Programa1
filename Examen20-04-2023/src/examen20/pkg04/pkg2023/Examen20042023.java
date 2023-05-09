package examen20.pkg04.pkg2023;

import java.util.Scanner;

public class Examen20042023 {

    public static void main(String[] args) {

        int n, linea,fila;
        char a;
        n = 1;
        linea = 1;
        fila = 1;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un carácter: ");
        a = sc.next().charAt(0);

        System.out.println("Introduce el número de lineas que quieres reproducir: ");
        fila = sc.nextInt();

        for (n = 1; n <= fila; n++) {
            for (linea = 1; linea <= n; linea++) {

                System.out.print(a);
            }
            {
                System.out.println("");
            }

        }

    }
}
