/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abrahamharos.practicauno;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

/**
 *
 * @author oscarrodriguez
 */
public class FileManager {
    public static JSONObject loadJson(String _path) {
        try {
            Path path = Path.of(_path);
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
