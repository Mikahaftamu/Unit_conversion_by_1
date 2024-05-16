package main;

public class TimeConversion {
    public static int convertSecondsToMinutes(int seconds) {
        return seconds / 60;
    }

    public static int convertSecondsToHours(int seconds) {
        int minutes = seconds / 60;
        return minutes / 60;
    }

    public static int convertMinutesToSeconds(int minutes) {
        return minutes * 60;
    }

    public static int convertMinutesToHours(int minutes) {
        return minutes / 60;
    }

    public static int convertHoursToMinutes(int hours) {
        return hours * 60;
    }

    public static int convertHoursToSeconds(int hours) {
        return hours * 3600;
    }

    public static void main(String[] args) {
        int seconds = 3661; // input time in seconds
        int minutes = convertSecondsToMinutes(seconds); // convert to minutes
        int hours = convertMinutesToHours(minutes); // convert to hours
        int remainingMinutes = minutes % 60; // calculate remaining minutes
        int remainingSeconds = seconds % 60; // calculate remaining seconds

        System.out.println(seconds + " seconds is equal to " + hours + " hours, " + remainingMinutes + " minutes, and "
                + remainingSeconds + " seconds.");

        int inputMinutes = 61; // input time in minutes
        int inputHours = 2; // input time in hours

        int minutesToSeconds = convertMinutesToSeconds(inputMinutes); // convert minutes to seconds
        int hoursToSeconds = convertHoursToSeconds(inputHours); // convert hours to seconds

        System.out.println(inputMinutes + " minutes is equal to " + minutesToSeconds + " seconds.");
        System.out.println(inputHours + " hours is equal to " + hoursToSeconds + " seconds.");
    }
}
