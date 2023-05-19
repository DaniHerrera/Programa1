
import java.util.ArrayList;
import java.util.Scanner;


public class HospitalPacientes {

    public static Scanner consola = new Scanner(System.in); // DECLARACIÓN DEL SCANNER
    public static final String[] Trimestres = {"1r_Trimestre", "2n_Trimestre", "3r_Trimestre", "4o_Trimestre"};

    public static void main(String[] args) {
// DECLARACIÓN DE VARIABLES

        ArrayList<String> areasEspecialidades = new ArrayList<String>();
//int pacientes;
        areasEspecialidades = Introduccion_areas(areasEspecialidades);

        int[][] matrizPacientes = new int[areasEspecialidades.size()][Trimestres.length]; // DELARACIÓN DE LA MATRIZ (1r las filas y luego las columnas)

        Visualizacion_areas(areasEspecialidades);
        
    
// Recoremos la matriz con 1 for anidado, la 'i' recorrerá las filas y la 'j' las columnas. (mismo orden que en la deeclaración de la matriz)
        for (int i = 0; i < areasEspecialidades.size(); i++) { // por cada 'fila' recorre el 1r bucle
            System.out.println("Área de: " + areasEspecialidades.get(i));
            for (int j = 0; j < Trimestres.length; j++) { // por cada columna recore el 2n bucle
                System.out.println("Introduce el número de pacientes ingresados del " + Trimestres[j] + ": ");
                matrizPacientes[i][j] = consola.nextInt();
            }
        }
        System.out.println(matrizPacientes);
    } // FIN DEL MAIN

// SOLICITUD DE DATOS POR CONSOLA
    public static ArrayList<String> Introduccion_areas(ArrayList<String> areasEspecialidades) {
        String datosAux;
        do { // HAZ ESTO...
            System.out.print("Introduce las áreas o especialidades del hospital:");
            datosAux = consola.nextLine(); // Almacenamos la cadena en la variable auxiliar
            if (!datosAux.isEmpty()) { // Condición: si la cadena no está vacia...
                areasEspecialidades.add(datosAux); // Añadimos al ArrayList
            }
        } while (!datosAux.isEmpty()); // CONCICIÓN SALIDA: Mientras que la cadena sea diferente a vacía.
        return areasEspecialidades;
    } // fin del método - Introducción de datos

// VISUALIZACIÓN DE DATOS
    public static void Visualizacion_areas(ArrayList<String> areasEspecialidades) {
        int indice;
        System.out.println("Áreas o especialidades: ");
        for (indice = 0; indice < areasEspecialidades.size(); indice++) {
            System.out.println(areasEspecialidades.get(indice));
        }
    } // fin del método - Visualización de datos

}// fin de la clase
