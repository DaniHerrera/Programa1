package ordenar3numeros;

import java.util.Scanner;

public class IsaOrdenar3numerosSolucion {
    
    
    public static void main(String[] args) {
    
    //DECLARACIÓN DE VARIABLES
             Scanner consola = new Scanner(System.in);
             int num1;
             int num2;
             int num3;
         
            //SOLICITUD DE DATOS POR PANTALLA
             System.out.println("Introduce un primer número:");
             num1 = consola.nextInt();
             System.out.println("Introduce un segundo número:");
             num2 = consola.nextInt();
             System.out.println("Introduce un tercer número:");
             num3 = consola.nextInt();
             
             //PROCESANDO...
             // num1 = 10 , num2 = 7 , num3 = 5
            if (num1>=num2 && num2>=num3) {
                System.out.println("El mayor es: " + num1 + ", el mediano es: " + num2 + " y el menor es el: " + num3);
            }
             // num1 =10 , num2 = 5 , num3 = 7
            else if (num1>=num2 && num1>=num3 && num3>=num2) {
                System.out.println("El mayor es: " + num1 + ", el mediano es: " + num3 + " y el menor es el: " + num2);
            }
            
            // num1 = 7 , num2 = 10 , num3 = 5
            else if (num2>=num1 && num2>=num3 && num1>=num3) {
                System.out.println("El mayor es: " + num2 + ", el mediano es: " + num1 + " y el menor es el: " + num3);
            }
            // num1 = 5 , num2 = 10 , num3 = 7
            else if (num2>=num1 && num2>=num3 && num3>=num1) {
                System.out.println("El mayor es: " + num2 + ", el mediano es: " + num3 + " y el menor es el: " + num1);
            }
            
            // num1 = 5 , num2 = 7 , num3 = 10
            else if (num3>=num2 && num2>=num1) {
                System.out.println("El mayor es: " + num3 + ", el mediano es: " + num2 + " y el menor es el: " + num1);
            }
             // num1 = 7 , num2 = 5 , num3 = 10
            else if (num3>=num2 && num3>=num1 && num1>=num2) {
                System.out.println("El mayor es: " + num3 + ", el mediano es: " + num1 + " y el menor es el: " + num2);
            }

    }
    
    
}
