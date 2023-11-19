package org.example.Codewars.sumOfPositive;

import java.util.Arrays;

public class SumOfPositive {

    public int sum(int[] arr){
        return Arrays.stream(arr).filter(i->i>=0).sum();
    }
}
