/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provincias;

/**
 *
 * @author dani
 */
public class Provincias {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {

        String[] provincias = {"Catalunya", "Madrid", "Salamanca", "Galicia", "Las Palmas", "Lleida", "Almería"};
        int[][] estadisticas = {
            {5714730, 2791250, 2923480},
            {6751251, 3229700, 3521551},
            {327338, 158874, 168464},
            {1120134, 537000, 583134},
            {1128539, 545409, 583130},
            {439727, 224156, 215571},
            {31792, 373136, 358656}
        };
        
        obtenerProvinciasMayorPoblacion(provincias,estadisticas);
    
    }
    
    public static void obtenerProvinciasMayorPoblacion(String[] provincias,int [][] estadisticas){
    
        int mayorPoblacion =0;
        int mayorPoblacionHombres =0;
        int mayorPoblacionMujeres =0;
        
        int indice = 0;
        int indiceHombres = 0;
        int indiceMujeres = 0;
        
        //poblacion total, hombres, mujeres
        for (int i = 0; i < estadisticas.length; i++) {
            //catalunya,Madrid,etc..
            
            if(estadisticas[i][0]>mayorPoblacion){
                mayorPoblacion = estadisticas[i][0];
                indice = i;
            }
            
            if(estadisticas[i][1]>mayorPoblacionHombres){
                mayorPoblacionHombres = estadisticas[i][1];
                indiceHombres = i;
            }
            
            if(estadisticas[i][2]>mayorPoblacionMujeres){
                mayorPoblacionMujeres = estadisticas[i][2];
                indiceMujeres = i;
            }
            
            for (int j = 0; j < estadisticas[i].length; j++) {
                
                System.out.print("\t"+estadisticas[i][j]+"\t");
                
            }
            System.out.println("");
        }
        
        System.out.println("La provincia con mayor poblacion es "+provincias[indice]+" con "+mayorPoblacion+" habitantes");
        System.out.println("La provincia con mayor poblacion de hombres es "+provincias[indiceHombres]+" con "+mayorPoblacionHombres+" habitantes");
        System.out.println("La provincia con mayor poblacion de mujeres es "+provincias[indiceMujeres]+" con "+mayorPoblacionMujeres+" habitantes");
       
    }
}