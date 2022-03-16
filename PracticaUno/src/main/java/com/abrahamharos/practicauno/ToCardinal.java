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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author abrahamharos
 */
public class ToCardinal implements To {
    
    @Override
    public String to(int i) {
        JSONObject obj = this.loadJSON();
        
        String number = String.valueOf(i);
        
        int index = 0;
        String currentNumber;
        String result = "";
        while (index < number.length()) {
            currentNumber = number.substring(index);
            char currentCharNumber = currentNumber.charAt(0);
            char nextCharNumber = ' ';
            if (index < number.length() - 1) {
                nextCharNumber = currentNumber.charAt(1);
            }
            
            // Determine ones, tens, hundreds, thousands
            String currentArabicNumber = "";
            // TODO: change variable name
            String pluralSingularFlag = "";
            if (nextCharNumber == '0') {
                pluralSingularFlag = "singular";
            } else {
                pluralSingularFlag = "plural";
            }
            
            Character[] specialTenCharactersArray = new Character[]{'1', '2', '3', '4', '5'};
            List<Character> specialTenCharactersList = new ArrayList<>(Arrays.asList(specialTenCharactersArray));
            if (currentCharNumber != '0') {
                switch(number.length() - index) {
                    case 1:
                        currentArabicNumber = obj.getJSONObject(currentCharNumber + "").getString(pluralSingularFlag);
                        break;
                    case 2: 
                        if (specialTenCharactersList.contains(nextCharNumber)) {
                            currentArabicNumber = obj.getJSONObject(currentCharNumber + "" + nextCharNumber).getString(pluralSingularFlag);
                            index++;
                        } else {
                            currentArabicNumber = obj.getJSONObject(currentCharNumber + "0").getString(pluralSingularFlag);
                        }
                        break;
                    case 3:
                        currentArabicNumber = obj.getJSONObject(currentCharNumber + "00").getString(pluralSingularFlag);
                        break;
                    case 4:
                        currentArabicNumber = obj.getJSONObject(currentCharNumber + "000").getString(pluralSingularFlag);
                        break;
                    default:
                        // Throw error jeje
                }
                result += currentArabicNumber + " ";
            }
            index++;
        }
        return result;
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
