/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abrahamharos.practicauno;

import java.util.Scanner;

/**
 *
 * @author abrahamharos
 */
public class Main {
    public static void main (String args[]) {
        Scanner sca = new Scanner(System.in);
        FromArabicToCardinalConverter converter = new FromArabicToCardinalConverter();
        
        System.out.println("-- Ingresa valores numéricos para ver su representación textual --");
        String number;
        while (true) {
            try {
                System.out.println("Ingresa un valor [1-9999]: ");
                number = sca.next();
                String cardinal = converter.convert(number);
                System.out.println(cardinal);
            } catch(Exception e) {
                break;
            }
        }
    }
}
