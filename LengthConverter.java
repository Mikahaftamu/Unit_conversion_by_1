public class LengthConverter {
    public static double convertFromMeters(double meters, String unit) {
        unit = unit.toLowerCase();

        switch (unit) {
            case "m":
            case "meter":
            case "meters":
                return meters;
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
            case "ft":
            case "foot":
            case "feet":
                return meters / 0.3048;
            case "in":
            case "inch":
            case "inches":
                return meters / 0.0254;
            case "yd":
            case "yard":
            case "yards":
                return meters / 0.9144;
            default:
                throw new IllegalArgumentException("Invalid unit: " + unit);
        }
    }

    public static double convertFromKilometer(double kilo, String unit) {
        unit = unit.toLowerCase();

        switch (unit) {
            case "m":
            case "meter":
            case "meters":
                return kilo * 1000;
            case "cm":
            case "centimeter":
            case "centimeters":
                return kilo * 10000;
            case "mm":
            case "millimeter":
            case "millimeters":
                return kilo * 1000000;
            case "mile":
            case "ml":
                return kilo * 0.621 ;
           
            default:
                throw new IllegalArgumentException("Invalid unit: " + unit);
        }
    }

    public static double convertFromcentimeter(double cm, String unit) {
        unit = unit.toLowerCase();

        switch (unit) {
            case "m":
            case "meter":
            case "meters":
                return cm / 100;
            
            case "mm":
            case "millimeter":
            case "millimeters":
                return cm * 10;
            case "kilo":
            case "kilometer":
                return cm /1000 ;
           
            default:
                throw new IllegalArgumentException("Invalid unit: " + unit);
        }
    }

}