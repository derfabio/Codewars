package org.example.roundToTheNextMultipleOf5;

public class RoundToTheNextMultipleOf5 {
    public int roundToNext5(int number) {
        int result = 0;
        switch (number % 10) {
            case 1, -4, -9 -> result = result + 4;
            case 2, 7, -3, -8 -> result = result + 3;
            case 3, 8, -2, -7 -> result = result + 2;
            case 4, 9, -1, -6 -> result++;
        }
        return number+result;
    }
}
