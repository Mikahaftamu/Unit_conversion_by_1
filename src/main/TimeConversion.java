package main;

public class TimeConversion {
    public static int convertSecondsToMinutes(int seconds) {
        return seconds / 60;
    }

    public static int convertSecondsToHours(int seconds) {
        int minutes = seconds / 60;
        return minutes / 60;
    }
}
