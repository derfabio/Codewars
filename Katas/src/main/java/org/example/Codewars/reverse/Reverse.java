package org.example.Codewars.reverse;


public class Reverse {
    public String reverseLetter(final String str) {
        String clear = String.join("", str.split("\\P{Alpha}+"));
        StringBuilder builder = new StringBuilder();
        builder.append(clear);
        builder.reverse();
        return builder.toString();
    }
}
