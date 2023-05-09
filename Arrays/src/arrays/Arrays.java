package arrays;

import static java.lang.System.exit;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Daniel Herrera
 */
public class Arrays {

   
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Introduce el numero de alumnos");
        int numeroAlumnos = sc.nextInt();

        String alumnosNombreApellido[] = new String[numeroAlumnos];

        double arrayT1[] = new double[numeroAlumnos];
        double arrayT2[] = new double[numeroAlumnos];
        double arrayT3[] = new double[numeroAlumnos];
        double arrayNotaFinal[] = new double[numeroAlumnos];

        double notasMedias[] = new double[4];
        double maxs[] = new double[4];
        double mins[] = new double[4];
        double porcentajes[] = new double[4];
        int longitud =0;
        
        for (int i = 0; i < numeroAlumnos; i++) {
            sc.nextLine();
            System.out.println("Introduce tu nombre y apellidos (máx 30 caract)");
            alumnosNombreApellido[i] = sc.nextLine();
            longitud = alumnosNombreApellido[i].length();
            if(longitud<=30){
                System.out.println("Nombre y apellidos introducidos correctamente");
            }else{
                System.out.println("Tu nombre y apellidos sobrepasan el máximo permitido. Adiós. XD");
                exit(0);
            }
            System.out.println("Introduce la nota del 1er Trimestre");
            arrayT1[i] = sc.nextDouble();
            System.out.println("Introduce la nota del 2ndo Trimestre");
            arrayT2[i] = sc.nextDouble();
            System.out.println("Introduce la nota del 3er Trimestre");
            arrayT3[i] = sc.nextDouble();
            arrayNotaFinal[i] = (arrayT1[i] + arrayT2[i] + arrayT3[i]) / 3;
        }

        for (int i = 0; i < numeroAlumnos; i++) {
            notasMedias[0] += (arrayT1[i] / numeroAlumnos);
            notasMedias[1] += (arrayT2[i] / numeroAlumnos);
            notasMedias[2] += (arrayT3[i] / numeroAlumnos);
            notasMedias[3] += (arrayNotaFinal[i] / numeroAlumnos);
        }

        for (int i = 0; i < 4; i++) {
            maxs[i] = 0.0;
            mins[i] = 10.0;
        }

        for (int i = 0; i < numeroAlumnos; i++) {
            if (arrayT1[i] > maxs[0]) {
                maxs[0] = arrayT1[i];
            }

            if (arrayT1[i] < mins[0]) {
                mins[0] = arrayT1[i];
            }

            if (arrayT2[i] > maxs[1]) {
                maxs[1] = arrayT2[i];
            }

            if (arrayT2[i] < mins[1]) {
                mins[1] = arrayT2[i];
            }

            if (arrayT3[i] > maxs[2]) {
                maxs[2] = arrayT3[i];
            }

            if (arrayT3[i] < mins[2]) {
                mins[2] = arrayT3[i];
            }

            if (arrayNotaFinal[i] > maxs[3]) {
                maxs[3] = arrayNotaFinal[i];
            }

            if (arrayNotaFinal[i] < mins[3]) {
                mins[3] = arrayNotaFinal[i];
            }

        }

        for (int i = 0; i < 4; i++) {
            porcentajes[i] = 0.0;
        }

        for (int i = 0; i < numeroAlumnos; i++) {
            if (arrayT1[i] >= 5) {
                porcentajes[0] += 1;
            }
            if (arrayT2[i] >= 5) {
                porcentajes[1] += 1;
            }
            if (arrayT3[i] >= 5) {
                porcentajes[2] += 1;
            }
            if (arrayNotaFinal[i] >= 5) {
                porcentajes[3] += 1;
            }
        }
        
        porcentajes[0] = (porcentajes[0]/numeroAlumnos)*100;
        porcentajes[1] = (porcentajes[1]/numeroAlumnos)*100;
        porcentajes[2] = (porcentajes[2]/numeroAlumnos)*100;
        porcentajes[3] = (porcentajes[3]/numeroAlumnos)*100;

        System.out.println("Nombre y Apellidos \t\t\t    Notas t1 \t   Notas t2 \t   Notas t3 \t  Notas Fin");
        System.out.println("---------------------------------------------------------------------------------------------------");
        for (int i = 0; i < alumnosNombreApellido.length; i++) {
            System.out.print(alumnosNombreApellido[i] + "\t\t\t\t" + df.format(arrayT1[i]) + "\t\t" + df.format(arrayT2[i]) + "\t\t" + df.format(arrayT3[i]) + "\t\t"+df.format(arrayNotaFinal[i]));
            System.out.println("");
        }
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Nota media \t\t\t\t\t" + df.format(notasMedias[0]) + "\t\t" + df.format(notasMedias[1]) + "\t\t" + df.format(notasMedias[2]) + "\t\t" + df.format(notasMedias[3]));
        System.out.println("Nota máxima \t\t\t\t\t" + df.format(maxs[0]) + "\t\t" + df.format(maxs[1]) + "\t\t" + df.format(maxs[2]) + "\t\t" + df.format(maxs[3]));
        System.out.println("Nota mínima \t\t\t\t\t" + df.format(mins[0]) + "\t\t" + df.format(mins[1]) + "\t\t" + df.format(mins[2]) + "\t\t" + df.format(mins[3]));
        System.out.println("Porcen. Apro \t\t\t\t\t" + df.format(porcentajes[0])+" %" + "\t\t" + df.format(porcentajes[1])+" %" + "\t\t" + df.format(porcentajes[2])+" %" + "\t\t" + df.format(porcentajes[3])+" %");

        sc.close();

    }
}
