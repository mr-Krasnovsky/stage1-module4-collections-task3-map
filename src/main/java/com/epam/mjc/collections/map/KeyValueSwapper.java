package com.epam.mjc.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> me : sourceMap.entrySet()) {
            if (!(result.containsKey(me.getValue()))) {
                result.put(me.getValue(), me.getKey());
            } else {
                int usedVal = (me.getKey() < result.get(me.getValue())) ? me.getKey() : result.get(me.getValue());
                result.put(me.getValue(), usedVal);
            }
        }
        return result;
    }
}
