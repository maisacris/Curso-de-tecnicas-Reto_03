package com.company;

import java.util.Scanner;

public class PuntoUno {


    public void IngresoDeNumeros (int n,int m){
        int j,i;
        int [][] bancoDenNumeros = new int [n][m];
        Scanner ingreso = new Scanner(System.in);


        System.out.println("ingrese los datos que quiere guardar en la matriz");

        for(i=0; i<n;i++){

            for (j=0; j<m;j++)
            {
                bancoDenNumeros[i][j]= ingreso.nextInt();
            }

        }
        System.out.println("la matriz es: ");
        for(i=0; i<n;i++){
            for(j=0;j<m;j++){

                System.out.print(bancoDenNumeros[i][j]+" ");
            }
            System.out.println(" ");

        }

    }
}
