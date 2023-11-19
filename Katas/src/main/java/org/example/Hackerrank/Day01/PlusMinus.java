package org.example.Hackerrank.Day01;

import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        for (Integer integer : arr) {
            if (integer == 0) {
                zeroCount++;
            }
            if (integer > 0) {
                positiveCount++;
            }
            if (integer < 0) {
                negativeCount++;
            }
        }
        double positiveRatio = calculateRatio(positiveCount, arr.size());
        double negativeRatio = calculateRatio(negativeCount, arr.size());
        double zeroRatio = calculateRatio(zeroCount, arr.size());
        System.out.println(positiveRatio);
        System.out.println(negativeRatio);
        System.out.println(zeroRatio);
    }

    static double calculateRatio(int count, int arraySize) {
        return(double) Math.round(( (double) count /arraySize)*100000d)/100000d;
    }
}
