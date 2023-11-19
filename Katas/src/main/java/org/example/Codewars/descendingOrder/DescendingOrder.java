package org.example.Codewars.descendingOrder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {
    public int sortDesc(final int num) {
        return Integer.parseInt(
                Arrays.stream((num + "")
                        .split(""))
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.joining()));
    }
}
