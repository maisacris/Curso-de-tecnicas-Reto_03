package com.company;

import java.util.Scanner;

public class PuntoTres {

    static void MultiplicacionVectorial(int tamañoVector) {


        Scanner entrada = new Scanner(System.in);

        //tamañoVector= Integer.parseInt(JOptionPane.showInputDialog("Inserte el tamaño de los vectores"));

        int[] vector1 = new int[tamañoVector];
        int[] vector2 = new int[tamañoVector];
        int[] vectorFinal = new int[tamañoVector];
        int i;
        int j;

        System.out.println("Inserte los números del primer vector");
        for (i = 0; i < tamañoVector; i++) {
            System.out.println((i + 1) + " Digite el número: ");
            vector1[i] = entrada.nextInt();
        }
        i = 0;

        System.out.println("Inserte los números del segundo vector");
        for (j = 0; j < tamañoVector; j++) {
            System.out.println((j + 1) + " Digite el número: ");
            vector2[j] = entrada.nextInt();
        }
        j = 0;

        System.out.println("El resultado de la multiplicación de los vectores es: ");
        for (int k = 0; k < tamañoVector; k++) {
            vectorFinal[k] = vector1[i] * vector2[j];
            i += 1;
            j += 1;
            System.out.println(vectorFinal[k]);
        }


    }
}
