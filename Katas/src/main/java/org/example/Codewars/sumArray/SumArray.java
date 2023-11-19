package org.example.Codewars.sumArray;

import java.util.Arrays;

public class SumArray {

    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}