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
        // Early exit if value exists in dictionary.
        if (dictionary.has(Integer.toString(i))) {
            return this.get(Integer.toString(i), GrammarType.SINGULAR);
        }

        int current, partialSum = 0, order = 0;
        List<String> result = new ArrayList<>();

        while (i > 0) {
            current = (i % 10) * (int) Math.pow(10, order);
            partialSum += current;

            if (current != 0) {
                result.add(this.get(Integer.toString(current), partialSum > 0 ? GrammarType.PLURAL : GrammarType.SINGULAR));
            }

            String partialSumString = Integer.toString(partialSum);
            if (dictionary.has(partialSumString)) {
                result = result.subList(0, Math.max(0, result.size() - partialSumString.length()));
                result.add(this.get(partialSumString, GrammarType.SINGULAR));
            }

            i /= 10;
            ++order;
        }

        Collections.reverse(result);
        return String.join(" ", result);
    }

    private String get(String integer, GrammarType grammarType) {
        return dictionary.getJSONObject(integer).getString(grammarType.label);
    }
}
