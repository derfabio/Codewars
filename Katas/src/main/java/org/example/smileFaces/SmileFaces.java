package org.example.smileFaces;

import java.util.*;

public class SmileFaces {
    public static int countSmileys(List<String> arr) {
        int smileyCount = 0;
            for (String smiley : arr) {
                if (smiley.length() == 2) {
                    if (validEyes(smiley.charAt(0)) && validMouth(smiley.charAt(1))) {
                        smileyCount++;
                    }
                } if (smiley.length() == 3) {
                    if (validEyes(smiley.charAt(0)) && validNose(smiley.charAt(1)) && validMouth(smiley.charAt(2))) {
                        smileyCount++;
                    }
                } else continue;
            }
        return smileyCount;
    }

    public static boolean validEyes(char c) {
        return c == ':' || c == ';';
    }

    public static boolean validNose(char c) {
        return c == '-' || c == '~';
    }

    public static boolean validMouth(char c) {
        return c == ')' || c == 'D';
    }
}
