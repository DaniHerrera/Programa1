package cadenasolovocales;

import java.util.Scanner;

public class CadenaSoloVocales {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el String");
        
        String cadena = sc.nextLine();
        char caracter;
        int contador = 0;
        int contadorPar = 0;
      
        
        for (int i = 0; i < cadena.length(); i++) {

            caracter = cadena.charAt(i);

            /*if (caracter == 'A' || caracter == 'a' || caracter == 'Á' || caracter == 'á'
                    || caracter == 'e' || caracter == 'E' || caracter == 'é' || caracter == 'É'
                    || caracter == 'i' || caracter == 'I' || caracter == 'í' || caracter == 'Í'
                    || caracter == 'o' || caracter == 'O' || caracter == 'ó' || caracter == 'Ó'
                    || caracter == 'u' || caracter == 'U' || caracter == 'ú' || caracter == 'Ú') {
                
                System.out.print(cadena.charAt(i));
                contador++;
            }*/
            
            //Saque de la cadena la posición par
            
            if(i%2 == 0){
                 System.out.println("Posición par: "+i+" caracter "+cadena.charAt(i));
                 contadorPar++;
            }
            
        
            
        }
        
        System.out.println("");
        //System.out.println("La frase: \""+cadena+"\" contiene "+contador+" vocales");
        System.out.println("La frase: \""+cadena+"\" contiene "+contadorPar+" posiciones pares");
    }

}
