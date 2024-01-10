package model;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class LetterCounterModel {
    private Map<Character, Integer> letterCounts;
    private Map<String, Integer> wordCounts;

    public LetterCounterModel() {
        letterCounts = new HashMap<>();
        wordCounts = new HashMap<>();
    }

    public void countLettersAndWords(String input) {
        StringTokenizer tokenizer = new StringTokenizer(input);

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().replaceAll("[^a-zA-Z]", ""); 
            if(!word.isEmpty()){
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);

                for (char letter : word.toCharArray()) {
                    letterCounts.put(letter, letterCounts.getOrDefault(letter, 0) + 1);
            }
        }
    }
}
    public Map<Character, Integer> getLetterCounts() {
        return letterCounts;
    }

    public Map<String, Integer> getWordCounts() {
        return wordCounts;
    }
}