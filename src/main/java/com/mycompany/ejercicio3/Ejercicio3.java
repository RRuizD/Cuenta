/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

/**
 *
 * @author DAW124
 */
public class Ejercicio3 {
    
    
    public static void rellenarEdad(int[][] Estudiantes) {
        for (int i = 0; i < Estudiantes[0].length; i++) {
            Estudiantes[0][i] = (int) Math.floor(Math.random()*9+17);
        }
    }
    
    public static void rellenarTrabajo(int[][] Estudiantes) {
        for (int i = 0; i < Estudiantes[0].length; i++) {
            Estudiantes[1][i] = (int) Math.floor(Math.random()*2+1);
        }
    }
    
    public static void rellenarSueldo(int[][] Estudiantes) {
        for (int i = 0; i < Estudiantes[0].length; i++) {
            if (Estudiantes[1][i] == 2) {
                Estudiantes[2][i] = 0 ;
            } else {
                Estudiantes[2][i] = (int) Math.floor(Math.random()*1401+600);
            }
        }
    }
    
    public static void imprimirMatriz(int[][] Estudiantes) {
       
        for (int i = 0; i < Estudiantes.length; i++) {
            
            for (int j = 0; j < Estudiantes[i].length; j++) {
                System.out.print(Estudiantes[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static double porcentajeEdad(int[][] Estudiantes, int edad) {
        double contador = 0;
        for (int i = 0; i < Estudiantes.length; i++) {
            if (edad == Estudiantes[0][i]) {
                contador++;
            }
        }
        return (contador/Estudiantes.length)*100;
    }
    
    public static double porcentajeEdadTrabajo(int[][] Estudiantes, int edad, int trabajo) {
        double contador = 0;
        for (int i = 0; i < Estudiantes.length; i++) {
            if (edad == Estudiantes[0][i] && trabajo == Estudiantes[1][i]) {
                contador++;
            }
        }
        return (contador/Estudiantes.length)*100;
    }
    
    public static double promedioSueldo(int[][] Estudiantes, int edad, int trabajo) {
        double media = 0; 
        int contador = 0;
        for (int i = 0; i < Estudiantes.length; i++) {
            if (edad == Estudiantes[0][i] && trabajo == Estudiantes[1][i]) {
                media += Estudiantes[2][i];
                contador++;
                
            }
        }
        return (media/contador);
    }
    public static void main(String[] args) {
        int[][] estudiantes = new int[3][25];
        
        
        rellenarEdad(estudiantes);
        rellenarTrabajo(estudiantes);
        rellenarSueldo(estudiantes);
        imprimirMatriz(estudiantes);
        System.out.println("Hay un porcentaje de estudiantes de 25 años de " + porcentajeEdad(estudiantes, 25) + "%");
        System.out.println("Hay un porcentaje de estudiantes de 19 años de " + porcentajeEdad(estudiantes, 19) + "%");
        System.out.println("Hay un porcentaje de " + porcentajeEdadTrabajo(estudiantes, 24, 1) + "% de estudiantes de 24 años que trabajan");
        System.out.println("Hay un porcentaje de " + porcentajeEdadTrabajo(estudiantes, 24, 2) + "% de estudiantes de 24 años que no trabajan");
        System.out.println("El sueldo medio de los estudiantes de 24 años es " + promedioSueldo(estudiantes, 24, 1) + "€");
        System.out.println("El sueldo medio de los estudiantes de 19 años es " + promedioSueldo(estudiantes, 19, 1) + "€");
        //A la hora de sacar el sueldo promedio a veces te lo saca bien y otras te pone NaN(Lo hablamos durante el examen)
    }
}
