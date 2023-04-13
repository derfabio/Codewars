package org.example.findAverage;

import java.util.Arrays;

public class FindAverage {
    public static double findAverage(int[] array) {
        return Arrays.stream(array).average().getAsDouble();
    }
}