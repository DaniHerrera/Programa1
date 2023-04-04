package ejerciciofecha01;

import java.time.LocalDate;
import java.util.Scanner;

public class EjercicioFecha01 {

    public static void main(String[] args) {

        /*
            Se carga una fecha (día, mes y año) por teclado. 
            Mostrar un mensaje si corresponde al primer trimestre del año (enero, febrero o marzo). 
            Cargar por teclado el valor numérico del día, mes y año. 
            El programa deberá mostrar si el mes pertenece al primer trimestre
            Ejemplo: dia:10 mes:1 año:2010
         */
        int dia, mes, anyo;

        //Arrays, no los hemos visto, es un extra !!!
        
        int[] diasMesesAnyoNormal = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int[] diasMesesAnyoBisiesto = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner consola = new Scanner(System.in);

        System.out.println("Introduce el día:");
        dia = consola.nextInt();

        System.out.println("Introduce el mes:");
        mes = consola.nextInt();

        System.out.println("Introduce el año:");
        anyo = consola.nextInt();

        //Si es divisible entre 4 y no es divisible entre 100 o es divisible entre 100 y 400.
        
        if(anyo>=1900){
        
            if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 100 == 0 && anyo % 400 == 0)) {

                System.out.println("El año " + anyo + " es bisiesto");

                if (mes >= 1 && mes <= 12) {
                    
                    //Arrays, no lo hemos visto
                    int totalDiasMes1 = diasMesesAnyoBisiesto[mes - 1];

                    System.out.println("El total de días de este mes será de " + totalDiasMes1 + " días");

                    if (dia >= 1 && totalDiasMes1 >= dia) {

                        System.out.println("El día " + dia + " es correcto");

                    } else {

                        System.out.println("El día " + dia + " es incorrecto");

                    }

                } else {

                    System.out.println("El mes " + mes + " no existe");

                }


            } else {

                System.out.println("El año " + anyo + " no es bisiesto");

                if(mes >=1 && mes <=12){

                    //Arrays, no lo hemos visto
                    int totalDiasMes2 = diasMesesAnyoNormal[mes - 1];

                    System.out.println("El total de días de este mes será de " + totalDiasMes2 + " días");

                    if (dia >= 1 && totalDiasMes2 >= dia) {

                        System.out.println("El día " + dia + " es correcto");

                    } else {

                        System.out.println("El día " + dia + " es incorrecto");

                    }

                }else{

                     System.out.println("El mes " + mes + " no existe");

                }
                
            }
            
        }else{
            
             System.out.println("El año " + anyo + " no existe");
                    
        }

        System.out.println("dia: " + dia + " mes: " + mes + " año: " + anyo);

    }

}
