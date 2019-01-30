/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_2;

/**
 *
 * @author Samuel
 */
public class Boletin19_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase obx = new Clase();
        int[] prueba= new int[6];
        prueba=obx.notaAlumn(prueba);
        obx.notaMedia(prueba);
        obx.notaAlta(prueba);
    }
}
