package org.example.highestScoringWord;

import java.util.List;

public class HighestScoringWord {
    public String high(String s) {
        List<String> words = List.of(s.split(" "));
        String highestScoringWord = "";
        int highestScore = 0;

        for (String word: words) {
            int score = calculateScore(word);
            if (score > highestScore || (score == highestScore && s.indexOf(word) < s.indexOf(highestScoringWord))) {
                highestScore = score;
                highestScoringWord = word;
            }
        }
        return highestScoringWord;
    }

    public static int calculateScore(String word) {
        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            score += word.charAt(i) - 'a' + 1;
        }
        return score;
    }
}
