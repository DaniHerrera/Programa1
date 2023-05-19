/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matricesgiselle;

/**
 *
 * @author dani
 */
public class MatricesGiselle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[][] matriz = {
            {"España", "Barcelona", "Madrid", "Guadalajara"},
            {"México", "CDMX", "Puebla", "Veracruz"},
            {"Argentina", "Buenos Aires", "La Plata", "Ushuaia"},
            {"Ecuador", "Guayaquil", "Quito", "Ambato"},
            {"Portugal", "Lisboa", "Oporto", "Faro"},};

// imprimeMatriz(matriz);
// imprimePaises(matriz);
        muestrarCiudadesPais(matriz);
    }

    public static void imprimeMatriz(String[][] matriz) {

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println("");
        }
    }

    public static void imprimePaises(String[][] matriz) {

        System.out.println("Paises: ");
        for (int f = 0; f < matriz.length; f++) {
            System.out.println(matriz[f][0]);
        }

    }

    public static void muestrarCiudadesPais(String[][] matriz) {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.println(matriz[f][c]);
            }
            System.out.println("");
        }
    }

}
