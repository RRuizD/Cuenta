/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tablaprintf;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 34622
 */
public class Tablaprintf {

    public static void main(String[] args) {
        System.out.printf("--------------------------------%n");
        System.out.printf("    Javas's primitives types    %n");
        System.out.printf("     (printf table ejemplo)     %n");
        System.out.printf("--------------------------------%n");
        System.out.printf("| %-10s | %-8s | %4s |%n","CATEGORY","NAME","BITS" );
        System.out.printf("--------------------------------%n");
        System.out.printf("| %-10s | %-8s | %04d |%n", "Floating", "double",  64);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Floating", "float",   32);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "long",    64);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "int",     32);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "char",    16);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "short",   16);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "byte",    8);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Boolean",  "boolean", 1);
        System.out.printf("--------------------------------%n");
        
        
        String texto4;
        int numerobarrasnodia2;
        float preciobarra2;
        texto4=JOptionPane.showInputDialog("Lee el numero de barras de pan que no son del día:");
        numerobarrasnodia2=Integer.parseInt(texto4);
        texto4=JOptionPane.showInputDialog("Dime cuanto cuesta cada barra");
        preciobarra2=Float.parseFloat(texto4);
        float diferencia=preciobarra2*(60/100f);
        float descuentototal2=(preciobarra2-diferencia)*numerobarrasnodia2;
        
        System.out.printf("El precio de una barra de pan es de: %.2f %n",preciobarra2);
        System.out.printf("A cada barra de pan se le descuentan %.2f %n",diferencia,"euros por no ser del dia");
        System.out.printf("El precio final con el descuento es de: %.2f %n",descuentototal2," euros");
        
        
        
       

    }
}
