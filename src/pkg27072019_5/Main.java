/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg27072019_5;

import java.util.Scanner;

/**
 *
 * @author wardog
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Scanner entradaDatos = new Scanner(System.in);
        int[] num = new int[4];
        int t_suma = 0, promedio = 0;

        System.out.println("=> Se reciben 4 numeros enteros\n"
                + "=> Se realiza la suma de los 4 y se guarda en una variable\n"
                + "=> Se ejecuta formula para promediar\n"
                + "=> Se despliega el resultado de cada operacion\n");

        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < 4; i++) {
            System.out.print("Ingresa el valor para la posicion [" + (i + 1) + "] :");
            num[i] = entradaDatos.nextInt();

        }

        for(int i = 0; i < 4; i++)
        {
            t_suma += num[i];
        }
        
        promedio = t_suma / 4;
        
        System.out.println("--------------------------------------------------------");

        System.out.println("Resultado de la ejecucion");
        System.out.println("Total de la suma = " + t_suma);
        System.out.println("El promedio es =  " + promedio);

    }
    
}
