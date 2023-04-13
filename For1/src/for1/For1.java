package for1;

import java.util.ArrayList;
import java.util.Scanner;

public class For1 {

    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);

        /*
        Escriba un programa que lea un número entero por consola. A continuación, el programa 
        imprime números desde 0 hasta el número dado por el usuario. Puede suponer que 
        el usuario siempre da un número positivo. 
         */
        
        /*
        System.out.println("Introduce un numero entero");
        int a = consola.nextInt();
        
       
        for(int i = 0;  i <= a;  i++)    
        {
            System.out.println("i = " + i);
        }
         */
 /*
        Escriba un programa que lea un número entero del usuario. Luego, 
        el programa imprime números desde ese número hasta 100.
        Puede suponer que el usuario siempre da un número menor que 100
         */
 /*
        System.out.println("Introduce un numero entero");
        int b = consola.nextInt();
        
       
        for(int i = b;  i <= 100;  i++)    
        {
            System.out.println("i = " + i);
        }
        
         */

        /*
        Implemente un programa que calcule la suma 1+2+3+...+n 
        donde n se proporciona como entrada por consola.
         */
        /*
        System.out.println("Introduce un numero entero");
        double suma;
        int c = consola.nextInt();

        int aux = 0;
        for (int i = 1; i <= c; i++) {
            aux = aux + i;
        }

        suma = aux;
        System.out.println("suma = " + suma);
        */
        
        /*
        imprima los numeros pares entre dos numeros que se le pidan al usuario
        */
        /*
        System.out.println("Introduce un numero entero como inicial ");
        int primero = consola.nextInt();
        
        System.out.println("Introduce un numero entero como final ");
        int ultimo = consola.nextInt();

     
        for (int i = primero; i <= ultimo; i++) {
           if(i%2==0){
               System.out.println("Numero par: " + i);
           }
        }
        */
        //ingresar por consola 3 calificaciones..uso de un for para pedir las tres y obtener el promedio de ellas
        // se iran acumulando las calificaciones
        
        /*
        double calif = 0;
        double suma = 0;
        double resultado = 0;
        
        for (int i = 1; i <= 3; i++) {
          
               System.out.println("Entrar un numero "+ i);
               calif = consola.nextDouble();
               suma = suma + calif;
          
        }
        
        resultado = suma /3;
        
        System.out.println("resultado = " + resultado);
        */
        
        //DECLARACIÓN DE VARIABLES
     /*
        int i = 0;
        int inicio;
        int fin;

        //SOLICITUD DE DATOS POR CONSOLA
        System.out.println("Ingresa un numero:");
        inicio = consola.nextInt();

        System.out.println("Ingresa otro número mayor que el anterior:");
        fin = consola.nextInt();

        //PROCESANDO...
        for (i = inicio; i<=fin; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
        */
        /* Tabla de multiplicar de un numero 
        entrado por teclado */
        
        /*
        int numero;
        
        System.out.println("Ingresa un numero entero y mostraremos su tabla de multiplicar:");
        numero = consola.nextInt();

       
        for (int i = 0; i<=10; i++) {
            System.out.println(numero + " x "+ i + " = " + (i*numero));
        }
        */
        
        /*
        Escribir un programa que lea 12 notas de alumnos y nos informe cuántos
        estudiantes han aprobado y cuántos han suspendido, sabiendo 
        que la nota para aprobar es 6.
        */
        
        /*
        int numero;
        String calificacion;
        
        ArrayList<Integer> notas = new ArrayList<Integer>();

        for (int i = 0; i<=11; i++) {
            
            System.out.println("Ingresa la nota para el estudiante "+(i+1));
            
            numero = consola.nextInt();
            notas.add(numero);
            
        }
        
        
        for (int i = 0; i<=11; i++) {
            
            if(notas.get(i) < 6){
                calificacion = "suspendido";  
            }else{  
                calificacion = "aprobado";
            }
            
            System.out.println("La nota para el alumno "+(i+1)+" es "+notas.get(i)+" y se encuentra "+calificacion);
             
        }
        
        */
         
       
        /*

           1 Calcular el area y el perimetro de un cuadrado

           2 Calcular area y perimetro de un triangulo
            base y altura
            perimetro = teorema de pitagoras

        */
        
         /*
            Buscar numeros primos entre 0 y 100
           
        
            Los números primos son aquellos que solo son divisibles entre ellos mismos 
            y el 1, es decir, que si intentamos dividirlos por cualquier otro número,
            el resultado no es entero. Dicho de otra forma,
        
            ->si haces la división
            por cualquier número que no sea 1 o él mismo, se obtiene un 
            resto distinto de cero.
        
        */
        
       
        boolean primo;
        
        for (int numero = 1; numero<=100; numero++) {
         
            primo = true;
            
            //treiem el 1 i ell mateix perqué sempre serà divisible .
            for (int divisor = 2; divisor<= numero-1; divisor++) {
                
                //** 5 / 1 resto 0
                //5 / 2 = 2 resto 1  -> 5 % 2 = 1
                //5 / 3 = 1 resto 2  -> 5 % 3 = 2
                //5 / 4 = 1 resto 1  -> 5 % 4 = 1
                //5 / 5 resto 0
                
                //Sabem que el coeficient del resto mai te decimals
                if((numero % divisor) == 0) {
                    primo = false;
                }
             
            }
            if(primo){
                
                System.out.println(numero + " será un numero primo");
                
            }else{
                
                System.out.println(numero + " NO será un numero primo");
                
            }
            
         
        }
        
        
       
    }

}
