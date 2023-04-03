package ordenar3numeros;

import java.util.Scanner;

public class Ordenar3numeros {

    public static void main(String[] args) {
        
        //Permutacion de 3 elementos en 3 posiciones.
        //En este caso m=n por lo que empleamos
        //P3 = 3! = 3*2*1 = 6 casuísticas

        // 2 , 7, 5     petit gran mitja
        // 5, 7 , 2     mitja gran petit
        // 7, 2, 5      gran petit mitja
        // 5, 2 , 7     mitja petit gran
        // 7 , 5 , 2    gran mitja petit
        // 2,  5,  7    petit, mitja i gran
        /*
        
        gran mitja petit  
        gran petit mitjà  
        
        mitja gran petit 
        mitja petit gran 
        
        petit mitja gran  
        petit gran mitja  
        
        
         */
        double grande = 0;
        double pequeño = 0;
        double mediano = 0;

        String error = "";

        Scanner consola = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        double numero1 = Double.parseDouble(consola.nextLine());

        System.out.println("Introduce el segundo numero");
        double numero2 = Double.parseDouble(consola.nextLine());

        System.out.println("Introduce el tercer numero");
        double numero3 = Double.parseDouble(consola.nextLine());

        System.out.println("¿ Cuál de los tres números es mayor?");

        if (((numero1 == numero2) || (numero2 == numero3) || (numero1 == numero3))) {

            System.out.println("Has introducido por lo menos dos numeros iguales, porfa que sean diferentes los tres !!");

        } else {

            if ((numero1 >= numero2) && (numero2 >= numero3)) {
                grande = numero1;
                mediano = numero2;
                pequeño = numero3;
            }
            if ((numero3 >= numero2) && (numero2 >= numero1)) {
                grande = numero3;
                mediano = numero2;
                pequeño = numero1;
            }

            if ((numero2 >= numero1) && (numero2 >= numero3) && (numero1 >= numero3)) {

                grande = numero2;
                mediano = numero1;
                pequeño = numero3;

            }

            if ((numero2 >= numero1) && (numero2 >= numero3) && (numero3 >= numero1)) {
                grande = numero2;
                mediano = numero3;
                pequeño = numero1;
            }

            if ((numero2 <= numero1) && (numero2 <= numero3) && (numero1 <= numero3)) {
                grande = numero3;
                mediano = numero1;
                pequeño = numero2;
            }

            if ((numero2 <= numero1) && (numero2 <= numero3) && (numero3 <= numero1)) {
                grande = numero1;
                mediano = numero3;
                pequeño = numero2;
            }

            System.out.println("El numero mayor es " + grande);
            System.out.println("El numero mediano es " + mediano);
            System.out.println("El numero menor es " + pequeño);

        }
    }

}
