package com.epam.mjc.collections.map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> result = new LinkedHashMap<>();
        if (sentence != "") {
            String[] strArray = sentence.split("\\W+");
            for (String str : strArray) {
                if (result.containsKey(str.toLowerCase())) {
                    result.put(str.toLowerCase(), result.get(str.toLowerCase()) + 1);
                } else {
                    result.put(str.toLowerCase(), 1);
                }
            }
        }
        return result;
    }
}
