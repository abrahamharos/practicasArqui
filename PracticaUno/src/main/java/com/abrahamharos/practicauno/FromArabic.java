/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abrahamharos.practicauno;

/**
 *
 * @author abrahamharos
 */
public class FromArabic implements From {
    @Override
    public int from(String s) {
        return Integer.valueOf(s);
    }
}
