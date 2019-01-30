/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_1;

/**
 *
 * @author Samuel
 */
public class Numeros {
    public int[] numeros(int[] lista){
    int j=6;
    for(int i=0;i<j;i++){
        lista[i]= (int) (Math.random() * 50) + 1;
    }
    return lista;
}
    public void arrayVuelta(int[] lista){
    int valor= lista.length-1;
     for(int i=0;i<lista.length;i++){
         System.out.println(lista[valor]);
     valor--;
}
}
}
