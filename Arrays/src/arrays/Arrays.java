/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author dani
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        Scanner sc = new Scanner(System.in);
        int misenteros[];
        misenteros = new int[5];

        boolean misbool[];
        misbool = new boolean[5];

        char mischar[];
        mischar = new char[5];
        int indice;
        int suma = 0;
        double media = 0.0;

        for (indice = 0; indice < 5; indice++) {
            System.out.println("Introduce un entero, un booleano y un char separados por un espacio en blanco para la posicion la " + indice + ":");
            misenteros[indice] = Integer.parseInt(sc.next());
            misbool[indice] = Boolean.parseBoolean(sc.next());
            mischar[indice] = sc.next().charAt(0);
        }

        for (indice = 0; indice < 5; indice++) {
            System.out.println("El entero, el booleano y el char para la posicion la " + indice + " es " + misenteros[indice] + " " + misbool[indice] + " " + mischar[indice]);
        }

        for (indice = 0; indice < 5; indice++) {
            suma = suma + misenteros[indice];
        }

        media = suma / indice;

        System.out.println("La suma del conjunto de numeros enteros es: " + suma + " y la media del conjunto es " + media);
        
         */
        //Insertar por teclado 5 enteros y guardarlos en un array y calcular su suma.
        /*
        Scanner sc = new Scanner(System.in);

        int misenteros[] = new int[5];
        
        
        for(int i =0;i<5;i++){
                misenteros[i]=Integer.parseInt(sc.next());
   
        }
        
        for(int i =0;i<5;i++){
              
                        System.out.println(i+" = " +   misenteros[i]);
   
        }
         */
        //
        /*
        int arrayDeEnteros[] = {5, 6, 0, 5, 1};

        for (int i = 0; i < arrayDeEnteros.length; i++) {

            for (int e = 0; e < arrayDeEnteros[i]; e++) {

                System.out.print("* ");

            }
            System.out.println("");
        }

        Scanner sc = new Scanner(System.in);
        double test = Double.parseDouble(sc.next());

        //System.out.printf("Altura media: %.2f metros%n", media);
         */
 /*
        declarar tres arrays de tipo double a1 , a2, a3 de un numero entero 
                solicitado por consola, pida valores para a1, a2 y calcule a3 = (a1 +a2)/2 (notas medias de los alumnos)
         */
 /*
        Scanner sc = new Scanner(System.in);

        double media;

        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidad = sc.nextInt();

        System.out.print("Ingrese el nombre de cada alumno ");
        String nombreAlumno[] = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            nombreAlumno[i] = sc.next();
        }

        double[] notasA1 = new double[cantidad];

        System.out.println("Ingrese las notas del primer trimestre:");
        for (int i = 0; i < cantidad; i++) {
            notasA1[i] = sc.nextDouble();
        }

        double[] notasA2 = new double[cantidad];
        int contadorAprobados = 0;
        int contadorSuspendidos = 0;
        double alumnosAprobados;
        double alumnosSuspendidos;

        double notaMax1 = 0.0;
        double notaMax2 = 0.0;
        double notaMax = 0.0;

        System.out.println("Ingrese las notas del segundo trimestre:");
        for (int i = 0; i < cantidad; i++) {
            notasA2[i] = sc.nextDouble();
        }

        double[] notasA3 = new double[cantidad];

        for (int i = 0; i < notasA3.length; i++) {
            notasA3[i] = (notasA1[i] + notasA2[i]) / 2;
            System.out.println("La media del Alumno " + nombreAlumno[i] + " es: " + notasA3[i]);

            if (notasA3[i] >= 5) {
                contadorAprobados++;
            } else {
                contadorSuspendidos++;
            }

            if (notaMax1 <= notasA1[i]) {
                notaMax1 = notasA1[i];
            }

            if (notaMax2 <= notasA2[i]) {
                notaMax2 = notasA2[i];
            }
        }

        if (notaMax1 >= notaMax2) {
            notaMax = notaMax1;
        } else {
            notaMax = notaMax2;
        }

        alumnosAprobados = (((float) contadorAprobados / cantidad) * 100);
        alumnosSuspendidos = (((float) contadorSuspendidos / cantidad) * 100);

        System.out.printf("Alumnos aprobados = %.2f %n", alumnosAprobados);
        System.out.printf("Alumnos suspendidos = %.2f %n", alumnosSuspendidos);

        System.out.println("La nota máxima será   = " + notaMax);
        
        for (int i = 0; i < notasA1.length; i++) {   
            if(notasA1[i] == notaMax){
                 System.out.println("El alumno con la nota más alta será " + nombreAlumno[i]);
            }
        }
        
        for (int i = 0; i < notasA2.length; i++) {   
            if(notasA2[i] == notaMax){
                 System.out.println("El alumno con la nota más alta será " + nombreAlumno[i]);
            }
        }
        
         */
        //Inicialice un array con 10 numeros aleatorios de tipo entero entre 1 y 10
        // y que muestre cada elemento del array en orden inverso; el primero en ingresar el último en mostrarse
        /*
        int arrayEnteros[] = new int[10];
        for (int i = 0; i < arrayEnteros.length; i++) {
            arrayEnteros[i] = (int) (Math.random() * 10 + 1);
        }

        //orden creciente
        System.out.println("Orden Creciente");
        for (int i = 0; i < arrayEnteros.length; i++) {
            System.out.println("arrayEnteros[" + i + "] = " + arrayEnteros[i]);
        }

        System.out.println("");

        //orden decreciente
        System.out.println("Orden Decreciente");
        for (int i = arrayEnteros.length - 1; i >= 0; i--) {
            System.out.println("arrayEnteros[" + i + "] = " + arrayEnteros[i]);
           
        }
         */
        // 4 arrays
        /*
        Alumnos Nombre y Apellido
        Notas_t1
        Notas_t2
        Notas_t3
        Notafinal (nota promedio)
        (t1+t2+t3)/3+++
        
        LISTA:
        Nombre y apellidos  nOta 1er Trimestre   nota 2   nota tercero   nota final
        \t tabular   
        columna
        columna
        columna
        
        (nota media), califmás baja, calif mínima, porcentaje de aprobados
         */
 /*
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

        for (int i = 0; i < numeroAlumnos; i++) {
            sc.nextLine();
            System.out.println("Introduce tu nombre y el primer apellido (max 15 caract)");
            alumnosNombreApellido[i] = sc.nextLine();
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
            if (arrayT1[i] > maxs[0]) {// fer el mateix per t2, t3, fin
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

        System.out.println("Nombre y Apellido 1 \t    Notas t1 \t   Notas t2 \t   Notas t3 \t  Notas Fin");
        System.out.println("------------------------------------------------------------------------------------");
        for (int i = 0; i < alumnosNombreApellido.length; i++) {
            System.out.print(alumnosNombreApellido[i] + "\t\t\t" + df.format(arrayT1[i]) + "\t\t" + df.format(arrayT2[i]) + "\t\t" + df.format(arrayT3[i]) + "\t\t");
            System.out.printf(df.format(arrayNotaFinal[i]));
            System.out.println("");
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Nota media \t\t\t" + df.format(notasMedias[0]) + "\t\t" + df.format(notasMedias[1]) + "\t\t" + df.format(notasMedias[2]) + "\t\t" + df.format(notasMedias[3]));
        System.out.println("Nota máxima \t\t\t" + df.format(maxs[0]) + "\t\t" + df.format(maxs[1]) + "\t\t" + df.format(maxs[2]) + "\t\t" + df.format(maxs[3]));
        System.out.println("Nota mínima \t\t\t" + df.format(mins[0]) + "\t\t" + df.format(mins[1]) + "\t\t" + df.format(mins[2]) + "\t\t" + df.format(mins[3]));
        System.out.println("Porcen. Apro \t\t\t" + df.format(porcentajes[0])+" %" + "\t\t" + df.format(porcentajes[1])+" %" + "\t\t" + df.format(porcentajes[2])+" %" + "\t\t" + df.format(porcentajes[3])+" %");

        sc.close();
        
         */

 /*
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
         
        double[] s = new double[12];
        double[] b = new double[12];
        double[] h = new double[12];
        double [] totalMes = new double[12];
        double [] totalSuc = new double[4];
        
        for (int i = 0; i < 12; i++) {
            System.out.println("mes"+(i+1));
            System.out.println("Introduce Sants");
            s[i]=sc.nextDouble();
            System.out.println("Introduce Badalona");
            b[i]=sc.nextDouble();
            System.out.println("Introduce Hospitalet");
            h[i]=sc.nextDouble();
            totalMes[i] = s[i]+b[i]+h[i];
        }
        
        for (int i = 0; i < 12; i++) {
            totalSuc[0] += s[i];
            totalSuc[1] += b[i];
            totalSuc[2] += h[i];
            totalSuc[3] += totalMes[i];
        }
        
        //Tabla datos
        System.out.println("\t\t\t   Sabadell \t\t    Badalona \t\t    Hospitalet \t\t    Total");
        for (int i = 0; i < 12; i++) {
            System.out.print("\t\t\t" + df.format(s[i]) + "\t\t\t" + df.format(b[i]) + "\t\t" + df.format(h[i]) + "\t\t" + df.format(totalMes[i]) + "\t\t");
            System.out.println("");
        }
        System.out.print("Ventas anuales barrio \t" +df.format(totalSuc[0]) + "\t\t\t" + df.format(totalSuc[1]) + "\t\t" + df.format(totalSuc[2]) + "\t\t" + df.format(totalSuc[3]) + "\t\t");
         */
        // DECLARACIÓN DE VARIABLES
        /*
        Scanner consola = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#,###.##");
        int indice, imesValto = 0, imesVbajo = 0;
        //String entradaDatos = "";
        double[] mesValto, mesVbajo;
        double[] sants, badalona, hospitalet, ventasTanuales, ventasTmensuales;

        // Inizialización de variables
        sants = new double[12];
        badalona = new double[12];
        hospitalet = new double[12];
        ventasTmensuales = new double[12];
        ventasTanuales = new double[4];
        mesValto = new double[4];
       
        mesVbajo = new double[4];
     
        // SOLICITUD DE DATOS POR CONSOLA
        System.out.println("Intoduzca las ventas de la sucursal de Sants");
        for (indice = 0; indice < sants.length; indice++) {
            System.out.println("Mes: " + (indice + 1));
            sants[indice] = consola.nextDouble();
        }    // recogemos todas las ventas de enero(0) a diciembre(11) de la sucursal de Sants

        System.out.println("Intoduzca las ventas de la sucursal de Badalona");
        for (indice = 0; indice < badalona.length; indice++) {
            System.out.println("Mes: " + (indice + 1));
            badalona[indice] = consola.nextDouble();
        }  // recogemos todas las ventas de enero(0) a diciembre(11) de la sucursal de Badalona

        System.out.println("Intoduzca las ventas de la sucursal de Hospitalet");
        for (indice = 0; indice < hospitalet.length; indice++) {
            System.out.println("Mes: " + (indice + 1));
            hospitalet[indice] = consola.nextDouble();
        }  // recogemos todas las ventas de enero(0) a diciembre(11) de la sucursal de Hospitalet

        // PROCESANDO... 
        for (indice = 0; indice < 12; indice++) { // calculamos las ventas TOTALES MENSUALES. 
            ventasTmensuales[indice] += (sants[indice] + badalona[indice] + hospitalet[indice]);
        }
        for (indice = 0; indice < 4; indice++) { // inizializamos los arrays a 0 antes de "llenarlos". 
            ventasTanuales[indice] = 0.0;
            mesValto[indice] = 0.0;
            mesVbajo[indice] = 100000.0;
        }
        for (indice = 0; indice < 12; indice++) { // calculamos las ventas TOTALES.
            ventasTanuales[0] += sants[indice];
            ventasTanuales[1] += badalona[indice];
            ventasTanuales[2] += hospitalet[indice];
            ventasTanuales[3] += ventasTmensuales[indice];
        }
        for (indice = 0; indice < 12; indice++) {// calculamos el mes de mayor/menor ventas. 
            if (sants[indice] > mesValto[0]) {
                mesValto[0] = sants[indice];
                //imesValto = indice;
            }
            if (sants[indice] < mesVbajo[0]) {
                mesVbajo[0] = sants[indice];
                //imesVbajo = indice;
            }
            if (badalona[indice] > mesValto[1]) {
                mesValto[1] = badalona[indice];
                //imesValto = indice;
            }
            if (badalona[indice] < mesVbajo[1]) {
                mesVbajo[1] = badalona[indice];
                //imesVbajo = indice;
            }
            if (hospitalet[indice] > mesValto[2]) {
                mesValto[2] = hospitalet[indice];
                //imesValto = indice;
            }
            if (hospitalet[indice] < mesVbajo[2]) {
                mesVbajo[2] = hospitalet[indice];
                //imesVbajo = indice;
            }
            if (ventasTmensuales[indice] > mesValto[3]) {
                mesValto[3] = ventasTmensuales[indice];
                //imesValto = indice;
            }
            if (ventasTmensuales[indice] < mesVbajo[3]) {
                mesVbajo[3] = ventasTmensuales[indice];
                //imesVbajo = indice;
            }
        }

        // SALIDA DE DATOS POR CONSOLA
        System.out.println("Mes\t\t\t|\tSants\t|\tBadalona\t|\tHospitalet\t|\tTotales");
        System.out.println("");
        for (indice = 0; indice < 12; indice++) {
            System.out.println((indice + 1) + "\t\t\t|\t" + formato.format(sants[indice]) + "\t|\t" + formato.format(badalona[indice]) + "\t\t|\t" + formato.format(hospitalet[indice]) + "\t\t|\t" + formato.format(ventasTmensuales[indice]));
        }
        System.out.println("");
        System.out.println("Resumen:");
        System.out.println("Ventas anuales:\t\t|\t" + formato.format(ventasTanuales[0]) + "\t|\t" + formato.format(ventasTanuales[1]) + "\t\t|\t" + formato.format(ventasTanuales[2]) + "\t\t|\t" + formato.format(ventasTanuales[3]) + "\t\t|\t");
        System.out.println("Mes + ventas:\t\t|\t" + formato.format(mesValto[0]) + "\t|\t" + formato.format(mesValto[1]) + "\t\t|\t" + formato.format(mesValto[2]) + "\t\t|\t" + formato.format(mesValto[3]));
        System.out.println("Mes - ventas:\t\t|\t" + formato.format(mesVbajo[0]) + "\t|\t" + formato.format(mesVbajo[1]) + "\t\t|\t" + formato.format(mesVbajo[2]) + "\t\t|\t" + formato.format(mesVbajo[3]));

        consola.close(); // cerramos el Sacnner
        // FIN DEL PROCESO. 
        
         */
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

 /*
            Quiero introducir una cadena de caracteres por pantalla,
            y quiero crear un arrayList de strings  con cada una de las palabras de la cadena
         */
 /*
        int contador = 0;
        ArrayList<String> listArrayDePalabras = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Introduce una frase");
        listArrayDePalabras.add(sc.nextLine()); 
       
        Iterator<String> iteratorListArrayDePalabras = listArrayDePalabras.iterator();
        while(iteratorListArrayDePalabras.hasNext()){
                String elemento = iteratorListArrayDePalabras.next();
                System.out.print(elemento+" / ");
                contador++;
        }
        
        System.out.println("contador = " + contador);
         */
 /*
        ArrayList<Integer> lista = new ArrayList<Integer>();

        lista.add(1);
        lista.add(2);
        lista.add(7);
        lista.add(3);

        System.out.println("lista = " + lista + " tamaño lista: " + lista.size());

        System.out.println("lista = " + lista.get(2));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
*/
        //proyecto nuevo , foreach
        ArrayList<Integer> cantidades = new ArrayList<Integer>();
        ArrayList<String> descripciones = new ArrayList<String>();
        ArrayList<Double> preciosUnitarios = new ArrayList<Double>();
        ArrayList<Double> importes = new ArrayList<Double>();
        
        int cantidad = 0;
        String descripcion = "";
        double precioUnitario = 0.0,importe = 0.0;
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println("Ingresa la cantidad del producto: "+i);
            cantidad = sc.nextInt();
            cantidades.add(cantidad);
            
            System.out.println("Ingresa la descripción del producto: "+i);
            descripcion = sc.next();
            descripciones.add(descripcion);
            
            System.out.println(":Ingresa el precio unitario del producto "+i);
            precioUnitario = sc.nextDouble();
            preciosUnitarios.add(precioUnitario);
            
            importe = cantidades.get(i) * preciosUnitarios.get(i);
            importes.add(importe);
            
            System.out.println(importes);
            
        }

    }
}
