/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamientoporincersion;

/**
 *
 * @author Usuario
 */
public class Ordena {
    
    //Ordenamiento por inserción
    public static void insercion(Integer[] data) {
        for (int i = 1; i < data.length; i++) {
            Integer aux = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > aux) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = aux;
        }
    }
}