package programa2;

import java.util.Scanner;

public class Programa2 {
    
     public static void main(String[] args) {
         
        float suma = 0;
         
        //conversion de tipos

        //conversión implícita
        int x = 45;
        double n = x;
        System.out.println("n = " + n);

        //conversión explícita
        double r = 4.5;
        int y = (int) r;
        System.out.println("y = " + y);

        //jugando con caracteres
        byte b = 64;
        char p = (char) b;
        System.out.println("p = " + p);
         
        //Lee la entrada del usuario y lo almacena en la variable scanner
        Scanner scanner = new Scanner(System.in);

        // Solicita el mensaje
        System.out.println("Introduce un mensaje: ");

        //Lee la cadena escrita por el usuario y lo asigna a la variable mensaje
        String mensaje = scanner.nextLine(); //nextLine lee una linea completa

        // Imprime el mensaje introducido por el usuario
        System.out.println("Tu mensaje es: "+mensaje);
        
        
        
        //Programa suma de dos números:
        
        System.out.println("Escribe un numero");
        
        float valorNumero1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Escribe otro numero");
         
        float valorNumero2 = Integer.parseInt(scanner.nextLine());
        
        suma = valorNumero1 + valorNumero2;
        
        System.out.println("La suma es = " + suma);
        
        
     }
    
}
