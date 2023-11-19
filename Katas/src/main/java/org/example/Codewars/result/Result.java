package org.example.Codewars.result;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Result {

    /*
     * Complete the 'getSearchResults' function below.
     *
     * The function is expected to return a 2D_STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY words
     *  2. STRING_ARRAY queries
     */

    public static List<List<String>> getSearchResults(List<String> words, List<String> queries) {
        Map<String, List<String>> anagramMap = words.stream()
                .collect(Collectors.groupingBy(
                        word -> Arrays.stream(word.split("")).sorted().collect(Collectors.joining())
                ));

        return queries.stream()
                .map(query -> {
                    String sortedQuery = Arrays.stream(query.split("")).sorted().collect(Collectors.joining());
                    return anagramMap.getOrDefault(sortedQuery, Collections.emptyList())
                            .stream()
                            .sorted()
                            .collect(Collectors.toList());
                })
                .collect(Collectors.toList());
    }

    public static int getAnagram(String s) {
        int n = s.length();
        String firstHalf = s.substring(0, n / 2);
        String secondHalf = s.substring(n / 2);

        // Create frequency maps for both halves using Streams
        Map<Character, Long> firstHalfFreqMap = firstHalf.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Character, Long> secondHalfFreqMap = secondHalf.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int operations = IntStream.range('0', '9' + 1)
                .mapToObj(c -> (char) c)
                .mapToInt(digit -> {
                    long firstHalfCount = firstHalfFreqMap.getOrDefault(digit, 0L);
                    long secondHalfCount = secondHalfFreqMap.getOrDefault(digit, 0L);
                    return Math.max(0, (int) (firstHalfCount - secondHalfCount));
                })
                .sum();

        return operations;
    }
}
