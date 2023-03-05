package org.example.highestScoringWord;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HighestScoringWord {
    public String high(String s) {
        return Arrays.stream(s.split("\\s+"))
                .max(Comparator.comparingInt(HighestScoringWord::calculateScore)
                .thenComparingInt(s::indexOf))
                .orElse("");
    }

    public static int calculateScore(String word) {
        return word.chars().map(c -> c - 'a' + 1).sum();
    }
}
