/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scopes;

/**
 *
 * @author dani
 */
public class Scopes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = "Isa";
        {
            nombre = "Dani";
            System.out.println("Nombre = " + nombre);
        }
        System.out.println("Nombre = " + nombre);
    }
    
}
