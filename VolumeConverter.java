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

    public static void main(String[] args) {
        double litre = 1.0;

        double milliliter = litreToMilliliter(litre);
        double litreFromMilliliter = milliliterToLitre(milliliter);
        double cubicMeter = litreToCubicMeter(litre);
        double litreFromCubicMeter = cubicMeterToLitre(cubicMeter);
        double cubicCentimeter = litreToCubicCentimeter(litre);
        double litreFromCubicCentimeter = cubicCentimeterToLitre(cubicCentimeter);
        double cubicCentimeterFromMilliliter = milliliterToCubicCentimeter(milliliter);
        double milliliterFromCubicCentimeter = cubicCentimeterToMilliliter(cubicCentimeter);
        double cubicCentimeterFromCubicMeter = cubicMeterToCubicCentimeter(cubicMeter);
        double cubicMeterFromCubicCentimeter = cubicCentimeterToCubicMeter(cubicCentimeter);
        double cubicMeterFromMilliliter = milliliterToCubicMeter(milliliter);
        double milliliterFromCubicMeter = cubicMeterToMilliliter(cubicMeter);

        System.out.println(litre + " litre is equal to " + milliliter + " milliliters.");
        System.out.println(milliliter + " milliliters is equal to " + litreFromMilliliter + " litre.");
        System.out.println(litre + " litre is equal to " + cubicMeter + " cubic meters.");
        System.out.println(cubicMeter + " cubic meters is equal to " + litreFromCubicMeter + " litre.");
        System.out.println(litre + " litre is equal to " + cubicCentimeter + " cubic centimeters.");
        System.out.println(cubicCentimeter + " cubic centimeters is equal to " + litreFromCubicCentimeter + " litre.");
        System.out.println(
                milliliter + " milliliters is equal to " + cubicCentimeterFromMilliliter + " cubic centimeters.");
        System.out.println(
                cubicCentimeter + " cubic centimeters is equal to " + milliliterFromCubicCentimeter + " milliliters.");
        System.out.println(
                cubicCentimeter + " cubic centimeters is equal to " + cubicMeterFromCubicCentimeter + " cubic meters.");
        System.out.println(
                cubicMeter + " cubic meters is equal to " + cubicCentimeterFromCubicMeter + " cubic centimeters.");
        System.out.println(cubicMeter + " cubic meters is equal to " + milliliterFromCubicMeter + " milliliters.");
        System.out.println(milliliter + " milliliters is equal to " + cubicMeterFromMilliliter + " cubic meters.");
    }
}
