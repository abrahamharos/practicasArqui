/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abrahamharos.practicauno;

import java.io.FileReader;
import org.json.*;

/**
 *
 * @author abrahamharos
 */
public class ToCardinal implements To {
    String jsonDict = """
                      {
                        "1": {
                          "singular": "uno",
                          "plural": "uno"
                        },
                        "2": {
                          "singular": "dos",
                          "plural": "dos"
                        },
                        "3": {
                          "singular": "tres",
                          "plural": "tres"
                        },
                        "4": {
                          "singular": "cuatro",
                          "plural": "cuatro"
                        },
                        "5": {
                          "singular": "cinco",
                          "plural": "cinco"
                        },
                        "6": {
                          "singular": "seis",
                          "plural": "seis"
                        },
                        "7": {
                          "singular": "siete",
                          "plural": "siete"
                        },
                        "8": {
                          "singular": "ocho",
                          "plural": "ocho"
                        },
                        "9": {
                          "singular": "nueve",
                          "plural": "nueve"
                        },
                        "10": {
                          "singular": "diez",
                          "plural": "dieci"
                        },
                        "11": {
                          "singular": "once",
                          "plural": "once"
                        },
                        "12": {
                          "singular": "doce",
                          "plural": "doce"
                        },
                        "13": {
                          "singular": "trece",
                          "plural": "trece"
                        },
                        "14": {
                          "singular": "catorce",
                          "plural": "catorce"
                        },
                        "15": {
                          "singular": "quince",
                          "plural": "quince"
                        },
                        "20": {
                          "singular": "veinte",
                          "plural": "veinti"
                        },
                        "30": {
                          "singular": "treinta",
                          "plural": "treinta y"
                        },
                        "40": {
                          "singular": "cuarenta",
                          "plural": "cuarenta y"
                        },
                        "50": {
                          "singular": "cincuenta",
                          "plural": "cincuenta y"
                        },
                        "60": {
                          "singular": "sesenta",
                          "plural": "sesenta y"
                        },
                        "70": {
                          "singular": "setenta",
                          "plural": "setenta y"
                        },
                        "80": {
                          "singular": "ochenta",
                          "plural": "ochenta y"
                        },
                        "90": {
                          "singular": "noventa",
                          "plural": "noventa y"
                        },
                        "100": {
                          "singular": "cien",
                          "plural": "ciento"
                        },
                        "200": {
                          "singular": "doscientos",
                          "plural": "doscientos"
                        },
                        "300": {
                          "singular": "trescientos",
                          "plural": "trescientos"
                        },
                        "400": {
                          "singular": "cuatrocientos",
                          "plural": "cuatrocientos"
                        },
                        "500": {
                          "singular": "quinientos",
                          "plural": "quinientos"
                        },
                        "600": {
                          "singular": "seiscientos",
                          "plural": "seiscientos"
                        },
                        "700": {
                          "singular": "setecientos",
                          "plural": "seiscientos"
                        },
                        "800": {
                          "singular": "ochocientos",
                          "plural": "ochocientos"
                        },
                        "900": {
                          "singular": "novecientos",
                          "plural": "novecientos"
                        },
                        "1000": {
                          "singular": "mil",
                          "plural": "mil"
                        },
                        "2000": {
                          "singular": "dos mil",
                          "plural": "dos mil"
                        },
                        "3000": {
                          "singular": "tres mil",
                          "plural": "tres mil"
                        },
                        "4000": {
                          "singular": "cuatro mil",
                          "plural": "cuatro mil"
                        },
                        "5000": {
                          "singular": "cinco mil",
                          "plural": "cinco mil"
                        },
                        "6000": {
                          "singular": "seis mil",
                          "plural": "seis mil"
                        },
                        "7000": {
                          "singular": "siete mil",
                          "plural": "siete mil"
                        },
                        "8000": {
                          "singular": "ocho mil",
                          "plural": "ocho mil"
                        },
                        "9000": {
                          "singular": "nueve mil",
                          "plural": "nueve mil"
                        }
                      }
                      """;
    
    @Override
    public String to(int i) {
        JSONObject obj = new JSONObject(jsonDict);
        String noventa = obj.getJSONObject("90").getString("plural");
        
        
        return "";
    }
    
}
