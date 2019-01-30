/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Calculo {

    int numDNI;

    public void sacarLetra(int[] num, String[] letra) {
        numDNI = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca los numeros del DNI por favor"));
        int compar = numDNI % 23;
        for (int i = 0; i < num.length; i++) {
            if (compar == num[i]) {
                System.out.println("El DNI " + num[i]+ " tiene la letra " + letra[i]);
            }
        }
    }
}
