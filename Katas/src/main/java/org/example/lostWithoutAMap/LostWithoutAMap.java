package org.example.lostWithoutAMap;

import java.util.Arrays;

public class LostWithoutAMap {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(i->i*2).toArray();
    }
}