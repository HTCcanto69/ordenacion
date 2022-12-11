/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamientoporseleccion;

/**
 *
 * @author Usuario
 */
public class Ordena {
    
    //Ordenamiento por selección
    public static void seleccion(Integer[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                if (data[i] > data[j]) {
                    Integer aux = data[j];
                    data[j] = data[i];
                    data[i] = aux;
                }
            }
        }
    }
}