package com.company;

import java.util.Scanner;
import java.util.Vector;

public class PuntoCuatro {

        public static void ProductoCruz(int tamaño){

            int i,j,k,m;


            int [] vectorU = new int [tamaño];
            int [] vectorV = new int[tamaño];
            Scanner numerosI = new Scanner(System.in);

            System.out.println(" ingrese los números del primer vector: ");
            for(i=0; i<vectorU.length; i++){

                vectorU[i] = numerosI.nextInt();
            }

            System.out.println("ingrese los números del segundo vector: ");
            for(j=0; j< vectorV.length; j++){

                vectorV[j] = numerosI.nextInt();
            }


            int u1 = vectorU[0],u2 = vectorU[1],u3 = vectorU[2];
            int v1= vectorV[0],v2= vectorV[1],v3= vectorV[2];
            int productoI = (u2*v3) - (v2*u3);
            int productoJ = (u1*v3) - (v1*u3);
            int productoK = (u1*v2) - (v1*u2);

            System.out.println("El producto cruz es: ");

            System.out.println("i("+productoI+")");
            System.out.println("J("+productoJ+")");
            System.out.println("K("+productoK+")");



        }






}










