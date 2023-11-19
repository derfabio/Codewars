package org.example.Codewars.countBy;

import java.util.stream.IntStream;

public class CountBy {
    public static int[] countBy(int x, int n) {
        return IntStream.rangeClosed(1, n)
                .map(i -> i * x)
                .toArray();
    }
}
