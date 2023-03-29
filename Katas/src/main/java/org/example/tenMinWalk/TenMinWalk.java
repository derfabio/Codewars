package org.example.tenMinWalk;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        return validSteps(walk) && validDirections(walk);
    }

    public static boolean validDirections(char[] walk) {
        int horizontal = 0;
        int vertical = 0;
        for (char direction : walk) {
            switch (direction) {
                case 'e' -> horizontal++;
                case 'w' -> horizontal--;
                case 'n' -> vertical++;
                case 's' -> vertical--;
            }
        }
        return (horizontal == 0) && (vertical == 0);
    }

    public static boolean validSteps(char[] walk) {
        return (walk.length == 10);
    }
}