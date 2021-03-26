package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// Reto 03: JHONNY GALEANO BARRERO Y MARIA ISABEL CORTES HERRERA

    PuntoUno matrizNporM = new PuntoUno();
    PuntoDos operacionM = new PuntoDos();
    PuntoTres multiplicacionIxJ = new PuntoTres();
    PuntoCuatro vectorR3 = new PuntoCuatro();
    int sizeN, sizeM;
    int sizeVector;
    int valueUser;
    int vectorR3size;
    //punto numero 1
    sizeN = Integer.parseInt(JOptionPane.showInputDialog("favor ingresar el valor n de la matriz"));
    sizeM = Integer.parseInt(JOptionPane.showInputDialog("favor ingresar el valor m de la matriz"));

    matrizNporM.IngresoDeNumeros(sizeN,sizeM);

    //punto numero 2
       operacionM.OperacionesVectoriales();

    //punto numero 3
    sizeVector = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero del tamaño de los vectores"));
    multiplicacionIxJ.MultiplicacionVectorial(sizeVector);


    //punto numero 4

        vectorR3size = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero 3 para activar el tamaño del vector"));
    vectorR3.ProductoCruz(vectorR3size);



    }
}
