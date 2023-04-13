package org.example.reverse;


public class Reverse {
    public static String reverseLetter(final String str) {
        String clear = String.join("", str.split("\\P{Alpha}+"));
        StringBuilder builder = new StringBuilder();
        builder.append(clear);
        builder.reverse();
        return builder.toString();
    }
}
