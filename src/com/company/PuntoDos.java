package com.company;

import javax.swing.*;
import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.Stream;

public class PuntoDos {

    static void OperacionesVectoriales() {

        Scanner valorUser = new Scanner(System.in);
        double promedio;
        double suma = 0;
        double numMayor;
        double numMenor=0;
        String listaDeNumeros;
        int k;

        listaDeNumeros = JOptionPane.showInputDialog("ingrese los numeros separados por comas");


        String[] listaDeElementos = listaDeNumeros.split(",");
        int[] auxVector = Stream.of(listaDeElementos).mapToInt(Integer::parseInt).toArray();

            /*for(int i=0; i< listaDeElementos.length; i++)
            { System.out.println("Elemento del vector "+i+": "+listaDeElementos[i]); }*/

        for (int i = 0; i < auxVector.length; i++) {
            suma += auxVector[i];
        }

        System.out.println("el valor de la sumatoria es: " + suma);

        promedio = suma / auxVector.length;

        System.out.println("el promedio es: " + promedio);

        numMayor = auxVector[0];
        numMenor = auxVector[0];

        for(int i =0; i<auxVector.length; i++){

            if(auxVector[i]<numMenor){
                numMenor = auxVector[i];

            }

            if (auxVector[i]>numMayor){
                numMayor = auxVector[i];

            }
        }

        System.out.println("el número menor es: "+numMenor);
        System.out.println("el número mayor es: "+numMayor);
    }


}




