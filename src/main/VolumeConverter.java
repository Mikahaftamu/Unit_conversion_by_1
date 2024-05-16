package main;

public class VolumeConverter {
    public static double litreToMilliliter(double litre) {
        return litre * 1000;
    }

    public static double milliliterToLitre(double milliliter) {
        return milliliter / 1000;
    }

    public static double litreToCubicMeter(double litre) {
        return litre / 1000;
    }

    public static double cubicMeterToLitre(double cubicMeter) {
        return cubicMeter * 1000;
    }

    public static double litreToCubicCentimeter(double litre) {
        return litre * 1000;
    }

    public static double cubicCentimeterToLitre(double cubicCentimeter) {
        return cubicCentimeter / 1000;
    }

    public static double milliliterToCubicCentimeter(double milliliter) {
        return milliliter;
    }

    public static double cubicCentimeterToMilliliter(double cubicCentimeter) {
        return cubicCentimeter;
    }

    public static double cubicCentimeterToCubicMeter(double cubicCentimeter) {
        return cubicCentimeter / 1000000;
    }

    public static double cubicMeterToCubicCentimeter(double cubicMeter) {
        return cubicMeter * 1000000;
    }

    public static double cubicMeterToMilliliter(double cubicMeter) {
        return cubicMeter * 1000000;
    }

    public static double milliliterToCubicMeter(double milliliter) {
        return milliliter / 1000000;
    }
}