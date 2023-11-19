package org.example.Hackerrank;


public class TimeConversion {
    public static String timeConversion(String s) {
        String[] parts = s.split(":");
        int hours = Integer.parseInt(parts[0]);
        String minutes = parts[1];
        String secondsAndAmPm = parts[2];

        if (secondsAndAmPm.contains("PM") && hours < 12) {
            hours += 12;
        } else if (secondsAndAmPm.contains("AM") && hours == 12) {
            hours = 0;
        }

        return String.format("%02d:%s:%s", hours, minutes, secondsAndAmPm.substring(0, 2));
    }
}
