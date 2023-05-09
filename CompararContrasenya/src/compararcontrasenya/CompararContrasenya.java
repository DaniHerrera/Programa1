/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compararcontrasenya;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class CompararContrasenya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cadena1,cadena2;
        cadena2 = "abracadabra";
         
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la contraseña por teclado");
        cadena1 = sc.nextLine();
       
        
        if(cadena1.equals(cadena2)){
            System.out.println("Iguales");
        }else{
            System.out.println("Diferentes");
        }
    }
    
}
