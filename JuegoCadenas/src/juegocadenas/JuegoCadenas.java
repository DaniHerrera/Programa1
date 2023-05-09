package juegocadenas;

import java.util.Scanner;

public class JuegoCadenas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       /* String cadena;

        System.out.println("Introduce una cadena de prueba: ");
        cadena = sc.nextLine();

        System.out.println("Logitud de una cadena: " + cadena.length());
        System.out.println("La cadena empieza con hola: " + cadena.startsWith("hola"));
        System.out.println("Eliminamos espacios en blanco al principio y final de la cadena: " + cadena.trim());
        System.out.println("Remplazamos un caracter con otro: " + cadena.replace('l', 'k'));
        System.out.println("Revisamos si la cadena está vacía: " + cadena.isEmpty());
*/
        String nombreCompleto, nombre, apellido1, apellido2;
       
        System.out.println("Escribe tu nombre con apellidos");

        nombre = sc.next();
        apellido1 = sc.next();
        apellido2 = sc.next();
        System.out.println("Tu nombre es: " + nombre + " " + apellido1 + " " + nombre);
    }

}

//pedir contraseña
//si es "adacadabra" entramos
//s ino acceso denegado