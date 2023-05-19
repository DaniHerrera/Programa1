/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;

/**
 *
 * @author dani
 */
public class Metodos {
    
    public static void main(String[] args) {
        String resultado = divisiblePor3(3, 10);
        System.out.println("resultado = " + resultado);
        double menor = menorDeDosNumeros(9, 5);
        System.out.println("menor = " + menor);
        
    }

    //escribe un método que imprima los numeros divisibles por 3 en el rango (3,10), de más pequeño a más grande
    private static String divisiblePor3(int numInicio, int numFinal) {
        
        String divisiblesPor3 = "";
        for (int i = numInicio; i <= numFinal; i++) {
            if (i % 3 == 0) {
                divisiblesPor3 += i + ", ";
            }
        }
        return divisiblesPor3;
        
    }
    
    private static double menorDeDosNumeros(double numero1, double numero2) {
        double mayor = (numero1 > numero2) ? numero1 : numero2;
        return mayor;
    }
    
}
