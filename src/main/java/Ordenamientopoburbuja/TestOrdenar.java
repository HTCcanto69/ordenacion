/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamientopoburbuja;

/**
 *
 * @author Usuario
 */
public class TestOrdenar {
    public static void main(String[] args) {
        Integer[] vals = {15, 60, 8, 16, 44, 27, 12, 35};
        Ordena.burbuja(vals);
        for (Integer val : vals) {
            System.out.println(val);
        }
    }
}