package operadoresincrementalesydecrementales;

public class OperadoresIncrementalesYDecrementales {

    public static void main(String[] args) {

        //Qué se imprime por pantalla?
        //Què s'imprimeix per pantalla?
        int total = 10;
        int contador = 4;

        //total -= --contador;  
        total = --contador;

        // contador = contador  -1 
        // se iguala a lo que haya en la izquierda
        // contador = 3;
        // total = 3;
        System.out.println(contador);

        System.out.println(total);

        //Qué calcula nuestro método misterio
        //? Què  calcula el nostre mètode misteri?
        int returnMisterio = 0;
        returnMisterio = misterio(2, 7);

        System.out.println("returnMisterio = " + returnMisterio);

         System.out.println("******este**************"); //3
         
        int x = 2;
        int y = 2;
        int z;

        z = x++ + x + x++ +x +y;
  
        System.out.println("x:" +x);
        System.out.println("y:" +y);
        System.out.println("z:" +z);
        
        
        int a = 2;
        int b = 2;
        int c;

        c = a++ + b;

         System.out.println("**************************"); //3
        
        System.out.println(a); //3
        System.out.println(b); //2
        System.out.println(c); //4

        c = ++a + b;

        System.out.println(a); //4
        System.out.println(b); //2
        System.out.println(c); //6

    }

    public static int misterio(int uno, int dos) {
        int calculo = 1;
        for (int x = 0; x < dos; x++) {
            calculo = calculo * uno;
        }
        return calculo;
    }

}
