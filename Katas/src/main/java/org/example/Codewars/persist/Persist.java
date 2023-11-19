package org.example.Codewars.persist;

public class Persist {
    public static int persistence(long n) {
       int counter = 0;
       if (persistor(n) < 10) {
           counter++;
       } else {
           persistor(persistor(n));

       }
        return counter;
    }

    private static long persistor(long n) {
        long temp = n;
        long product = 1;
        if (n >= 10) {
            while (temp != 0) {
                product = product * (temp % 10);
                temp = temp / 10;
                persistor(temp);
            }
        } else {
            return persistor(n);
        }
        return temp;
    }
}
