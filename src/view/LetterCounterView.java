package view;

import java.util.Map;

public class LetterCounterView {
    public void displayLetterCounts(Map<Character, Integer> letterCounts) {
        System.out.print("{");
        for (Map.Entry<Character, Integer> entry : letterCounts.entrySet()) {
            System.out.print(entry.getKey() + " = " + entry.getValue() + ", ");
        }
        System.out.println("}");
    }

    public void displayWordCounts(Map<String, Integer> wordCounts) {
        System.out.print("{");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.print(entry.getKey() + " = " + entry.getValue() + ", ");
        }
        System.out.println("}");
    }
}