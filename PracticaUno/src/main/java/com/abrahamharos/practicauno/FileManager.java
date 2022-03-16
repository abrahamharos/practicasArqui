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
    public enum File {
        DICT_JSON("dict.json");
        
        public final String name;
        
        private File(String name) {
            this.name = name;
        }
    }
    
    public static JSONObject loadJson(File file) throws IOException {
        return JSONFileManager.load(file.name);
    }
}
