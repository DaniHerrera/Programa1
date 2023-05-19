package hospital;

import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {

    /*
        Hospital, con varias areas pediatría, traumatología, urgencias, etc ...
        por cada area tenemos un número de camas,habitaciones, pacientes TRIMESTRALES 
        Se piden por pantalla las diferentes areas ( con while(true) ) .. cuando la 
        cadena sea un espacio en blanco saldremos.
        Querremos saber los pacientes ingresados por año (entiendo de que por cada especialidad )


                        HOSPITAL "MIHOST"
                        Traumatología, Pediatría, Neurología, Urología, Pediatría ...       Total Pacientes
        T1              878             454455
        T2
        T3  
        T4
        Total pacientes

        ** Pedir datos por teclado ( enteros ) ; como ejemplos anteriores pero con int **

        Falta por ver : arrayLists, funciones (métodos)
        Examen viernes 19 / 05 /2023
        
     */
    public static void main(String[] args) {
    
        String[] trimestres = {"1tr", "2tr", "3tr", "4tr"};
        ArrayList<String> areasHospital = new ArrayList<String>();
        
        areasHospital = introducirEspecialidades();

        visualizarAreasHospital(areasHospital);

        introducirPacientes(trimestres,areasHospital);

    }

    public static void visualizarAreasHospital(ArrayList<String> DatosAreas) {
        int indice = 0;
        System.out.println("");
        DatosAreas.forEach((aux) -> {
            System.out.println(aux);
        });
    }

    private static ArrayList<String> introducirEspecialidades() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> areasHospital = new ArrayList<String>();
        String areaHospital = "";

        while (true) {

            System.out.print("Introduce un area para el hospital: (cadena vacía salir / return )");
            areaHospital = sc.nextLine();
            if (areaHospital.equals("")) {
                break;
            }
            areasHospital.add(areaHospital);

        }

        System.out.print("Finalizamos la introducción de las areas");

        return areasHospital;
    }

    private static void introducirPacientes(String[] trimestres, ArrayList<String> areasHospital) {
        Scanner sc = new Scanner(System.in);
        int[][] pacientes = new int[trimestres.length][areasHospital.size()];
        int cantidad = 0;
        for (int i = 0; i < trimestres.length; i++) {
            for (int j = 0; j < areasHospital.size(); j++) {
                System.out.println("introduce el numero de pacientes para "+trimestres[i]+" y el area "+areasHospital.get(j));
                cantidad = sc.nextInt();
                pacientes[i][j] = cantidad;
                //System.out.println(pacientes[i][j]);
            }
        }
    }

}
