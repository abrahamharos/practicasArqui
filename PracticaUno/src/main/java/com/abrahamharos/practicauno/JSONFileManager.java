/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.abrahamharos.practicauno;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.json.JSONObject;

/**
 *
 * @author Santiago Díaz Guevara
 */
public class JSONFileManager {
    public static JSONObject load(String strPath) throws IOException {
        try {
            Path path = Path.of(strPath);
            String sDict = Files.readString(path);
            JSONObject obj = new JSONObject(sDict);
            return obj;
        } catch (IOException ex) {
            throw ex;
        }
    }
}
