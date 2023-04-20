package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        /* Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = sc.nextInt();
        int factorial = 1;

        for (int i = numero; i > 1; i--) {

            factorial *= i;

        }

        System.out.println(numero + "! = " + factorial);
         */
        ////////////////////////////////////
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println("el factorial de " + n + " es " + factorial);
         */
 /*
         */
        // DECLARACIÓN VARIABLES
        /*
        Scanner consola = new Scanner(System.in);
        int num, factorial = 1;

        // SOLICITUD DE DATOS POR CONSOLA
        System.out.println("Introduce un número entero:");
        num = consola.nextInt();

        // PROCESANDO...
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        // SALIDA POR PANTALLA
        System.out.println("El factorial de " + num + " es: " + factorial);
        // FIN PROCESO
         */
        // Multiples de 5 entre 0 y 100
        /*
        for (int i = 0; i <= 100; i++) {
            
            if(i%5 == 0){
                System.out.println("i = " + i);
            }
            
        }
         */
        /*
        long startTime = System.nanoTime();
        
        for (int i = 0; i <= 100; i += 5) {

            System.out.print(i + " ");
        }
        
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
 
        //System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println("Tiempo de ejecución en milisegundos: " + timeElapsed / 1000000);
        */
        ///320 al 160 de 20 en 20 hacia atrás
        /*
        for (int i = 320; i >= 160; i -= 20) {
            System.out.print(i + " ");
        }
        */
        /*
        int numero = 320;
        for(int i = 8; i >= 0; i--){
        
            System.out.print("i = " + numero+"\n");
            numero -= 20;
        }
        */
        //Dibuja un cuadrado de n elementos con asteriscos ( * )
        /*
        int cuadrado = 5;
        for(int i = 1; i <= cuadrado; i++){ 
            for(int e = 1; e <= cuadrado; e++){
                System.out.print("X ");
            }
            System.out.print("\n");
        }
        
        */
        /*
        Ejemplo Raul Marco Cuadro
        */
        
        
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        long startTime = System.nanoTime();

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < n - 2; i++) { //tendrá de repetir lo que haya abajo 4 veces
            System.out.print("* ");//EXTREMO IZQUIERDO
            for (int j = 0; j < n - 2; j++) {  // DE 0 A 4
                System.out.print("  "); // Se printan 4 espacios en blanco
            }
            System.out.println("* ");//EXTREMO DERECHO
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        
        System.out.println("Tiempo de ejecución en milisegundos: " + timeElapsed / 1000000);
        
    }
    

}


/*
Programador PHP con MySQL, css, html, javascript,jquery.
Frameworks: CodeIgniter, CakePHP, Yii,Yii2, ZendFramework
CMS's: WordPress Magento 1, Magento2
AngularJS y Angular
*/

/*
Depende de los desarrollos e evolutivos a implementar en un framework que haya tocado o no.  26 - 32 K brutos / anuales
*/