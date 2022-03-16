/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abrahamharos.practicauno;

/**
 *
 * @author abrahamharos
 */
public class Converter {
    final private From from;
    final private To to;
    
    public Converter(From from, To to) {
        this.from = from;
        this.to = to;
    }
    
    final public String convert(String s) {
        int temp = this.from.from(s);
        String output = this.to.to(temp);
        
        return output;
    }
    
}
