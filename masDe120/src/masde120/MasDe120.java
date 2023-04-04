package masde120;

import java.util.Scanner;

public class MasDe120 {

  
    public static void main(String[] args) {
         /*
            Escriba un programa que solicite al usuario su edad y verifique si es posible o no (al menos 0 y
            como máximo 120). Solo use un if en su programa.
        */
         
        int edad = 0;
        
        System.out.println("Introduce tu edad:");
        
        Scanner consola = new Scanner(System.in);
        edad = consola.nextInt();
        
        if(edad >=0 && edad <= 120){
        
            System.out.println("Su edad de "+ edad +" años ha sido verificada");
            
        }else{
            
            System.out.println("Su edad de "+ edad +" años está fuera de rango");
        
        }
            
    }
    
}
