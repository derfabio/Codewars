package org.example.sumarrays;

import java.util.Arrays;

public class SumArrays {

    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}