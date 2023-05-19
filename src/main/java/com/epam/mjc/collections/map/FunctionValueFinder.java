package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        boolean result = false;

        for (Map.Entry<Integer, Integer> me : functionMap.entrySet()) {
            if (result != true) {
                result = (me.getValue() == requiredValue) ? true : false;
            }
        }
        return result;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : sourceList) {
            map.put(value, (value * 5 + 2));
        }
        return map;
    }
}
