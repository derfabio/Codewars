package org.example.Codewars.grasshopperGradeBook;

public class GrasshopperGradeBook {
    public char getGrade(int s1, int s2, int s3) {
        float score = (s1+s2+s3) / 3;
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
