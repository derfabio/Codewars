package org.example.Codewars.powersOfTwo;

public class PowersOfTwo {
    public long[] powersOfTwo(int n) {
        long[] answer = new long[(n + 1)];
        for (int i = 0; i <= n; i++) {
            answer[i] = (long) Math.pow(2, i);
        }
        return answer;
    }
}