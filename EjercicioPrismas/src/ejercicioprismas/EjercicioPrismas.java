/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioprismas;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class EjercicioPrismas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número del perímetro que quieres calcular: 1= Cubo, 2= Prisma rectangular, 3= Prisma cuadrangular");
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Indica el valor del lado del cubo: ");
                double ladoCubo = sc.nextInt();
                double perimetroCubo;

                perimetroCubo = ladoCubo * 12;
                System.out.println("El valor del perímetro del cubo es: " + perimetroCubo);
                break;

            case 2:
                System.out.println("Ingresa el alto del prisma: ");
                double alto = sc.nextDouble();
                System.out.println("Ingresa el ancho del prisma: ");
                double ancho = sc.nextDouble();
                System.out.println("Ingresa la profundidad del prisma: ");
                double profundidad = sc.nextDouble();

                double perimetroPrisma;
                perimetroPrisma = 4 * (alto + ancho + profundidad);

                System.out.println("El valor del perímetro del prisma es: " + perimetroPrisma);
                break;
                
            case 3:
                 System.out.println("Ingresa el alto del prisma: ");
                double alto2 = sc.nextDouble();
                System.out.println("Ingresa el ancho del prisma: ");
                double ancho2 = sc.nextDouble();
                System.out.println("Ingresa la profundidad del prisma: ");
                double profundidad2 = sc.nextDouble();

                double perimetroPrisma2;
                perimetroPrisma2 = 4 * (alto2 + ancho2 + profundidad2);

                System.out.println("El valor del perímetro del prisma es: " + perimetroPrisma2);
                break;

        }
        
   
    }
}
