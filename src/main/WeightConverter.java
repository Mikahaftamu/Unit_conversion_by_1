package main;

public class WeightConverter {

    public static double kilogramToGram(double kilogram) {
        return kilogram * 1000;
    }

    public static double gramToKilogram(double gram) {
        return gram / 1000;
    }
    public static double milligramToGram(double milligram) {
        return milligram / 1000;
    }

    public static double gramToMilligram(double gram) {
        return gram * 1000;
    }
    public static double milligramToKilogram(double milligram) {
        return milligram / 1_000_000;
    }

    public static double kilogramToMilligram(double kilogram) {
        return kilogram * 1_000_000;
    }
    public static double poundToKilogram(double pound) {
        return pound * 0.453592;
    }

    public static double kilogramToPound(double kilogram) {
        return kilogram / 0.453592;
    }
    public static double poundToGram(double pound) {
        return pound * 453.592;
    }

    public static double gramToPound(double gram) {
        return gram / 453.592;
    }
  
}