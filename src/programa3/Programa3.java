
package programa3;

import java.util.Scanner;


public class Programa3 {
    
    
    public static void main(String[] args) {
        
        float areaTriangulo = 0;
        
        //Lee la entrada del usuario y lo almacena en la variable scanner
        Scanner scanner = new Scanner(System.in);
        
        // Solicita el mensaje
        System.out.println("Introduce la base del triangulo: ");

        float base = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Introduce la altura del triangulo: ");
        
        Float altura = scanner.nextLine(); //nextLine lee una linea completa
        
        areaTriangulo = (base * altura)/2;
        
        System.out.println("La area del Triangulo será :" + areaTriangulo);
        
        
    }
    
}
