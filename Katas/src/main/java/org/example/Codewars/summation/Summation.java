package org.example.Codewars.summation;

import java.util.stream.IntStream;

public class Summation {
    public static int summation(int n) {
        return IntStream.rangeClosed(1, n).sum();
    }
}
