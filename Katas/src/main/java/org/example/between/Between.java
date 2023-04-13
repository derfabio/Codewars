package org.example.between;

import java.util.stream.IntStream;

public class Between {

    public static int[] between(int a, int b) {
        return IntStream.rangeClosed(a, b).toArray();
    }
}