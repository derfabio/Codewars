package main.java.org.example.paperWork;

public class PaperWork {
    public static int paperWork(int n, int m)
    {
        return (n < 0) || (m < 0) ? 0 : n * m;
    }
}
