package org.example.Codewars.betweenExtremes;

import java.util.*;
import java.util.stream.IntStream;

public class BetweenExtremes {
    public static int betweenExtremes(int[] numbers) {
        IntSummaryStatistics statistics = IntStream.of(numbers).summaryStatistics();
        return statistics.getMax() - statistics.getMin();
    }
}
