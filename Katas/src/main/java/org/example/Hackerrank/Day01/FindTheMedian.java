package org.example.Hackerrank.Day01;

import java.util.List;

public class FindTheMedian {
    public static int findMedian(List<Integer> arr) {
        int arraySize = arr.size();
        return arr.stream()
                .sorted()
                .skip(arraySize / 2)
                .findFirst()
                .orElse(0);
    }
}
