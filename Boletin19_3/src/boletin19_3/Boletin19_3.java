/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_3;

/**
 *
 * @author Samuel
 */
public class Boletin19_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase obx = new Clase();
        int[] prueba = new int[6];
        String [] nombres= new String[6];
//        prueba = obx.notaAlumn(prueba);
//        nombres=obx.nomeAlumno(nombres);
        obx.notasYAlumnos(nombres, prueba);
        obx.notaAlta(prueba);
        obx.notaAlumno(nombres, prueba);
        
    }

}
