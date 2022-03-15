/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abrahamharos.practicauno;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

/**
 *
 * @author abrahamharos
 */
public class ToCardinal implements To {
    
    @Override
    public String to(int i) {
        JSONObject obj = this.loadJSON();

        String noventa = obj.getJSONObject("90").getString("plural");
        
        System.out.println(noventa);
        
        return "";
    }
    
    private JSONObject loadJSON() {
        try {
            Path path = Path.of("dict.json");
            
            String sDict = Files.readString(path);
            
            JSONObject obj = new JSONObject(sDict);
        
            return obj;
        } catch (IOException ex) {
            Logger.getLogger(ToCardinal.class.getName()).log(Level.SEVERE, null, ex);
            
            System.exit(1);
        }
        
        return new JSONObject();
    }
}
