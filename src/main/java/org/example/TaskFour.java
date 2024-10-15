package org.example;

import java.util.HashMap;
import java.util.Map;

public class TaskFour {

    TaskFour(String text) {

        String clearedText = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] words = clearedText.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Результат: ");
        System.out.println(wordCount);
    }

}
