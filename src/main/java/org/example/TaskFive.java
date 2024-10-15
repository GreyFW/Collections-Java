package org.example;

import java.util.HashMap;
import java.util.Map;

public class TaskFive {
    // Map<K, V> -> Map<V, K>

    public Map<String, Integer> swapKeysValues(Map<Integer, String> input) {
        Map<String, Integer> swapped = new HashMap<>();

        for (Map.Entry<Integer, String> entry : input.entrySet()) {
            swapped.put(entry.getValue(), entry.getKey());
        }

        return swapped;
    }
}
