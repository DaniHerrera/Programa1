package sumaswitch;

import java.util.Scanner;

public class SumaSwitch {

    public static void main(String[] args) {
        
        float numero1;
        float numero2;
        
        char operacion;
        
        float resultado = 0;
        
        Scanner consola = new Scanner(System.in);

        // SOLICITUD DE DATOS POR CONSOLA
        System.out.println("Ingrese el primer número");
        numero1 = consola.nextFloat();
        
        System.out.println("Ingrese el segundo número");
        numero2 = consola.nextFloat();
        
        System.out.println("Ingrese la operación a realizar +,-,*,/");
        operacion = consola.next().charAt(0);
        
        switch (operacion) {

            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
               resultado = numero1 * numero2;
                break;
            case '/':
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Has introducido un caracter que no corresponde con +,-,*,/");

        }
        
        
        System.out.println("El resultado de la operación será: "+resultado);
        
        
        String diaSemana;
        String situacionSemana = "";
        
        System.out.println("Introduce un día de la semana");
        diaSemana = consola.nextLine();
        
           switch (diaSemana) {

            case "Lunes":
                situacionSemana = "Inicio de la semana";
                break;
            case "Martes":
            case "Miércoles":
            case "Jueves":
            case "Viernes":
                situacionSemana = "Medianos de la semana";
                break;
            case "Sábado":
            case "Domingo":
                situacionSemana = "Finales de la semana";
                break;
            default:
               

        }
        
        System.out.println("Nos encontramos a " + situacionSemana);
                
        
        
    }
    
}
