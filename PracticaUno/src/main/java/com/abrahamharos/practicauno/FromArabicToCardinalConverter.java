/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abrahamharos.practicauno;

/**
 *
 * @author abrahamharos
 */
public class FromArabicToCardinalConverter extends Converter {
    public FromArabicToCardinalConverter() {
        super(new FromArabic(), new ToCardinal());
    }
}
