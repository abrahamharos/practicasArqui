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
        
        System.out.println("-- Ingrese valores numéricos para ver su representación textual --");
        String number;
        while (true) {
            try {
                System.out.println("Ingrese un valor [1-9999]: ");
                number = sca.next();
                String cardinal = converter.convert(number);
                System.out.println(cardinal);
            } catch(NumberFormatException e) {
                System.out.println("Formato de número invalido. Por favor, vuelva a intentar.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.toString());
                break;
            }
        }
    }
}
