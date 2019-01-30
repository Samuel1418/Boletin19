/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Clase {

    public int[] notaAlumn(int[] notaAlumn) {
        int j = 6;
        for (int i = 0; i < j; i++) {
            notaAlumn[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Nota de Alumno"));
        }
        return notaAlumn;
    }

    public String[] nomeAlumno(String[] nomeAlumno) {
        int j = 6;
        for (int i = 0; i < j; i++) {
            nomeAlumno[i] = JOptionPane.showInputDialog(null, "Nome de Alumno");
        }
        return nomeAlumno;
    }

  
    public void notasYAlumnos(String[] nomeAlumno, int[] notaAlumn){
    for(int j=0;j<notaAlumn.length;j++){
        nomeAlumno[j]=JOptionPane.showInputDialog(null, "Nome de Alumno");
         notaAlumn[j]=Integer.parseInt(JOptionPane.showInputDialog(null, "Nota de Alumno"));
         System.out.println(nomeAlumno[j]+"   "+notaAlumn[j]);
    }
    }
    
    public void notaMedia(int[] notaAlumn) {
        float media = (float) 0.0;
        for (int i = 0; i < notaAlumn.length; i++) {
            media = media + notaAlumn[i];
        }
        JOptionPane.showMessageDialog(null, "La nota media es: " + (media / 6));
    }

    public void notaAlta(int[] notaAlumn) {
        int numMayor = 0;
        int numMenor = 0;
        for (int i=0;i<notaAlumn.length;i++) {
            if (notaAlumn[i] > numMayor) {
                numMayor= notaAlumn[i];
            } else {
                numMenor= notaAlumn[i];
            }
        }
        JOptionPane.showMessageDialog(null, "La nota mas alta es: " + numMayor);
    }

    public void notaAlumno(String[] nomeAlumno, int[] notaAlumn) {
        String nom = JOptionPane.showInputDialog(null, "Introduzca nome do alumno do que necesite a nota");
        for (int i = 0; i < notaAlumn.length - 1; i++) {
            for (int j = 0; j < nomeAlumno.length - 1; j++) {
                if (nomeAlumno[j].equals(nom)) {
                    JOptionPane.showMessageDialog(null, "La nota del alumno " + nom + " es: " + notaAlumn[i]);
                    break;
                }
            }
break;
        }
    }

    public void alumnosAprobados(String[] nomeAlumno, int[] notaAlum) {
        for (int i = 0; i < notaAlum.length; i++) {
            if (notaAlum[i] >= 5) {
                System.out.println(notaAlum[i] + " " + nomeAlumno[i]);
            }
        }
    }

    public void notasOrdenadas(String[] nomeAlumno, int[] notaAlumn) {
        int aux;
        String auxs;
        for (int i = 0; i < notaAlumn.length - 1; i++) {
            for (int j = i + 1; j < notaAlumn.length; j++) {
                if (notaAlumn[i] > notaAlumn[j]) {
                    aux = notaAlumn[i];
                    notaAlumn[i] = notaAlumn[j];
                    notaAlumn[j] = aux;
                    auxs = nomeAlumno[i];
                    nomeAlumno[i] = nomeAlumno[j];
                    nomeAlumno[j] = auxs;
                }
            }
        }
        System.out.println("Notas ordenadas");
        for (int i = 0; i < notaAlumn.length; i++) {
            System.out.println(notaAlumn[i] + nomeAlumno[i]);
        }
    }

}
