package menu;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        
        float numero1;
        float numero2;
        
        boolean goesOk = false;
        
        int operacion = -1;
        float area = 0;
        String resultado = "";
        
        Scanner consola = new Scanner(System.in);
       
        System.out.println("Ingrese una opción");
        System.out.println("1) CALCULAR AREA DEL RECTÁNGULO");
        System.out.println("2) CALCULAR AREA DEL TRIÁNGULO");
        System.out.println("3) CALCULAR AREA DEL CÍRCULO");
        System.out.println("4) SALIR DEL MENÚ EXIT");
       
        
        while(operacion != 52){
            
            System.out.println("Ingrese la operación a realizar 1,2,3 o 4");
            operacion = consola.next().charAt(0);
            
            //Test
            //System.out.println("test operacion = " + operacion);
            
            if(operacion == 49 || operacion == 50 ||operacion == 51 ||operacion == 52 ){
               
                switch (operacion) {

                    //representa a la opción 1 en CÓDIGO ASCII, importante !!! HABLAMOS DE CHARS
                    case 49:
                        System.out.println("Ingrese la base");
                        numero1 = consola.nextFloat();

                        System.out.println("Ingrese la altura");
                        numero2 = consola.nextFloat();

                        area = numero1 * numero2;
                        resultado = "El area será de: "+ area;
                        
                        System.out.println("El area será de: "+resultado);

                        break;
                        
                    //representa a la opción 2 en CÓDIGO ASCII, importante !!! HABLAMOS DE CHARS
                    case 50:
                        System.out.println("Ingrese la base");
                        numero1 = consola.nextFloat();

                        System.out.println("Ingrese la altura");
                        numero2 = consola.nextFloat();

                        area = ((numero1 * numero2)/2);
                        resultado = "El area será de: "+ area;
                        
                        System.out.println("El area será de: "+resultado);

                        break;
                        
                    //representa a la opción 3 en CÓDIGO ASCII, importante !!! HABLAMOS DE CHARS
                    case 51:
                        System.out.println("Ingrese el radio");

                        numero1 = consola.nextFloat();

                        area = (float) 3.1415 * numero1 * numero1;
                        resultado = "El area será de: "+ area;
                        
                        System.out.println("El area será de: "+resultado);

                        break;
                    
                    //representa a la opción 4 en CÓDIGO ASCII, importante !!! HABLAMOS DE CHARS
                    case 52:
                        System.out.println("Hemos salido del programa");
                        break;

                    default:
                        System.out.println("No hemos introducido la opción correspondiente");
                       
                        break;
                }

            }

        }
      
        
    }
    
}
