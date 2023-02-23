package org.example.sumarray;

import java.util.Arrays;

public class SumArray {

    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}