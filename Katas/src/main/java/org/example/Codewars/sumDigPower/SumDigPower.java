package org.example.Codewars.sumDigPower;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {
    public List<Long> sumDigPow(long a, long b) {
    List<Long> results = new ArrayList<>();
        for (long i = a; i <= b; i++) {
        String numStr = Long.toString(i);
        int powerSum = 0;
        for (int j = 0; j < numStr.length(); j++) {
            int digit = Character.getNumericValue(numStr.charAt(j));
            powerSum += Math.pow(digit, j + 1);
        }
        if (powerSum == i) {
            results.add(i);
        }
    }
        return results;
}
}