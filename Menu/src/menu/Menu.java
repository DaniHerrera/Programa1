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
       
        
        while(operacion != 4){
            
            System.out.println("Ingrese la operación a realizar 1,2,3 o 4");
            operacion = Integer.parseInt(consola.nextLine());
            
            if((int)operacion == 1 || (int)operacion == 2 ||(int)operacion == 3 ||(int)operacion == 4 ){
               
                switch (operacion) {

                    case 1:
                        System.out.println("Ingrese la base");
                        numero1 = consola.nextFloat();

                        System.out.println("Ingrese la altura");
                        numero2 = consola.nextFloat();

                        area = numero1 * numero2;
                        resultado = "El area será de: "+ area;

                        break;
                    case 2:
                        System.out.println("Ingrese la base");
                        numero1 = consola.nextFloat();

                        System.out.println("Ingrese la altura");
                        numero2 = consola.nextFloat();

                        area = ((numero1 * numero2)/2);
                        resultado = "El area será de: "+ area;

                        break;
                    case 3:
                        System.out.println("Ingrese el radio");

                        numero1 = consola.nextFloat();

                        area = (float) 3.1415 * numero1 * numero1;
                        resultado = "El area será de: "+ area;

                        break;

                    default:
                        System.out.println("Por favor, introduce la opción correspondiente 1, 2 o 3 o 4 para salir");
                        resultado = "No podemos calcular el area";
                        break;
                }

                System.out.println("El area será de: "+resultado);
            
            }else{
                
                System.out.println("Por favor, introduce la opción correspondiente 1, 2 o 3 o 4 para salir");
                
            }

        }
        
        System.out.println("Hemos salido del programa");
        
    }
    
}
