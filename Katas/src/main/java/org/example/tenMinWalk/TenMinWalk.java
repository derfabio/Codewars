package org.example.tenMinWalk;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        return validLength(walk) && validDirections(walk);
    }

    public static boolean validDirections(char[] walk) {
        int horizontal = 0;
        int vertical = 0;
        for (char direction : walk) {
            if (direction == 'e') {
                horizontal++;
            }
            if (direction == 'w') {
                horizontal--;
            }
            if (direction == 'n') {
                vertical++;
            }
            if (direction == 's') {
                vertical--;
            }
        }
        return (horizontal == 0) && (vertical == 0);
    }

    public static boolean validLength(char[] walk) {
        return (walk.length == 10);
    }
}