/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abrahamharos.practicauno;

import org.json.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 *
 * @author abrahamharos
 */
enum GrammarType {
    SINGULAR("singular"),
    PLURAL("plural");

    public final String label;

    private GrammarType(String label) {
        this.label = label;
    }
}

public class ToCardinal implements To {

    JSONObject dictionary;

    public ToCardinal() {
        dictionary = FileManager.loadJson("dict.json");
    }

    @Override
    public String to(int i) {
        if (i < 0) {
            return "Error: integer must be positive";
        }
        
        if (i == 0) {
            return "cero";
        }
        
        // `result` is used to build up the numerical text piece by piece.
        String result = "";
        
        // `partialText` is the result of lookups in the dictionary.
        String partialText;
        
        while (i > 0) {
            // Reset `partialText`.
            partialText = "";
            
            // Return early if `i` is found on the dictionary.
            //
            // If this conditional is skipped, then we know for sure
            // that the highest order digit in `i` is not followed
            // by zeros in lower order digits, since that would appear
            // in the dictionary.
            if (this.dictionary.has(Integer.toString(i))) {
                // Get `i`'s text value.
                partialText = this.get(Integer.toString(i), GrammarType.SINGULAR);
                
                // Append `partialText` to `result`.
                result = result.concat(" " + partialText);
                
                return result.trim();
            }
            
            // Take highest order digit value, convert it to text, concatenate
            // the text to `result`, and continue with the value of
            // lower order digits.
            
            // The `order` of the number, AKA the number of digits - 1.
            int order = (int) Math.log10(i);
            
            // `top` contains the value of the highest order digit.
            // For example, if `i` is 9876, then `top` would be 9000.
            int top = (i / (int) Math.pow(10, order)) * (int) Math.pow(10, order);
            
            // `partialText` is the result for `top`'s lookup in the dictionary.
            partialText = this.get(Integer.toString(top), GrammarType.PLURAL);

            // Concatenate 
            result = result.concat(" " + partialText);
            
            // Update `i` to contain the leftover value between `i` and `top`.
            i = i - top;
        }
        
        return result.trim();
    }

    private String get(String integer, GrammarType grammarType) {
        return dictionary.getJSONObject(integer).getString(grammarType.label);
    }
}
