package dialaborable;

import java.util.Scanner;
import java.lang.*;
import static java.lang.System.exit;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

public class DiaLaborable {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        String resultado = "";

        for (int i = 0; i < frase.length(); i++) {
            if (i == 0 || frase.charAt(i - 1) == ' ') {
                resultado += Character.toUpperCase(frase.charAt(i));
            } else {
                resultado += frase.charAt(i);
            }
        }

        System.out.println(resultado);

        scanner.close();

        //
         */
 /*
        double d = 656.45;
        String s = Double.toString(d);

        int posicionPunto = s.indexOf('.');
        System.out.println("posicionPunto = " + posicionPunto);

        System.out.println(posicionPunto + " digitos antes del punto decimal");

        System.out.println((s.length() - posicionPunto - 1) + " digitos después del punto decimal");
         */
 /*
        String str = "3646fdg346";

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                System.out.println((str.charAt(i)) + " es una letra o un caracter alfanumérico");

            } else {
                System.out.println(str.charAt(i) + " es un digito");
            }

        }
         */
 /*
        Realizar un programa que elimine los caracteres duplicados dentro de una cadena.
        Pasapalabra  ->  paslbr
         */
        //utilizar esto int posicionPunto = s.indexOf('.');
        //String cadena = "Pasapalabra";
        //eliminar caracteres duplicados en una cadena
        /*
        String cadena;
        String resultado = "";
        int i;

        Scanner sc = new Scanner(System.in);

        cadena = sc.nextLine();

        for (i = 0; i < cadena.length(); i++) {
            if (!resultado.contains("" + cadena.charAt(i))) { //sino contiene el caracter agregarlo
                resultado += cadena.charAt(i);
            }
        }

        System.out.println("result: " + resultado);
        
         */
 /*
        String str = "3646fdg346";
        String resultado = "";
        String resultadoNuevo = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                switch (str.charAt(i)) {
                    case '0':
                        resultado += "cero, ";
                        break;
                    case '1':
                        resultado += "uno, ";
                        break;
                    case '2':
                        resultado += "dos, ";
                        break;
                    case '3':
                        resultado += "tres, ";
                        break;
                    case '4':
                        resultado += "cuatro, ";
                        break;
                    case '5':
                        resultado += "cinco, ";
                        break;
                    case '6':
                        resultado += "seis, ";
                        break;
                    case '7':
                        resultado += "siete, ";
                        break;
                    case '8':
                        resultado += "ocho, ";
                        break;
                    case '9':
                        resultado += "nueve, ";
                        break;

                    default:
                        break;

                }

            }

        }
        
        System.out.println("Resultado: "+resultado);
        
        resultadoNuevo = resultado.substring(0, resultado.length()-2);
        
        System.out.println("Resultado Nuevo: "+resultadoNuevo);
         */
        // Recorrer 2 posiciones cada vocal
        // A --> I
        // E ->O
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        String resultado = "";
        char caracter;

        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);
            
            if (caracter == 'A' || caracter == 'a' || caracter == 'Á' || caracter == 'á'
                    || caracter == 'e' || caracter == 'E' || caracter == 'é' || caracter == 'É'
                    || caracter == 'i' || caracter == 'I' || caracter == 'í' || caracter == 'Í'
                    || caracter == 'o' || caracter == 'O' || caracter == 'ó' || caracter == 'Ó'
                    || caracter == 'u' || caracter == 'U' || caracter == 'ú' || caracter == 'Ú') {
            
                caracter += 8;
                
               
            }
            
            resultado += caracter;
            
        }

        System.out.println(resultado);

        scanner.close();
         */
 /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = scanner.nextLine();
        String nuevaFrase = "";
        String vocales = "aeiou";

        int posicion = 0;
        char c;

        for (int i = 0; i < frase.length(); i++) {
            c = frase.charAt(i);

            switch (c) {
                case 'a':
                case 'A':
                    posicion = 8;
                    break;
                case 'e':
                case 'E':
                    posicion = 10;
                    break;
                case 'i':
                case 'I':
                    posicion = 12;
                    break;
                case 'o':
                case 'O':
                    posicion = -14;
                    break;
                case 'u':
                case 'U':
                    posicion = -16;
                    break;
                default:
                    posicion = 0;
                    break;
            }

            c += posicion;

            nuevaFrase += c;
        }

        System.out.println("La frase con las vocales avanzadas dos posiciones (SIN CONTAR LAS TÍLDES) es: " + nuevaFrase);

         */
 /*
        
        String s = "blanco, rojo, verde y azul";

        StringTokenizer st = new StringTokenizer(s);

        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() +" Pass ");

        }
         */
        //Pedir un afrase al usuario y una palabar a buscar y contar las veces que aparece esa palabra en un texto
        //hola mundo, el mundo es tuyo
        //mundo
        //mundo aparece dos veces
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = scanner.nextLine();
        System.out.println("Introduzca la palabra a buscar");
        String palabra = scanner.nextLine();
        
        int contador = 0;
        
        StringTokenizer st = new StringTokenizer(frase);

        while (st.hasMoreTokens()) {
            if(palabra.equals(st.nextToken())){
                contador++;
            }
        }
        
        System.out.println("La palabra \""+palabra+"\" aparecerá "+contador+" veces");
         */
        // DECLARACIÓN VARIABLES:
        /*
        Scanner 
        consola = new Scanner(System.in);
        String frase;
        int repetidas = 0;

        // SOLICITUD DE DATOS POR CONSOLA
        System.out.println("Introduce una frase con palabras repetidas y contaremos el número de veces que se repiten");
        frase = consola.nextLine();
        String[] palabras = frase.split(" ");

        //PROCESANDO...
        for (int i = 0; i < palabras.length; i++) {
            for (int j = i + 1; j < palabras.length; j++) {
                if (palabras[i].equals(palabras[j])) {
                    repetidas++;
                }
            }
        }
        System.out.println("El número de palabras repetidas es: " + repetidas);
         */
        // fin del proceso
/*
        String cadena = "Luis Lopez desarrollador/Jesus Diaz estudiante/Jose Contreras Funcionario/";
        String nombre, apellido, ocupacion;
        StringTokenizer st = new StringTokenizer(cadena, " /");

        while (st.hasMoreTokens()) {
            nombre = st.nextToken();
            apellido = st.nextToken();
            ocupacion = st.nextToken();
            System.out.println(nombre + " " + apellido + " " + ocupacion);
        }
         */
 /*
        Escribir un texto que contenga varias palabras separadas por espacios en blanco, y 
        queramos invertir el orden de las palabras. Por ejemplo, si el texto es
        "hola mundo cómo estás", queremos obtener el texto "estás cómo mundo hola".
         */

 /*
        String texto = "Hola Juan este verano no podrás ir a la playa con la pierna rota";
        StringBuilder sb = new StringBuilder(texto);
        int ultimoIndicePalabra = texto.length() - 1;
        StringBuilder resultado = new StringBuilder();

        for (int i = texto.length() - 1; i >= 0; i--) {
            if (texto.charAt(i) == ' ') {
                resultado.append(sb.substring(i + 1, ultimoIndicePalabra + 1)).append(" ");
                ultimoIndicePalabra = i;
            }
        }

        //Añadimos forzando la última palabra, ya que no hay espacio en blanco al inicio de la frase
        resultado.append(sb.substring(0, ultimoIndicePalabra + 1));
        
        System.out.println(texto);
        System.out.println(resultado);
         */
 /*
        int i;
        int dia = (int)(Math.random() * 7) + 1; // genera un número aleatorio

        System.out.println("dia = " + dia);
        
        for ( i = 0; i < 5; i++) {
            
            System.out.println(Math.random());
            
        }
         */
 /*
        List<Integer> numeros = new ArrayList<Integer>();
        for (int i = 1; i <= 7; i++) {
            numeros.add(i);
        }
        Collections.shuffle(numeros, new Random());

        String[] nombres = {"Francisco", "Franco", "Daniel", "Monica", "Isabel", "Gabriel", "Raul"};

        for (int i = 0; i < 7; i++) {
            int numero = numeros.get(i);
            String nombre = nombres[numero - 1];
            System.out.println(numero + " - " + nombre);
        }
         */
 /*
        int i;
        int opcion = (int) (Math.random() * 3) + 1; // genera un número aleatorio
        String resultado = "";

        System.out.println("Piedra, papel,tijera = " + opcion);

        switch (opcion) {
            case 1:
                resultado = "Piedra";     
                break;
            case 2:
                 resultado = "Papel";
                break;
            case 3:
                 resultado = "Tijera";
                break;
            default:
                resultado = "Nulo";
        }
        
        System.out.println("resultado = " + resultado);
         */
 /*
        tirada de tres dados y la suma total
         */
 /*
        int opcion = 0;
        int resultado = 0;

          for (int i = 1; i < 4; i++) {
          
               opcion = (int) (Math.random() * 6) + 1; // genera un número aleatorio
               
               System.out.println("Tirada = " + i + " Resultado: "+opcion);
               
               resultado += opcion;
          }
          
          System.out.println("La suma de las tres tiradas será de " + resultado + " puntos" );
         */
 /*
        int opcion = 0;
        int resultado = 0;
        int max = 10;
        int min = 0;
        int range = max - min + 1;

          for (int i = 1; i < 21; i++) {
          
               opcion = (int)(Math.random() * range) + min;
               
               System.out.print(opcion+" ");
               
              
          }
          
         */
 /*
        int opcion = 0;
        int resultado = 0;
        int max = 199;
        int min = 100;
        int range = max - min + 1;
        
        int numeroMaximo=100;
        int numeroMinimo=199;
        double avg = 0;

          for (int i = 1; i < 51; i++) {
          
               opcion = (int)(Math.random() * range) + min;
               
               System.out.print(opcion+" ");
               
               if(numeroMaximo <= opcion){
                   numeroMaximo = opcion;
               }
               
                if(numeroMinimo >= opcion){
                   numeroMinimo = opcion;
               }
               
               avg += opcion;
          }
         System.out.println("");
         System.out.println("La media será de  = " + avg/50 );
         System.out.println("El menor será  = " + numeroMinimo);
         System.out.println("El mayor será  = " + numeroMaximo );
         */
        // EJERICIO: sacar numeros aleatorios que sean pares, el programa debe finalizar cuando encuentre el 38
        /*
        int opcion = 0;
        int max = 100;
        int min = 0;
        int range = max - min + 1;

        while (true) {

            opcion = (int) (Math.random() * range) + min;

            if (opcion % 2 == 0) {

                System.out.print(opcion + " ");

            }
            if (opcion == 38) {
                break;
            }

        }
         */
        //Numero azar entre o y 20. el usuario debe adivinarlo y tiene 5 oportunidades. 
        //despues de cada intento fallido ha de decir las oportunidades 
        //que restan y si el numero introducido es mayor o menor que el número secreto
        /*
        int secretNumber = 0,numberIntroducido=0;
        int max = 20;
        int min = 0;
        int contadorOportunidades = 5;
        
        int range = max - min + 1;
        Scanner sc = new Scanner(System.in);
        
        secretNumber = (int) (Math.random() * range) + min;
        
        //System.out.println("secretNumber = " + secretNumber);

        while (true) {

            System.out.println("Introduce el número que creas que es entre 0 y 20");
         
            numberIntroducido = sc.nextInt();

            if (numberIntroducido < secretNumber) {
                System.out.println("El número introducido es menor que el secreto");
                contadorOportunidades--;
                System.out.println("Te quedan "+contadorOportunidades+" oportunidades");

            }
            if (numberIntroducido > secretNumber) {
               System.out.println("El número introducido es mayor que el secreto");
               contadorOportunidades--;
               System.out.println("Te quedan "+contadorOportunidades+" oportunidades");
            }
            if (numberIntroducido == secretNumber) {
                System.out.println("HAS GANADO");
                break;
            }
            if(contadorOportunidades==0){
                System.out.println("HAS PERDIDO");
                break;
            }
            
        }
         */
        // FIN DEL PROCESO.
        /*
        Mostrar 20 notas al azar
        y quemuestre los suspensos, suf, bien,notable,sobresaliente y excelente
         */
 /*
        double secretNumber = 0.0;
        int max = 10;
        int min = 0;
        int contadorNotas = 1;

        int range = max - min + 1;
        Scanner sc = new Scanner(System.in);
 
        while (contadorNotas < 21) {

            secretNumber = (double) (Math.random() * range) + min;
            
            if (secretNumber<5){
                System.out.println(contadorNotas+"-) Nota: "+df.format(secretNumber)+" : Suspendido");
            
            }else if(secretNumber>=5 &&secretNumber<6 ){
                 System.out.println(contadorNotas+"-) Nota: "+df.format(secretNumber)+" : Aprobado");
                
            }else if(secretNumber>=6 &&secretNumber<7 ){
                 System.out.println(contadorNotas+"-) Nota: "+df.format(secretNumber)+" : Bien");
            }else if(secretNumber>=7 &&secretNumber<9 ){
                 System.out.println(contadorNotas+"-) Nota: "+df.format(secretNumber)+" : Notable");
            }else if(secretNumber>=9 &&secretNumber<=10 ){
                System.out.println(contadorNotas+"-) Nota: "+df.format(secretNumber)+" : Excelente");
            }else{
                System.out.println("Nota: "+df.format(secretNumber)+ " MATRICULA DE HONOR !!");
            }

            contadorNotas++;
        }
         */
 /**/
 /*
        int notas = 0;
        int suspensos = 0, suficientes = 0, bienes = 0, notables = 0, sobresalientes = 0, excelentes = 0;

        for(int i = 0; i<=20; i++) {
            notas = (int)(Math.random()*10+1);

            switch (notas) {
                case 1:
                case 2:
                case 3:
                case 4:
                                            
                System.out.print("Suspenso ,");
                suspensos++;
                break;
                case 5:
                System.out.print("Suficiente ,");
                suficientes++;
                  break;
                case 6:
                System.out.print("Bien ,");
                bienes++;
                  break;
                case 7:
                case 8:    
                System.out.print("Notable ,");
                notables++;
                  break;
                case 9:
                System.out.print("Sobresaliente ,");
                sobresalientes++;
                  break;
                case 10: 
                System.out.print("Excelente ,");
                excelentes++;
                  break;
            }
        }
        System.out.println("");
        System.out.println("Hay " + suspensos + " suspendidos.");
        System.out.println("Hay " + suficientes + " suficientes.");
        System.out.println("Hay " + bienes + " bienes.");
        System.out.println("Hay " + notables + " notables.");
        System.out.println("Hay " + sobresalientes + " sobresalientes. ");
        System.out.println("Hay " + excelentes + " excelentes.");
         */
        //PROGRAMA QUE SIMULE LA TIRADA DE LOS DOS DADOS. EL PROGRAMA DEBERÁCONTINUAR HASTA QUE TENGAN EL MISMO VALOR
        int dado1,dado2 = 0;
      
        while(true) {
            dado1 = (int) (Math.random() * 6 + 1);
            dado2 = (int) (Math.random() * 6 + 1);
            
             System.out.println(dado1 +" - "+ dado2);
             
            if(dado1==dado2){
                System.out.println("Son iguales");
                break;
            }
        }

    }// fin del main
}// fin de la clase

