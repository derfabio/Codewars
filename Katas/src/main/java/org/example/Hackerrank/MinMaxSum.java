package org.example.Hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        long arraySum = 0;
        for (Integer integer : arr) {
            arraySum += integer;
        }

        long maxValue = arr.get(0);
        for (Integer integer : arr) {
            if (integer > maxValue) {
                maxValue = integer;
            }
        }

        long minValue = arr.get(0);
        for (Integer integer : arr) {
            if (integer < minValue) {
                minValue = integer;
            }
        }
        long minSum = arraySum - maxValue;
        long maxSum = arraySum - minValue;
        System.out.println(minSum + " " + maxSum);
    }
}
