package org.example.vowelRemover;

public class VowelRemover {
    public static String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }
}
