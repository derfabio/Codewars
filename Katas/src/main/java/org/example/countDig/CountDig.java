package org.example.countDig;

import java.util.ArrayList;
import java.util.List;

public class CountDig {
    public int nbDig(int n, int d) {
        List<Integer> s = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            s.add((int)Math.pow(i, 2));
        int count = 0;
        for (int number : s) {
            String numberAsString = String.valueOf(number);
            for (int i = 0; i < numberAsString.length(); i++) {
                int digit = Character.getNumericValue(numberAsString.charAt(i));
                if (digit == d) {
                    count++;
                }
            }
        }
        return count;
    }
}