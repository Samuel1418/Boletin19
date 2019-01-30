/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Clase {
    public int [] notaAlumn(int [] notaAlumn){
    int j=6;
    for(int i=0;i<j;i++){
        notaAlumn[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Nota de Alumno"));
    }
    return notaAlumn;
    }
//    public String [] nomeAlumno(String [] nomeAlumno){
//    int j=6;
//    for(int i=0;i<j;i++){
//        nomeAlumno[i]=JOptionPane.showInputDialog(null, "Nome de Alumno");
//    }
//    return nomeAlumno;
//    }
    
     public void notaMedia(int [] notaAlumn){
     float media=(float) 0.0;
     for (int i=0; i < notaAlumn.length; i++) {
     media = media + notaAlumn[i];
    }
     JOptionPane.showMessageDialog(null, "La nota media es: "+(media/6));
     }
     
     public void notaAlta(int [] notaAlumn){
     int numMayor=0;
     int numMenor=0;
     for (int i=0; i < notaAlumn.length; i++) {
     if(notaAlumn[i]>numMayor)
         numMayor=notaAlumn[i];
     else
         numMenor=notaAlumn[i];
    }
     JOptionPane.showMessageDialog(null, "La nota mas alta es es: "+numMayor);
     }
}
