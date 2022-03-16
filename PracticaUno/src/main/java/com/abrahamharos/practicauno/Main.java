/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abrahamharos.practicauno;

/**
 *
 * @author abrahamharos
 */
public class Main {
    public static void main (String args[]) {
        String number = "5726";
        FromArabicToCardinalConverter converter = new FromArabicToCardinalConverter();
        
        String cardinal = converter.convert(number);
        System.out.println(cardinal);
    }
}
