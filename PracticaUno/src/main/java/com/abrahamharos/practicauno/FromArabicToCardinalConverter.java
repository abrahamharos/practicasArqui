/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abrahamharos.practicauno;

/**
 *
 * @author abrahamharos
 */
public class FromArabicToCardinalConverter {
    private Converter converter;
    
    public FromArabicToCardinalConverter() {
        FromArabic fa = new FromArabic();
        ToCardinal tc = new ToCardinal();
        
        this.converter = new Converter(fa, tc);
    }
    
    public String convert(String s) {
        return this.converter.convert(s);
    }
}
