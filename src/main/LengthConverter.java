package main;
public class LengthConverter {
    public static double convertFromMeters(double meters, String unit) {
        unit = unit.toLowerCase();

        switch (unit) {
            case "km":
            case "kilometer":
            case "kilometers":
                return meters / 1000;
            case "cm":
            case "centimeter":
            case "centimeters":
                return meters * 100;
            case "mm":
            case "millimeter":
            case "millimeters":
                  return meters * 1000;
            default:
                throw new IllegalArgumentException("Invalid unit: " + unit);
        }
    }

}